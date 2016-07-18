import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0753{
    @Test
        public void test_01() {
            AsgA0753 obj  = new AsgA0753();
            String temp = obj.insert_hello("how are you");
            assertEquals(temp, "how hello are hello you");
        }
    
}
