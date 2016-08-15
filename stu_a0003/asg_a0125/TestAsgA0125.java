import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0125{

    @Test
        public void test_01() {
            AsgA0125 obj  = new AsgA0125();
            int temp = obj.my_ceiling(12.5);
            assertEquals(temp, 13);
        }
    @Test
        public void test_02() {
            AsgA0125 obj = new AsgA0125();
            int temp = obj.my_ceiling(7.5);
            assertEquals(temp, 8);
        }

    @Test
        public void test_03() {
            AsgA0125 obj = new AsgA0125();
            int temp = obj.my_ceiling(4.5);
            assertEquals(temp, 5);
        }
    
    @Test
        public void test_04() {
            AsgA0125 obj = new AsgA0125();
            int temp = obj.my_ceiling(11.2);
            assertEquals(temp, 12);
        }
}
