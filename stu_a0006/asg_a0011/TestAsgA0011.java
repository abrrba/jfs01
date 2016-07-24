import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0011{
public static final double delta=1e-15;
    @Test
        public void test_01() {
            AsgA0011 obj  = new AsgA0011();
            int temp = obj.sum(123);
            assertEquals(temp, 6);
        }
    @Test
        public void test_02() {
            AsgA0011 obj = new AsgA0011();
            int temp = obj.sum(1423);
            assertEquals(temp, 10);
        }

    @Test
        public void test_03() {
            AsgA0011 obj = new AsgA0011();
            int temp = obj.sum(-23);
            assertEquals(temp, 5);
        }
    
   @Test
        public void test_04() {
            AsgA0011 obj = new AsgA0011();
            int temp = obj.sum(0);
            assertEquals(temp, 0);
        }  
}
