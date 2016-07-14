import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0012{
    @Test
        public void test_01() {
            AsgA0012 obj  = new AsgA0012();
            int temp = obj.product_of_digits(23);
            assertEquals(temp, 6);
        }
    @Test
        public void test_02() {
            AsgA0012 obj = new AsgA0012();
            int temp = obj.product_of_digits(1423);
            assertEquals(temp, 24);
        }

    @Test
        public void test_03() {
            AsgA0012 obj = new AsgA0012();
            int temp = obj.product_of_digits(41);
            assertEquals(temp, 4);
        }
    
    @Test
        public void test_04() {
            AsgA0012 obj = new AsgA0012();
            int temp = obj.product_of_digits(100);
            assertEquals(temp, 0);
        }
}
