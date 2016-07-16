import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0122{
    @Test
        public void test_01() {
            AsgA0122 obj  = new AsgA0122();
            int temp = obj.profit(200,100);
            assertEquals(temp, 1);
        }
}
