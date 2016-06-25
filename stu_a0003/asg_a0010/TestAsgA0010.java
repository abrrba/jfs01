import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0010{
    @Test
        public void test_01() {
            AsgA0010 obj  = new AsgA0010();
            int temp = obj.reverse_3_digit_int(123);
            assertEquals(temp, 321);
        }
    @Test
        public void test_02() {
            AsgA0010 obj = new AsgA0010();
            int temp = obj.reverse_3_digit_int(-123);
            assertEquals(temp, -321);
        }

    @Test
        public void test_03() {
            AsgA0010 obj = new AsgA0010();
            int temp = obj.reverse_3_digit_int(100);
            assertEquals(temp, 1);
        }
    
    @Test
        public void test_04() {
            AsgA0010 obj = new AsgA0010();
            int temp = obj.reverse_3_digit_int(102);
            assertEquals(temp, 201);
        }
}
