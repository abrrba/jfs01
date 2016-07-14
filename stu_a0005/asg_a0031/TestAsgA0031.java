import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0031{
    @Test
        public void test_01() {
            AsgA0031 obj  = new AsgA0031();
            long temp = obj.calculate_gross_salary(20000,10,5000);
            assertEquals(temp, 27000);
        }
    @Test
        public void test_02() {
            AsgA0031 obj = new AsgA0031();
            long temp = obj.calculate_gross_salary(-20000,10,5000);
            assertEquals(temp,0);
        }
/*
    @Test
        public void test_03() {
            AsgA0010 obj = new AsgA0010();
            int temp = obj.rev(4123);
            assertEquals(temp, 0);
        }

  @Test
        public void test_04() {
            AsgA0010 obj = new AsgA0010();
            int temp = obj.rev(0);
            assertEquals(temp, 0);
        }
*/

}
