import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0033{
    @Test
        public void test_01() {
            AsgA0033 obj  = new AsgA0033();
            double temp = obj.kms_to_feet(1);
            assertEquals(temp, 3280.74);
        }
    @Test
        public void test_02() {
            AsgA0033 obj = new AsgA0033();
            double temp = obj.kms_to_feet(100);
            assertEquals(temp, 328074);
        }

    @Test
        public void test_03() {
            AsgA0033 obj = new AsgA0033();
            double temp = obj.kms_to_feet(0);
            assertEquals(temp, 0);
        }
    
    @Test
        public void test_04() {
            AsgA0033 obj = new AsgA0033();
            double temp = obj.kms_to_feet(-1);
            assertEquals(temp, -3280.74);
        }
}
