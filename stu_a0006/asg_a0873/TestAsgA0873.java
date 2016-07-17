import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0873{


    @Test
        public void test_01() {
            AsgA0873 obj  = new AsgA0873();
            String temp = obj.st("hi anand how are you");
            assertEquals(temp, "hianandhowareyou");
                 }

    @Test
        public void test_02() {
            AsgA0873 obj  = new AsgA0873();
            String temp = obj.st("gade anand");
            assertEquals(temp, "gadeanand");
        }

        




}



