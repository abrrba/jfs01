import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0043{
 
 @Test
        public void test_01() {
            AsgA0043 obj  = new AsgA0043();
            int temp = obj.number(53161);
            assertEquals(temp, 5);
        }
    @Test
        public void test_02() {
            AsgA0043 obj = new AsgA0043();
            int temp = obj.number(-53161);
            assertEquals(temp, 5);
        }


    @Test
        public void test_03() {
            AsgA0043 obj = new AsgA0043();
           int temp = obj.number(0);
            assertEquals(temp, 0);
        }

   
}
