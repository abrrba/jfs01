import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0123{
    @Test
        public void test_01() {
            AsgA0123 obj  = new AsgA0123();
            int temp = obj.my_maximum(23,45,67);
            assertEquals(temp, 67);
        }
    @Test
        public void test_02() {
            AsgA0123 obj = new AsgA0123();
            int temp = obj.my_maximum(1233,45,234);
            assertEquals(temp,1233);
        }

    @Test
        public void test_03() {
            AsgA0123 obj = new AsgA0123();
            int temp = obj.my_maximum(23,4123,345);
            assertEquals(temp, 4123);
        }

  @Test
        public void test_04() {
            AsgA0123 obj = new AsgA0123();
            int temp = obj.my_maximum(0,3,4);
            assertEquals(temp, 4);
        }


}
