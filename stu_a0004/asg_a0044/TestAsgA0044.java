import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0044{
    @Test
        public void test_01() {
            AsgA0044 obj  = new AsgA0044();
            double temp = obj.is_palindrome_number(12321);
            assertEquals(temp, true);
        }
    @Test
        public void test_02() {
            AsgA0044 obj = new AsgA0044();
            double temp = obj.is_palindrome_number(-12321);
            assertEquals(temp, true);
        }

    @Test
        public void test_03() {
            AsgA0044 obj = new AsgA0044();
            double temp = obj.is_palindrome_number(64);
            assertEquals(temp,true);
        }
}
