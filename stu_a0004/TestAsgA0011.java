import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0011{
    @Test
        public void test_01() {
            AsgA0011 obj  = new AsgA0011();
            int temp = obj.sum_of_digits(23);
            assertEquals(temp, 5);
        }
    @Test
        public void test_02() {
            AsgA0011 obj = new AsgA0011();
            int temp = obj.sum_of_digits(1423);
            assertEquals(temp, 10);
        }

    @Test
        public void test_03() {
            AsgA0011 obj = new AsgA0011();
            int temp = obj.sum_of_digits(-23);
            assertEquals(temp, 5);
        }
    
    @Test
        public void test_04() {
            AsgA0011 obj = new AsgA0011();
            int temp = obj.sum_of_digits(00);
            assertEquals(temp, 0);
        }
}
