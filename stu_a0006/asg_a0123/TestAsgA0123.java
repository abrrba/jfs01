import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0123{
    @Test
        public void test_01() {
            AsgA0123 obj  = new AsgA0123();
            int temp = obj.max(20,35,32,45);
            assertEquals(temp, 45);
                 }

    @Test
        public void test_02() {
            AsgA0123 obj  = new AsgA0123();
            int temp = obj.max(2,6,1,15);
            assertEquals(temp, 15);
        }

        













}



