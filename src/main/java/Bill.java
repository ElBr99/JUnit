public class Bill {
    private double billAmount;
    Taxation taxation;

    public Bill(Taxation taxation, double billAmount) {
        this.taxation = taxation;
        this.billAmount = billAmount;
    }

    public double getTaxAmount() {
        return taxation.calculateTaxAmount(billAmount);
    }
}

