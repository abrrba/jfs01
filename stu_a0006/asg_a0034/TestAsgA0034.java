import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0034{
public static double delta=1e-15;   
 @Test
        public void test_01() {
            AsgA0034 obj  = new AsgA0034();
            double temp = obj.km(1);
            assertEquals(temp, 1000000,delta);
        }
    @Test
        public void test_02() {
            AsgA0034 obj = new AsgA0034();
            double temp = obj.km(-1);
            assertEquals(temp, -1000000,delta);
        }


    @Test
        public void test_03() {
            AsgA0034 obj = new AsgA0034();
           double temp = obj.km(0);
            assertEquals(temp, 0,delta);
        }

   
}
