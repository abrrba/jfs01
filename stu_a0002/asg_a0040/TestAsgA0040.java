import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0040{
    @Test
        public void test_01() {
            AsgA0040 obj  = new AsgA0040();
            double temp = obj.find_five_digit_sum(53161);
            assertEquals(temp, 16);
        }
    @Test
        public void test_02() {
            AsgA0040 obj = new AsgA0040();
            double temp = obj.find_five_digit_sum(-53161);
            assertEquals(temp, -16);
        }

    @Test
        public void test_03() {
            AsgA0040 obj = new AsgA0040();
            double temp = obj.find_five_digit_sum(0);
            assertEquals(temp, 0);
        }
}
