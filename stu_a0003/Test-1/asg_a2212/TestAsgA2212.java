import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA2212{
    @Test
        public void test_01() {
            AsgA2212 obj  = new AsgA2212();
            String temp = obj.generate_n_char(3,'a');
        	assertEquals(temp, "aaa");
        }
    @Test
        public void test_02() {
            AsgA2212 obj = new AsgA2212();
            String temp = obj.generate_n_char(5,'d');
            assertEquals(temp, "ddddd");
        }
/*
    @Test
        public void test_42() {
            AsgA2212 obj = new AsgA2212();
            String temp = obj.generate_n_char("dnyaneshwar",8);
            assertEquals(temp, "wardnyanesh");
        }
    
    @Test
        public void test_04() {
            AsgA2212 obj = new AsgA2212();
            String temp = obj.generate_n_char("dnyaneshwar",0);
            assertEquals(temp, "dnyaneshwar");
        }
*/}
