import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0122{
    @Test
        public void test_01() {
            AsgA0122 obj  = new AsgA0122();
            double temp = obj.is_profit(100,50);
            assertEquals(temp,1.0);
        }
    @Test
        public void test_02() {
            AsgA0122 obj = new AsgA0122();
            double temp = obj.is_profit(50,100);
            assertEquals(temp,0.0);
        }

    @Test
        public void test_03() {
            AsgA0122 obj = new AsgA0122();
            double temp = obj.is_profit(-200,100);
            assertEquals(temp,0.0);
        }
    
    @Test
        public void test_04() {
            AsgA0122 obj = new AsgA0122();
            double temp = obj.is_profit(123,24);
            assertEquals(temp,1.0);
        }
}
