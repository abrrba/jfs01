import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0016{
    @Test
        public void test_01() {
            AsgA0016 obj  = new AsgA0016();
            boolean temp = obj.is_consonant('b');
        	assertEquals(temp, true);
        }
    @Test
        public void test_02() {
            AsgA0016 obj = new AsgA0016();
            boolean temp = obj.is_consonant('i');
            assertEquals(temp, false);
        }

    @Test
        public void test_03() {
            AsgA0016 obj = new AsgA0016();
            boolean temp = obj.is_consonant('f');
            assertEquals(temp, true);
        }
    
    @Test
        public void test_04() {
            AsgA0016 obj = new AsgA0016();
            boolean temp = obj.is_consonant('u');
            assertEquals(temp, false);
        }
}
