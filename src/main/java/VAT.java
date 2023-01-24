
public class VAT extends Taxation {
    public VAT() {
        super();
        taxRate = 20;
    }

    @Override
    public double calculateTaxAmount(double billAmount) {
        return billAmount * taxRate / 100;
    }
}

