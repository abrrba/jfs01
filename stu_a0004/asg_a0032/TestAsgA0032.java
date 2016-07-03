import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0032{
    @Test
        public void test_01() {
            AsgA0032 obj  = new AsgA0032();
            double temp = obj.convert_kms_to_mts(1000);
            assertEquals(temp, 1000000);
        }
    @Test
        public void test_02() {
            AsgA0032 obj = new AsgA0032();
            double temp = obj.convert_kms_to_mts(-1000);
            assertEquals(temp, -1000000);
        }

    @Test
        public void test_03() {
            AsgA0032 obj = new AsgA0032();
            double temp = obj.convert_kms_to_mts(0);
            assertEquals(temp, 0);
        }
}
