import org.junit.jupiter.api.Assertions;

public class ProgressiveTaxTestsCaseTwo {
    @org.junit.jupiter.api.Test
    public void testProgressiveTax_Case2_correctCalculation() {
        double bill = 1_000_000;
        double expected = 150_000;
        ProgressiveTax progressiveTax_= new ProgressiveTax();

        double actual = progressiveTax_.calculateTaxAmount(bill);

        Assertions.assertEquals(actual, expected);

    }
}
