import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0123{
    @Test
        public void test_01() {
            AsgA0123 obj  = new AsgA0123();
            int temp = obj.my_maximum(-10,-20,0);
            assertEquals(temp, 0);
        }
    @Test
        public void test_02() {
            AsgA0123 obj = new AsgA0123();
            int temp = obj.my_maximum(34,23,10);
            assertEquals(temp, 34);
        }

    @Test
        public void test_03() {
            AsgA0123 obj = new AsgA0123();
            int temp = obj.my_maximum(0,0,0);
            assertEquals(temp, 0);
        }
    
    @Test
        public void test_04() {
            AsgA0123 obj = new AsgA0123();
            int temp = obj.my_maximum(5,3,6);
            assertEquals(temp, 6);
        }
}
