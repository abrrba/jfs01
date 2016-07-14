import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0048{
public static double DELTA = 1e-2;
    @Test
        public void test_01() {
            AsgA0048 obj  = new AsgA0048();
            double temp = obj.calculate_longest_diagonal(10,4,5);
            assertEquals(temp, 11.87,DELTA);
        }/*
    @Test
        public void test_02() {
            AsgA0048 obj = new AsgA0048();
            double temp = obj.calculate_longest_diagonal(1423);
            assertEquals(temp, 10);
        }

    @Test
        public void test_03() {
            AsgA0048 obj = new AsgA0048();
            double temp = obj.calculate_longest_diagonal(-23);
            assertEquals(temp, 5);
        }
    
    @Test
        public void test_04() {
            AsgA0048 obj = new AsgA0048();
            double temp = obj.calculate_longest_diagonal(00);
            assertEquals(temp, 0);
        }*/
}
