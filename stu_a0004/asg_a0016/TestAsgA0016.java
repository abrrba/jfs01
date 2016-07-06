import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0016{
    @Test
        public void test_01() {
            AsgA0016 obj  = new AsgA0016();
            String temp = obj.is_consonent("A");
            assertEquals(temp,"0");
        }
    @Test
        public void test_02() {
            AsgA0016 obj = new AsgA0016();
            String temp = obj.is_consonent("B");
            assertEquals(temp,"1");
        }

    @Test
        public void test_03() {
            AsgA0016 obj = new AsgA0016();
            String temp = obj.is_consonent("2");
            assertEquals(temp,"0");
        }
  @Test
        public void test_04() {
            AsgA0016 obj = new AsgA0016();
            String temp = obj.is_consonent("0");
            assertEquals(temp,"0");
        }
}
