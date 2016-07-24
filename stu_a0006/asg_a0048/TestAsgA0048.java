import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestAsgA0048{
public static final double delta=1e-15;
 
 @Test
        public void test_01() {
            AsgA0048 obj  = new AsgA0048();
            double temp = obj.diagonal(10,4,5);
            assertEquals(temp, 11.874342087037917,delta);
        }
      
   

}
