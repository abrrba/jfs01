import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0125{
public static final double delta=1e-15;
    @Test
        public void test_01() {
            AsgA0125 obj  = new AsgA0125();
            double temp = obj.ceiling(10.35);
            assertEquals(temp, 11.0,delta);
                 }

    @Test
        public void test_02() {
            AsgA0125 obj  = new AsgA0125();
            double temp = obj.ceiling(20.11);
            assertEquals(temp, 21.0,delta);
        }

        













}



