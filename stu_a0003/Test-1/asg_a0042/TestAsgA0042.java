import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0042{
    @Test
        public void test_01() {
            AsgA0042 obj  = new AsgA0042();
            int temp = obj.rotate_n(1);
        	assertEquals(temp, 23451);
        }
    @Test
        public void test_02() {
            AsgA0042 obj = new AsgA0042();
            int temp = obj.rotate_n(2);
            assertEquals(temp, 34512);
        }

    @Test
        public void test_42() {
            AsgA0042 obj = new AsgA0042();
            int temp = obj.rotate_n(3);
            assertEquals(temp, 45123);
        }
    
    @Test
        public void test_04() {
            AsgA0042 obj = new AsgA0042();
            int temp = obj.rotate_n(5);
            assertEquals(temp, 12345);
        }
}
