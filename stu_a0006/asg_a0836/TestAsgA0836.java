import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0836{


    @Test
        public void test_01() {
            AsgA0836 obj  = new AsgA0836();
            int temp = obj.GCD(45,54);
            assertEquals(temp, 9);
                 }

    @Test
        public void test_02() {
            AsgA0836 obj  = new AsgA0836();
            int temp = obj.GCD(132,54);
            assertEquals(temp, 6);
        }

        




}



