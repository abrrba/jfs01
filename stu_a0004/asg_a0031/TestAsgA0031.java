import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0031{
    @Test
        public void test_01() {
            AsgA0031 obj  = new AsgA0031();
            double temp = obj.calculate_gross_salary(20000,10,5000);
            assertEquals(temp, 27000);
        }
    @Test
        public void test_02() {
            AsgA0031 obj = new AsgA0031();
            double temp = obj.calculate_gross_salary(-20000,10,5000);
            assertEquals(temp, 0);
        }
}
