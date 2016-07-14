import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0001{
    @Test
        public void test_01() {
            AsgA0001 obj  = new AsgA0001();
            char temp = obj.alter_case_1("Hello World");
        //    System.out.println("String is"+temp);	
	    assertEquals(temp, "HeLlO WoRlD");
        }
   /* @Test
        public void test_02() {
            AsgA0001 obj = new AsgA0001();
            char temp = obj.alter_case_1("Dsj");
            assertEquals(temp, "DsJ");
        }

    @Test
        public void test_03() {
            AsgA0001 obj = new AsgA0001();
            char temp = obj.alter_case_1("Datta");
            assertEquals(temp, "DaTtA");
        }
    
    @Test
        public void test_04() {
            AsgA0001 obj = new AsgA0001();
            char temp = obj.alter_case_1("Anand");
            assertEquals(temp, "AnAnD");
        }*/
}
