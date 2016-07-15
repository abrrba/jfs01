import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0007{
    @Test
        public void test_01() {
            AsgA0007 obj  = new AsgA0007();
            String temp = obj.find_uppercase("Hello WoRld");
        	assertEquals(temp, "HWR");
        }
    @Test
        public void test_02() {
            AsgA0007 obj = new AsgA0007();
            String temp = obj.find_uppercase("Dsj");
            assertEquals(temp, "D");
        }

    @Test
        public void test_03() {
            AsgA0007 obj = new AsgA0007();
            String temp = obj.find_uppercase("DATTA");
            assertEquals(temp, "DATTA");
        }
    
    @Test
        public void test_04() {
            AsgA0007 obj = new AsgA0007();
            String temp = obj.find_uppercase("AnaNd");
            assertEquals(temp, "AN");
        }
}
