import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0130{


    @Test
        public void test_01() {
            AsgA0130 obj  = new AsgA0130();
            int temp = obj.gr(60);
            assertEquals(temp, 3);
                 }

    @Test
        public void test_02() {
            AsgA0130 obj  = new AsgA0130();
            int temp = obj.gr(95);
            assertEquals(temp, 1);
        }

        


@Test
        public void test_03() {
            AsgA0130 obj  = new AsgA0130();
            int temp = obj.gr(40);
            assertEquals(temp, 4);
        }






@Test
        public void test_04() {
            AsgA0130 obj  = new AsgA0130();
            int temp = obj.gr(15);
            assertEquals(temp, 5);
        }





}



