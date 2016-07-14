import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0040{
    @Test
        public void test_01() {
            AsgA0040 obj  = new AsgA0040();
            int temp = obj.find_five_digit_sum(12345);
            assertEquals(temp, 15);
        }
    @Test
        public void test_02() {
            AsgA0040 obj = new AsgA0040();
            int temp = obj.find_five_digit_sum(14023);
            assertEquals(temp, 10);
        }

    @Test
        public void test_03() {
            AsgA0040 obj = new AsgA0040();
            int temp = obj.find_five_digit_sum(0);
            assertEquals(temp, 0);
        }
    
    @Test
        public void test_04() {
            AsgA0040 obj = new AsgA0040();
            int temp = obj.find_five_digit_sum(-12345);
            assertEquals(temp, 15);
        }
}
