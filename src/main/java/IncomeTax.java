
public class IncomeTax extends Taxation {
    public IncomeTax() {
        super();
        taxRate = 13;
    }

    @Override
    public double calculateTaxAmount(double billAmount) {
        double taxAmount = billAmount * taxRate / 100;
        return taxAmount;
    }
}

