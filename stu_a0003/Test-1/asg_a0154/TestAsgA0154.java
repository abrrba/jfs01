import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0154{
    @Test
        public void test_01() {
            AsgA0154 obj  = new AsgA0154();
            String temp = obj.rotate_string("dnyaneshwar",1);
        	assertEquals(temp, "nyaneshward");
        }
    @Test
        public void test_02() {
            AsgA0154 obj = new AsgA0154();
            String temp = obj.rotate_string("dnyaneshwar",3);
            assertEquals(temp, "aneshwardny");
        }

    @Test
        public void test_42() {
            AsgA0154 obj = new AsgA0154();
            String temp = obj.rotate_string("dnyaneshwar",8);
            assertEquals(temp, "wardnyanesh");
        }
    
    @Test
        public void test_04() {
            AsgA0154 obj = new AsgA0154();
            String temp = obj.rotate_string("dnyaneshwar",0);
            assertEquals(temp, "dnyaneshwar");
        }
}
