import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0124{
    @Test
        public void test_01() {
            AsgA0124 obj  = new AsgA0124();
            int temp = obj.min(20,35,45);
            assertEquals(temp, 20);
                 }

    @Test
        public void test_02() {
            AsgA0124 obj  = new AsgA0124();
            int temp = obj.min(2,6,15);
            assertEquals(temp, 2);
        }

        













}



