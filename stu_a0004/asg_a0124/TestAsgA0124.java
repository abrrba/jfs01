import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0124{
    @Test
        public void test_01() {
            AsgA0124 obj  = new AsgA0124();
            int temp = obj.my_minimum(10,20,5);
            assertEquals(temp,5);
        }
    @Test
        public void test_02() {
            AsgA0124 obj  = new AsgA0124();
            int temp = obj.my_minimum(10,20,-5);
            assertEquals(temp,20);
        }
 @Test
        public void test_03() {
            AsgA0124 obj  = new AsgA0124();
            int temp = obj.my_minimum(0,0,0);
            assertEquals(temp,0);
        }
}
