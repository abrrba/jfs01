import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0032{
public static double DELTA = 1E-15;
    @Test
        public void test_01() {
            AsgA0032 obj  = new AsgA0032();
            double temp = obj.convert_kms_to_meter(1000);
            assertEquals(temp, 1000000,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0032 obj = new AsgA0032();
            double temp = obj.convert_kms_to_meter(-1000);
            assertEquals(temp,-1000000,DELTA);
        }

    @Test
        public void test_03() {
            AsgA0032 obj = new AsgA0032();
            double temp = obj.convert_kms_to_meter(0);
            assertEquals(temp, 0,DELTA);
        }

  }
