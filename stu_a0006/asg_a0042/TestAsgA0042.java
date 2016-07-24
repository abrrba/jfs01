import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0042{
 
 @Test
        public void test_01() {
            AsgA0042 obj  = new AsgA0042();
            String temp = obj.rotet("12345",3);
            assertEquals(temp, "45123");
        }
    @Test
        public void test_02() {
            AsgA0042 obj = new AsgA0042();
            String temp = obj.rotet("34562",2);
            assertEquals(temp, "56234");
        }


    @Test
        public void test_03() {
            AsgA0042 obj = new AsgA0042();
           String temp = obj.rotet("23145",5);
            assertEquals(temp, "23145");
        }

   
}
