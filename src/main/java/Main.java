
public class Main {
    public static void main(String[] args) {
        Taxation taxation = new IncomeTax();
        Taxation firstTaxation = new VAT();
        Taxation secondTaxation = new ProgressiveTax();
        Bill[] bills = new Bill[]{
                new Bill(taxation, 150_000),
                new Bill(firstTaxation, 960_000),
                new Bill(secondTaxation, 85_000),
                new Bill(secondTaxation, 185_000)};
        for (int i = 0; i < bills.length; i++) {
            System.out.println("Уплачен налог в размере:" + bills[i].getTaxAmount());
        }
    }
}

