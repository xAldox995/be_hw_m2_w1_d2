package aldovalzani.be_hw_m2_w1_d2;

import aldovalzani.be_hw_m2_w1_d2.testClasses.CalculatorClass;
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

}
