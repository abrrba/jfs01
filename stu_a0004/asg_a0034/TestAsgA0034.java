import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0034{
    @Test
        public void test_01() {
            AsgA0034 obj  = new AsgA0034();
            double temp = obj.convert_kms_to_mms(1);
            assertEquals(temp, 1000000);
        }
    @Test
        public void test_02() {
            AsgA0034 obj = new AsgA0034();
            double temp = obj.convert_kms_to_mms(-1);
            assertEquals(temp, -1000000);
        }

    @Test
        public void test_03() {
            AsgA0034 obj = new AsgA0034();
            double temp = obj.convert_kms_to_mms(0);
            assertEquals(temp, 0);
        }
}
