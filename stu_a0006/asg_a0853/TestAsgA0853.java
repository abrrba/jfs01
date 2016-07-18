import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0853{


    @Test
        public void test_01() {
            AsgA0853 obj  = new AsgA0853();
            int temp = obj.leap(2016);
            assertEquals(temp, 1);
                 }

    @Test
        public void test_02() {
            AsgA0853 obj  = new AsgA0853();
            int temp = obj.leap(2019);
            assertEquals(temp, 0);
        }

        




}



