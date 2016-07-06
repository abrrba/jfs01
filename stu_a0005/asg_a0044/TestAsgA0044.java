import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0044{
    @Test
        public void test_01() {
            AsgA0044 obj  = new AsgA0044();
            int temp = obj.is_palindrome_num(12321);
            assertEquals(temp, true);
        }
    @Test
        public void test_02() {
            AsgA0044 obj = new AsgA0044();
            int temp = obj.is_palindrome_num(-12321);
            assertEquals(temp, true);
        }

    @Test
        public void test_03() {
            AsgA0044 obj = new AsgA0044();
            int temp = obj.is_palindrome_num(-20);
            assertEquals(temp, false);
        }
    
    @Test
        public void test_04() {
            AsgA0044 obj = new AsgA0044();
            int temp = obj.is_palindrome_num(45654);
            assertEquals(temp, true);
        }
}
