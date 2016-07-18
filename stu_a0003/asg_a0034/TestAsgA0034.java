import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0034{
public static double DELTA = 1e-8;
    @Test
        public void test_01() {
            AsgA0034 obj  = new AsgA0034();
            double temp = obj.convert_kms_to_mml(1);
            assertEquals(temp, 1000000,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0034 obj = new AsgA0034();
            double temp = obj.convert_kms_to_mml(10);
            assertEquals(temp, 10000000,DELTA);
        }

    @Test
        public void test_03() {
            AsgA0034 obj = new AsgA0034();
            double temp = obj.convert_kms_to_mml(0);
            assertEquals(temp, 0,DELTA);
        }
    
    @Test
        public void test_04() {
            AsgA0034 obj = new AsgA0034();
            double temp = obj.convert_kms_to_mml(-1);
            assertEquals(temp, -1000000,DELTA);
        }
}
