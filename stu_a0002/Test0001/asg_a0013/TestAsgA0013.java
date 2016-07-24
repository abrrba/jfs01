import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0013{
    @Test
        public void test_01() {
            AsgA0013 obj  = new AsgA0013();
            String temp = obj.toggle_case("HelloWorld");
            assertEquals(temp, "hELLOwORLD");
        }
    @Test
        public void test_02() {
            AsgA0013 obj = new AsgA0013();
            String temp = obj.toggle_case("HE12eWo");
            assertEquals(temp, "he12EwO");
        }

    @Test
        public void test_03() {
            AsgA0013 obj = new AsgA0013();
            String temp = obj.toggle_case("Hello @#$ World");
            assertEquals(temp, "hELLO @#$ wORLD");
        }
}
