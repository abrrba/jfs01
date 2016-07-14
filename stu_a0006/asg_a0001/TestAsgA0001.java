import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0001{
    @Test
        public void test_01() {
            AsgA0001 obj  = new AsgA0001();
            char temp = obj.st("HelloWorld");
            assertEquals(temp, "HeLlOwOrLd");
        }
    @Test
        public void test_02() {
            AsgA0001 obj = new AsgA0001();
            char temp = obj.st("helloworld");
            assertEquals(temp, "HeLlOwOrLd");
        }

    @Test
        public void test_03() {
            AsgA0001 obj = new AsgA0001();
            char temp = obj.st("HELLOWORLD");
            assertEquals(temp, "HeLlOwOrLd");
        }
    
   
}
