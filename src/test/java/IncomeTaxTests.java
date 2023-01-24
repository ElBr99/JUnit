import org.junit.jupiter.api.Assertions;

public class IncomeTaxTests {
    @org.junit.jupiter.api.Test
    public void testIncomeTax_correctCalculation() {
        double bill = 100;
        double expected = 13;
        IncomeTax incomeTax= new IncomeTax();

        double actual = incomeTax.calculateTaxAmount(bill);

        Assertions.assertEquals(actual, expected);
    }
}
