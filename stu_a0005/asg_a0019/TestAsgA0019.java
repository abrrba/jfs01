import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0019{
    @Test
        public void test_01() {
            AsgA0019 obj  = new AsgA0019();
            double temp = obj.circum(20);
            assertEquals(temp, 125.6);
        }
    @Test
        public void test_02() {
            AsgA0019 obj = new AsgA0019();
            double temp = obj.circum(20.3);
            assertEquals(temp, 127.48);
        }

    @Test
        public void test_03() {
            AsgA0019 obj = new AsgA0019();
            double temp = obj.circum(-20);
            assertEquals(temp, 0);
        }
    
    @Test
        public void test_04() {
            AsgA0019 obj = new AsgA0019();
            double temp = obj.circum(-20);
            assertEquals(temp, 0);
        }
}
