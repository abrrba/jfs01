import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestAsgA0044{
//public static final Boolean delta=1e-15;
 
 @Test
        public void test_01() {
            AsgA0044 obj  = new AsgA0044();
            Boolean temp = obj.is_palindrome_number(12321);
            assertEquals(temp, true);
        }
    @Test
        public void test_02() {
            AsgA0044 obj = new AsgA0044();
            Boolean temp = obj.is_palindrome_number(-12321);
            assertEquals(temp, true);
        }


    @Test
        public void test_03() {
            AsgA0044 obj = new AsgA0044();
           Boolean temp = obj.is_palindrome_number(64);
            assertEquals(temp, false);
  }      
   

}
