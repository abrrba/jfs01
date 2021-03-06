import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0124{
    @Test
        public void test_01() {
            AsgA0124 obj  = new AsgA0124();
            int temp = obj.my_minimum(10,5,20);
            assertEquals(temp, 5);
        }
    @Test
        public void test_02() {
            AsgA0124 obj = new AsgA0124();
            int temp = obj.my_minimum(10,-5,29);
            assertEquals(temp,-5);
        }

    @Test
        public void test_03() {
            AsgA0124 obj = new AsgA0124();
            int temp = obj.my_minimum(0,0,0);
            assertEquals(temp, 0);
        }

  @Test
        public void test_04() {
            AsgA0124 obj = new AsgA0124();
            int temp = obj.my_minimum(0,23,45);
            assertEquals(temp, 0);
        }


}
