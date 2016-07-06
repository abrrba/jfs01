import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0010{
    @Test
        public void test_01() {
            AsgA0010 obj  = new AsgA0010();
            int temp = obj.rev(123);
            assertEquals(temp, 321);
        }
    @Test
        public void test_02() {
            AsgA0010 obj = new AsgA0010();
            int temp = obj.rev(-123);
            assertEquals(temp,-321);
        }

    @Test
        public void test_03() {
            AsgA0010 obj = new AsgA0010();
            int temp = obj.rev(4123);
            assertEquals(temp, 0);
        }

  @Test
        public void test_04() {
            AsgA0010 obj = new AsgA0010();
            int temp = obj.rev(0);
            assertEquals(temp, 0);
        }


}
