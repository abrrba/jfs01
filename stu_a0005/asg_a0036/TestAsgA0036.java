import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0036{
public static double DELTA = 1e-15;
    @Test
        public void test_01() {
            AsgA0036 obj  = new AsgA0036();
            double temp = obj.convert_fahrenheit_to_celsius(68);
            assertEquals(temp, 20,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0036 obj = new AsgA0036();
            double temp = obj.convert_fahrenheit_to_celsius(-68);
            assertEquals(temp,-55.55555555555556,DELTA);
        }

    @Test
        public void test_03() {
            AsgA0036 obj = new AsgA0036();
            double temp = obj.convert_fahrenheit_to_celsius(0);
            assertEquals(temp, -17.77777777777778,DELTA);
        }

  @Test
        public void test_04() {
            AsgA0036 obj = new AsgA0036();
            double temp = obj.convert_fahrenheit_to_celsius(32);
            assertEquals(temp, 0,DELTA);
        }


}
