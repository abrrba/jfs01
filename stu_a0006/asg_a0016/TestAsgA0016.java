import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0016{
    @Test
        public void test_01() {
            AsgA0016 obj  = new AsgA0016();
            int temp = obj.st("A");
            assertEquals(temp, 0);
        }
    @Test
        public void test_02() {
            AsgA0016 obj = new AsgA0016();
            int temp = obj.st("B");
            assertEquals(temp, 1);
        }

    @Test
        public void test_03() {
            AsgA0016 obj = new AsgA0016();
            int temp = obj.st("2");
            assertEquals(temp, 0);
        }
    
    @Test
        public void test_04() {
            AsgA0016 obj = new AsgA0016();
            int temp = obj.st("#");
            assertEquals(temp, 0);
        }
    
}
