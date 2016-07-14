import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0019{
public static double DELTA = 1e-4;
    @Test
        public void test_01() {
            AsgA0019 obj  = new AsgA0019();
            double temp = obj.circumference(20);
            assertEquals(temp, 125.6,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0019 obj = new AsgA0019();
            double temp = obj.circumference(20.3);
            assertEquals(temp, 127.484,DELTA);
        }

    @Test
        public void test_03() {
            AsgA0019 obj = new AsgA0019();
            double temp = obj.circumference(-20);
            assertEquals(temp, 0.0,DELTA);
        }
    /*
    @Test
        public void test_04() {
            AsgA0006 obj = new AsgA0006();
            int temp = obj.get_amount(1200.5,5,1);
            assertEquals(temp, 60.025);
        }*/
}
