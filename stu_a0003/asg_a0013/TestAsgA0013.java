import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0013{
    @Test
        public void test_01() {
            AsgA0013 obj  = new AsgA0013();
            char temp = obj.toggle_case("Hello World");
        	assertEquals(temp, "hELLO wORLD");
        }
   /* @Test
        public void test_02() {
            AsgA0003 obj = new AsgA0003();
            char temp = obj.alter_case_2("Dsj");
            assertEquals(temp, "DsJ");
        }

    @Test
        public void test_03() {
            AsgA0003 obj = new AsgA0003();
            char temp = obj.alter_case_2("Datta");
            assertEquals(temp, "DaTtA");
        }
    
    @Test
        public void test_04() {
            AsgA0003 obj = new AsgA0003();
            char temp = obj.alter_case_2("Anand");
            assertEquals(temp, "AnAnD");
        }*/
}
