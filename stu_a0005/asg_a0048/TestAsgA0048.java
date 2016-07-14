import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0048{
public static double DELTA = 1e-15;
    @Test
        public void test_01() {
            AsgA0048 obj  = new AsgA0048();
            double temp = obj.calculate_longest_diagonal(10,4,5);
            assertEquals(temp, 11.874342087037917,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0048 obj = new AsgA0048();
            double temp = obj.calculate_longest_diagonal(10,10,5);
            assertEquals(temp,15.0,DELTA);
        }


}
