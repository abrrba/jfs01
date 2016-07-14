import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0031{
public static double delta=1e-15;
    @Test
        public void test_01() {
            AsgA0031 obj  = new AsgA0031();
            double temp = obj.calculate_gross_salary(20000,10,5000);
            assertEquals(temp, 27000,delta);
        }
    @Test
        public void test_02() {
            AsgA0031 obj = new AsgA0031();
            double temp = obj.calculate_gross_salary(-20000,10,5000);
            assertEquals(temp, 0,delta);
        }
}
