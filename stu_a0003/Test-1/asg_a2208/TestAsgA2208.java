import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA2208{
    @Test
        public void test_01() {
            AsgA2208 obj  = new AsgA2208();
            String temp = obj.reverse("hello");
        	assertEquals(temp, "olleh");
        }
    @Test
        public void test_02() {
            AsgA2208 obj = new AsgA2208();
            String temp = obj.reverse("Hello World");
            assertEquals(temp, "dlroW olleH");
        }
/*
    @Test
        public void test_42() {
            AsgA2208 obj = new AsgA2208();
            String temp = obj.reverse("dnyaneshwar",8);
            assertEquals(temp, "wardnyanesh");
        }
    
    @Test
        public void test_04() {
            AsgA2208 obj = new AsgA2208();
            String temp = obj.reverse("dnyaneshwar",0);
            assertEquals(temp, "dnyaneshwar");
        }
*/}
