import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0127{
public static double DELTA=1e-15;
    @Test
        public void test_01() {
            AsgA0127 obj  = new AsgA0127();
            double temp = obj.my_floor(3.4);
            assertEquals(temp,3,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0127 obj  = new AsgA0127();
            double temp = obj.my_floor(1.9);
            assertEquals(temp,1,DELTA);
        }
 @Test
        public void test_03() {
            AsgA0127 obj  = new AsgA0127();
            double temp = obj.my_floor(-3.4);
            assertEquals(temp,-4,DELTA);
        }
}
