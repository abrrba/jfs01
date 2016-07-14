import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0007{
    @Test
        public void test_01() {
            AsgA0007 obj  = new AsgA0007();
            String temp = obj.find_uppercase("Hello");
            assertEquals(temp, "H");
        }
    @Test
        public void test_02() {
            AsgA0007 obj = new AsgA0007();
            String temp = obj.find_uppercase("HELLOWORLD");
            assertEquals(temp, "HELLOWORLD");
        }

    @Test
        public void test_03() {
            AsgA0007 obj = new AsgA0007();
            String temp = obj.find_uppercase("helloworld");
            assertEquals(temp, "");
        }
}
