import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0127{
public static final double delta=1e-15;

    @Test
        public void test_01() {
            AsgA0127 obj  = new AsgA0127();
            double temp = obj.floor(3.4);
            assertEquals(temp, 3.0,delta);
                 }

    @Test
        public void test_02() {
            AsgA0127 obj  = new AsgA0127();
            double temp = obj.floor(1.9);
            assertEquals(temp, 1.0,delta);
        }

        


@Test
        public void test_03() {
            AsgA0127 obj  = new AsgA0127();
            double temp = obj.floor(-3.4);
            assertEquals(temp, -4.0,delta);
        }






@Test
        public void test_04() {
            AsgA0127 obj  = new AsgA0127();
            double temp = obj.floor(-4.3);
            assertEquals(temp, -5.0,delta);
        }





}



