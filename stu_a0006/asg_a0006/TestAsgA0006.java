import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0006{
public static final double delta=1e-15;
    @Test
        public void test_01() {
            AsgA0006 obj  = new AsgA0006();
            double temp = obj.simple(10000, 5, 2);
            assertEquals(temp, 1000,delta);
        }
    @Test
        public void test_02() {
            AsgA0006 obj = new AsgA0006();
            double temp = obj.simple(1000,0,2);
            assertEquals(temp, 0,delta);
        }

    @Test
        public void test_03() {
            AsgA0006 obj = new AsgA0006();
            double temp = obj.simple(1000,5,0.5);
            assertEquals(temp, 25,delta);
        }
    
      @Test
        public void test_04() {
            AsgA0006 obj = new AsgA0006();
            double temp = obj.simple(1200.5,5,1);
            assertEquals(temp, 60.025,delta);
        }
}
