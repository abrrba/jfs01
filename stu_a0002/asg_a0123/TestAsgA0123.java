import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0123{
    @Test
        public void test_01() {
            AsgA0123 obj  = new AsgA0123();
            int temp = obj.my_maximum(10,20,5);
            assertEquals(temp, 20);
        }
   
}
