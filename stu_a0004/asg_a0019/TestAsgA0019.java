import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0019{
public static float delta=(1e-15f);
    @Test
        public void test_01() {
            AsgA0019 obj  = new AsgA0019();
            float temp = obj.circumference(20);
            assertEquals(temp, 126.6,delta);
        }
    @Test
        public void test_02() {
            AsgA0019 obj = new AsgA0019();
            float temp = obj.circumference(20.3f);
            assertEquals(temp, 127.48,delta);
        }

    @Test
        public void test_03() {
            AsgA0019 obj = new AsgA0019();
            float temp = obj.circumference(-20);
            assertEquals(temp, 0,delta);
        }
 
}
