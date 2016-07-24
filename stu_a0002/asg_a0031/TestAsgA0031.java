import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0031{
    @Test
        public void test_01() {
            AsgA0031 obj  = new AsgA0031();
            double temp = obj.calculate_gross_salary(10000,8,3000);
            assertEquals(temp, 27000);
        }
    @Test
        public void test_02() {
            AsgA0031 obj = new AsgA0031();
            double temp = obj.calculate_gross_salary(-10000,8,3000);
            assertEquals(temp, 0);
        }
}
