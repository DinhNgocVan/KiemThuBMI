import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BMITest {
    float weight = 10;
    float height = 90;

    BMI bmiTest = new BMI(weight, height);

    @Test
    public void testBMI() {
        assertEquals("khong hop le", bmiTest.run());
    }
}
