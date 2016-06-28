import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0654{
	@Test
		public void test_01() {
			int[] arr = {1,2,3,4,5,6,7,8,9,10};
			AsgA0654 obj  = new AsgA0654();
			double temp = obj.find_median(arr);
			assertEquals(temp, 5.5);
		}
	@Test
		public void test_02() {
			int[] arr = {10,20,15,21,3};
			AsgA0654 obj = new AsgA0654();
			double temp = obj.find_median(arr);
			assertEquals(temp, 15);
		}

	/*  @Test
	    public void test_03() {
	    AsgA0011 obj = new AsgA0011();
	    int temp = obj.sum_of_digits(-23);
	    assertEquals(temp, 5);
	    }

	    @Test
	    public void test_04() {
	    AsgA0011 obj = new AsgA0011();
	    int temp = obj.sum_of_digits(00);
	    assertEquals(temp, 0);
	    }*/
}
