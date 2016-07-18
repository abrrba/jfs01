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
            String temp = obj.find_lowercase("HELLOWORLD");
            assertEquals(temp,"");
        }

    @Test
        public void test_03() {
            AsgA0004 obj = new AsgA0004();
            String temp = obj.find_lowercase("helloworld");
            assertEquals(temp, "helloworld");
        }

  @Test
        public void test_04() {
            AsgA0004 obj = new AsgA0004();
            String temp = obj.find_lowercase("hello ! @#$% world"				);
            assertEquals(temp, "helloworld");
        }


}
