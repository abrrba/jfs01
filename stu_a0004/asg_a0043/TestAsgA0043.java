import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0043{
public static double delta=1e-15;
    @Test
        public void test_01() {
            AsgA0043 obj  = new AsgA0043();
            double temp = obj.numlen(1234);
            assertEquals(temp, 4,delta);
        }
    @Test
        public void test_02() {
            AsgA0043 obj = new AsgA0043();
            double temp = obj.numlen(-1234);
            assertEquals(temp, 4,delta);
        }

    @Test
        public void test_03() {
            AsgA0043 obj = new AsgA0043();
            double temp = obj.numlen(0);
            assertEquals(temp, 0,delta);
        }
}
