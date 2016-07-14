import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0043{
    @Test
        public void test_01() {
            AsgA0043 obj  = new AsgA0043();
            int temp = obj.numlen(23);
            assertEquals(temp, 2);
        }
    @Test
        public void test_02() {
            AsgA0043 obj = new AsgA0043();
            int temp = obj.numlen(1423);
            assertEquals(temp, 4);
        }

    @Test
        public void test_03() {
            AsgA0043 obj = new AsgA0043();
            int temp = obj.numlen(-23);
            assertEquals(temp, 2);
        }
    
    @Test
        public void test_04() {
            AsgA0043 obj = new AsgA0043();
            int temp = obj.numlen(0);
            assertEquals(temp, 0);
        }
}
