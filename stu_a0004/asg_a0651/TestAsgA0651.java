import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0651{
    @Test
        public void test_01() {
            AsgA0651 obj  = new AsgA0651();
           int[] arr={10,20,2,4};
            int temp = obj.product_of_array(arr);
            assertEquals(temp, 1600);
        }
    @Test
        public void test_02() {
            AsgA0651 obj = new AsgA0651();
           int[] arr={10,20,0,4};
	    int temp = obj.product_of_array(arr);
            assertEquals(temp, 0);
        }

    @Test
        public void test_03() {
            AsgA0651 obj = new AsgA0651();
		int[] arr={};
            int temp = obj.product_of_array(arr);
            assertEquals(temp, 0);
        }

}
