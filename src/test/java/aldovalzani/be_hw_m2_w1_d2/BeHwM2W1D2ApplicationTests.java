package aldovalzani.be_hw_m2_w1_d2;

import aldovalzani.be_hw_m2_w1_d2.testClasses.CalculatorClass;
import aldovalzani.be_hw_m2_w1_d2.testClasses.UtilityArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeHwM2W1D2ApplicationTests {

    @Test
    public void testSomma() {
        CalculatorClass calcolatrice = new CalculatorClass();
        int result = calcolatrice.sum(1, 6);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void testElSearch() {
        String[] array = {"Java", "Css", "Html", "JS"};
        UtilityArray utility = new UtilityArray();
        Assertions.assertTrue(utility.elSearch(array, "Java"));
        Assertions.assertFalse(utility.elSearch(array, "React"));
    }

    @Test

}
