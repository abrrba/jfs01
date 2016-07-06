import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0125{
public static double DELTA = 1e-15;
    @Test
        public void test_01() {
            AsgA0125 obj  = new AsgA0125();
            double temp = obj.my_ceiling(10.34);
            assertEquals(temp, 11,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0125 obj = new AsgA0125();
            double temp = obj.my_ceiling(34.45);
            assertEquals(temp, 35,DELTA);
        }

 }
