public class Main {
    public static double calculateInsurance(double income) {
        if (income <= 10000) {
            return income * 0.365;
        } else if (income <= 30000) {
            return (income - 10000) * 0.2 + 35600;
        } else if (income <= 60000) {
            return (income - 30000) * 0.1 + 76500;
        } else {
            return (income - 60000) * 0.02 + 105600;
        }
    }

    public static void main(String[] args) {
        double income = 50000;

        InsuranceCalculator insuranceCalculator = InsuranceCalculatorFactory.getInsuranceCalculator(income)
                .orElseThrow(() -> new IllegalArgumentException("Invalid income"));
        double insurance = insuranceCalculator.execute(income);

        System.out.println(insurance);
        System.out.println(calculateInsurance(income));
    }
}