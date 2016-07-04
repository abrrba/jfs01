import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0017{
    @Test
        public void test_01() {
            AsgA0017 obj  = new AsgA0017();
            double temp = obj.profit(1000.0,20.0);
            assertEquals(temp, 200);
        }
    @Test
        public void test_02() {
            AsgA0017 obj = new AsgA0017();
            double temp = obj.profit(-100,20.0);
            assertEquals(temp, 200);
        }

    @Test
        public void test_03() {
            AsgA0017 obj = new AsgA0017();
            double temp = obj.profit(1000.0,0.0);
            assertEquals(temp, 0);
        }
   
}
