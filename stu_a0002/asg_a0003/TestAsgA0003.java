import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0003{
    @Test
        public void test_01() {
            AsgA0003 obj  = new AsgA0003();
            String temp = obj.alter_case_2("HelloWorld");
            assertEquals(temp, "hELLOwORLD");
        }
    @Test
        public void test_02() {
            AsgA0003 obj = new AsgA0003();
            String temp = obj.alter_case_2("helloworld");
            assertEquals(temp, "hELLOWORLD");
        }

    @Test
        public void test_03() {
            AsgA0003 obj = new AsgA0003();
            String temp = obj.alter_case_2("HELLOWORLD");
            assertEquals(temp, "helloworld");
        }

}
