import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0033{
public static double DELTA = 1e-8;
    @Test
        public void test_01() {
            AsgA0033 obj  = new AsgA0033();
            double temp = obj.convert_kms_to_feet(1);
            assertEquals(temp, 3280.84 ,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0033 obj = new AsgA0033();
            double temp = obj.convert_kms_to_feet(100);
            assertEquals(temp, 328084,DELTA);
        }

    @Test
        public void test_03() {
            AsgA0033 obj = new AsgA0033();
            double temp = obj.convert_kms_to_feet(0);
            assertEquals(temp, 0,DELTA);
        }
    
    @Test
        public void test_04() {
            AsgA0033 obj = new AsgA0033();
            double temp = obj.convert_kms_to_feet(-1);
            assertEquals(temp, -3280.84,DELTA);
        }
}
