import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/*
Factory class used to return an instance of InsuranceCalculator.java
 */
public class InsuranceCalculatorFactory {

    // Use this to add any more income levels
    static LinkedHashMap<Double, InsuranceCalculator> calculateInsuranceMap = new LinkedHashMap<>();

    static {
        calculateInsuranceMap.put(10000.0, new InsuranceCalculator(0, 0.365, 0));
        calculateInsuranceMap.put(30000.0, new InsuranceCalculator(10000, 0.2, 35600));
        calculateInsuranceMap.put(60000.0, new InsuranceCalculator(30000, 0.1, 76500));
        calculateInsuranceMap.put(Double.MAX_VALUE, new InsuranceCalculator(60000, 0.02, 105600));
    }

    public static Optional<InsuranceCalculator> getInsuranceCalculator(double income) {
        for (Map.Entry<Double, InsuranceCalculator> entry : calculateInsuranceMap.entrySet()) {
            double incomeThreshold = entry.getKey();
            if (income <= incomeThreshold) return Optional.ofNullable(entry.getValue());
        }
        return Optional.empty();
    }
}
