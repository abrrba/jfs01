import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0012{
    @Test
        public void test_01() {
            AsgA0012 obj  = new AsgA0012();
            int temp = obj.sum(123);
            assertEquals(temp, 6);
        }
    @Test
        public void test_02() {
            AsgA0012 obj = new AsgA0012();
            int temp = obj.sum(-123);
            assertEquals(temp, 6);
        }

    @Test
        public void test_03() {
            AsgA0012 obj = new AsgA0012();
            int temp = obj.sum(1203);
            assertEquals(temp, 0);
        }
    
   
}
