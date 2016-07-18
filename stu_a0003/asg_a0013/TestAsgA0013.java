import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0013{
    @Test
        public void test_01() {
            AsgA0013 obj  = new AsgA0013();
            String temp = obj.toggle_case("Hello World");
        	assertEquals(temp, "hELLO wORLD");
        }
    @Test
        public void test_02() {
            AsgA0013 obj = new AsgA0013();
            String temp = obj.toggle_case("Dsj");
            assertEquals(temp, "dSJ");
        }

    @Test
        public void test_13() {
            AsgA0013 obj = new AsgA0013();
            String temp = obj.toggle_case("Datta");
            assertEquals(temp, "dATTA");
        }
    
    @Test
        public void test_04() {
            AsgA0013 obj = new AsgA0013();
            String temp = obj.toggle_case("Anand");
            assertEquals(temp, "aNAND");
        }
}
