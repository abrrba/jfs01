import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0124{
//public static int DELTA = 1e-2;
    @Test
        public void test_01() {
            AsgA0124 obj  = new AsgA0124();
            int temp = obj.my_minimum(100,50,20);
            assertEquals(temp, 20);
        }
    @Test
        public void test_02() {
            AsgA0124 obj = new AsgA0124();
            int temp = obj.my_minimum(10,-20,30);
            assertEquals(temp,-20);
        }

    @Test
        public void test_03() {
            AsgA0124 obj = new AsgA0124();
            int temp = obj.my_minimum(-200,100,-150);
            assertEquals(temp, -200);
        }
    
    @Test
        public void test_04() {
            AsgA0124 obj = new AsgA0124();
            int temp = obj.my_minimum(0,0,0);
            assertEquals(temp, 0);
        }
}
