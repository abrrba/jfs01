import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0013{
    @Test
        public void test_01() {
            AsgA0013 obj  = new AsgA0013();
            String temp = obj.st("HelloWorld");
            assertEquals(temp, "hELLOwORLD");
        }
    @Test
        public void test_02() {
            AsgA0013 obj = new AsgA0013();
            String temp = obj.st("Hello World");
            assertEquals(temp, "hELLO wORLD");
        }

    @Test
        public void test_03() {
            AsgA0013 obj = new AsgA0013();
            String temp = obj.st("Hello @#$ World");
            assertEquals(temp, "hELLO @#$ wORLD");
        }
    
   
    @Test
        public void test_04() {
            AsgA0013 obj = new AsgA0013();
            String temp = obj.st("He12Wo");
            assertEquals(temp, "hE12wO");
        }
    
}
