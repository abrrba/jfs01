import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0006{
    @Test
        public void test_01() {
            AsgA0006 obj  = new AsgA0006();
            int temp = obj.get_amount(1000,0,2);
            assertEquals(temp, 0);
        }
    @Test
        public void test_02() {
            AsgA0006 obj = new AsgA0006();
            int temp = obj.get_amount(1000,5,2);
            assertEquals(temp, 100);
        }

    @Test
        public void test_03() {
            AsgA0006 obj = new AsgA0006();
            int temp = obj.get_amount(1000,5,0.5);
            assertEquals(temp, 25);
        }
    
    @Test
        public void test_04() {
            AsgA0006 obj = new AsgA0006();
            int temp = obj.get_amount(1200.5,5,1);
            assertEquals(temp, 60.025);
        }
}
