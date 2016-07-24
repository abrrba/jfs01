import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0873{
    @Test
        public void test_01() {
            AsgA0873 obj  = new AsgA0873();
            String temp = obj.trim_string("hello world!how are you");
            assertEquals(temp, "helloworld!howareyou");
        }
}
