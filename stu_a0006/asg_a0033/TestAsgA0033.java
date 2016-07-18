import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0033{
public static double delta=1e-15;   
 @Test
        public void test_01() {
            AsgA0033 obj  = new AsgA0033();
            double temp = obj.km(1);
            assertEquals(temp, 3280.84,delta);
        }
    @Test
        public void test_02() {
            AsgA0033 obj = new AsgA0033();
            double temp = obj.km(100);
            assertEquals(temp, 328084,delta);
        }


    @Test
        public void test_03() {
            AsgA0033 obj = new AsgA0033();
            double temp = obj.km(0);
            assertEquals(temp, 0,delta);
        }

    @Test
        public void test_04() {
            AsgA0033 obj = new AsgA0033();
            double temp = obj.km(-1);
            assertEquals(temp, -3280.84,delta);
        }
}
