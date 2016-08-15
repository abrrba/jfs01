import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTs{
    @Test
        public void test_01() {
            Ts obj  = new Ts();
            String temp = obj.ts("Hello World");
        	assertEquals(temp, "hELLO wORLD");
        }
    @Test
        public void test_02() {
            Ts obj = new Ts();
            String temp = obj.ts("Dsj");
            assertEquals(temp, "dSJ");
        }

    @Test
        public void test_03() {
            Ts obj = new Ts();
            String temp = obj.ts("Datta");
            assertEquals(temp, "dATTA");
        }
    
    @Test
        public void test_04() {
            Ts obj = new Ts();
            String temp = obj.ts("AnAnd");
            assertEquals(temp, "aNaND");
        }
}
