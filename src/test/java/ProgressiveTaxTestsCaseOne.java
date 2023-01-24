import org.junit.jupiter.api.Assertions;

public class ProgressiveTaxTestsCaseOne {
    @org.junit.jupiter.api.Test
    public void testProgressiveTax_Case1_correctCalculation() {
        double bill = 100;
        double expected = 10;
        ProgressiveTax progressiveTax= new ProgressiveTax();

        double actual = progressiveTax.calculateTaxAmount(bill);

        Assertions.assertEquals(actual, expected);
    }
}
