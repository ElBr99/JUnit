public class ProgressiveTax extends Taxation {
    private int taxRate_2 = 15;

    public ProgressiveTax() {
        super();
        taxRate = 10;
        taxRate_2 = 15;
    }

    @Override
    public double calculateTaxAmount(double billAmount) {
        if (billAmount <= 100_000) {
            double taxAmount = billAmount * taxRate / 100;
            return taxAmount;
        } else {
            double taxAmount = billAmount * taxRate_2 / 100;
            return taxAmount;
        }
    }
}

