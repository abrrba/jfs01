import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0823{
    @Test
        public void test_01() {
            AsgA0823 obj  = new AsgA0823();
            int temp = obj.calculate_factorial(3);
        	assertEquals(temp, 6);
        }
    @Test
        public void test_02() {
            AsgA0823 obj = new AsgA0823();
            int temp = obj.calculate_factorial(4);
            assertEquals(temp, 24);
        }

    @Test
        public void test_42() {
            AsgA0823 obj = new AsgA0823();
            int temp = obj.calculate_factorial(5);
            assertEquals(temp, 120);
        }
    
    @Test
        public void test_04() {
            AsgA0823 obj = new AsgA0823();
            int temp = obj.calculate_factorial(1);
            assertEquals(temp, 1);
        }
}
