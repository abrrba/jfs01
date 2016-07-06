import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0019{
public static double DELTA = 1e-15;
    @Test
        public void test_01() {
            AsgA0019 obj  = new AsgA0019();
            double temp = obj.circum(20);
            assertEquals(temp, 125.60000000000001,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0019 obj = new AsgA0019();
            double temp = obj.circum(20.3);
            assertEquals(temp, 127.48400000000001,DELTA);
        }

    @Test
        public void test_03() {
            AsgA0019 obj = new AsgA0019();
            double temp = obj.circum(-20);
            assertEquals(temp, 0,DELTA);
        }
    
    @Test
        public void test_04() {
            AsgA0019 obj = new AsgA0019();
            double temp = obj.circum(-20);
            assertEquals(temp, 0,DELTA);
        }
}
