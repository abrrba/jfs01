import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0031{
public static double DELTA = 1e-4;
    @Test
        public void test_01() {
            AsgA0031 obj  = new AsgA0031();
            double temp = obj.calculate_gross_salary(20000,10,5000);
            assertEquals(temp, 27000,DELTA);
        }
    @Test
        public void test_02() {
            AsgA0031 obj = new AsgA0031();
            double temp = obj.calculate_gross_salary(-20000,10,5000);
            assertEquals(temp, 0,DELTA);
        }
/*
    @Test
        public void test_03() {
            AsgA0031 obj = new AsgA0031();
            int temp = obj.calculate_gross_salary(-23);
            assertEquals(temp, 5);
        }
    
    @Test
        public void test_04() {
            AsgA0031 obj = new AsgA0031();
            int temp = obj.calculate_gross_salary(00);
            assertEquals(temp, 0);
        }
*/}
