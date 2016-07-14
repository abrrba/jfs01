import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0003{
    @Test
        public void test_01() {
            AsgA0003 obj  = new AsgA0003();
            char temp = obj.st("HelloWorld");
            assertEquals(temp, "hELLOwORLD");
        }
    @Test
        public void test_02() {
            AsgA0003 obj = new AsgA0003();
            char temp = obj.st("helloworld");
            assertEquals(temp, "hELLOWORLD");
        }

    @Test
        public void test_03() {
            AsgA0003 obj = new AsgA0003();
            char temp = obj.st("HELLOWORLD");
            assertEquals(temp, "helloworld");
        }
    
      @Test
        public void test_04() {
            AsgA0003 obj = new AsgA0003();
            char temp = obj.st("Hello!Wo#rl% 5 4d");
            assertEquals(temp, "hELLO!wO#RL% 5 4D");
        }
}
