import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0004{
    @Test
        public void test_01() {
            AsgA0004 obj  = new AsgA0004();
            String temp = obj.find_lowercase("Hello World");
        	assertEquals(temp, "elloorld");
        }
    @Test
        public void test_02() {
            AsgA0004 obj = new AsgA0004();
            String temp = obj.find_lowercase("Dsj");
            assertEquals(temp, "sj");
        }

    @Test
        public void test_03() {
            AsgA0004 obj = new AsgA0004();
            String temp = obj.find_lowercase("Datta");
            assertEquals(temp, "atta");
        }
    
    @Test
        public void test_04() {
            AsgA0004 obj = new AsgA0004();
            String temp = obj.find_lowercase("Anand");
            assertEquals(temp, "nand");
        }
}
