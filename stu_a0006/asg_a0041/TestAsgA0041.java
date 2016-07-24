import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0041{
 
 @Test
        public void test_01() {
            AsgA0041 obj  = new AsgA0041();
            int temp = obj.rotet(12345);
            assertEquals(temp, 23451);
        }
    @Test
        public void test_02() {
            AsgA0041 obj = new AsgA0041();
            int temp = obj.rotet(-12345);
            assertEquals(temp, -23451);
        }


    @Test
        public void test_03() {
            AsgA0041 obj = new AsgA0041();
           int temp = obj.rotet(23145);
            assertEquals(temp, 31452);
        }

   
}
