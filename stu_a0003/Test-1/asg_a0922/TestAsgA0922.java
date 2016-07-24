import static org.junit.Assert.*;
import org.junit.Test;

public class TestAsgA0922{
    @Test
        public void test_01() {
            AsgA0922 obj  = new AsgA0922();
			int[] a={1,2,3,4,5,6};
            int temp = obj.reverse_array(a);
			assertArrayEquals(a,new int[]{6,5,4,3,2,1});

        	//assertEquals(temp, 654321);
        }/*
    @Test
        public void test_02() {
            AsgA0922 obj = new AsgA0922();
            int temp = obj.reverse_array(2);
            assertEquals(temp, 34512);
        }

    @Test
        public void test_3() {
            AsgA0922 obj = new AsgA0922();
            int temp = obj.reverse_array(3);
            assertEquals(temp, 45123);
        }
    
    @Test
        public void test_04() {
            AsgA0922 obj = new AsgA0922();
            int temp = obj.reverse_array(5);
            assertEquals(temp, 12345);
        }*/
}
