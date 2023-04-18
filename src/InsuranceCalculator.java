/**
 * Used to calculate insurance
 */
public class InsuranceCalculator {

    private double minusFactor, productFactor, additionFactor;

    public InsuranceCalculator(double minusFactor, double productFactor, double additionFactor) {
        this.minusFactor = minusFactor;
        this.productFactor = productFactor;
        this.additionFactor = additionFactor;
    }

    public double execute(double income) {
        return (income - minusFactor) * productFactor + additionFactor;
    }

}
