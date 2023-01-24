public class Taxation {
    protected int taxRate;

    protected double calculateTaxAmount(double billAmount) {
        double taxAmount = billAmount * taxRate / 100;
        return taxAmount;
    }
}

