import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0001{
    @Test
        public void test_01() {
            AsgA0001 obj  = new AsgA0001();
            String temp = obj.alter_case_1("HelloWorld");
            assertEquals(temp, "HeLlOwOrLd");
        }
    @Test
        public void test_02() {
            AsgA0001 obj = new AsgA0001();
            String temp = obj.alter_case_1("helloworld");
            assertEquals(temp, "HeLlOwOrLd");
        }

    @Test
        public void test_03() {
            AsgA0001 obj = new AsgA0001();
            String temp = obj.alter_case_1("HelloWorld");
            assertEquals(temp, "HeLlOwOrLd");
        }

}
