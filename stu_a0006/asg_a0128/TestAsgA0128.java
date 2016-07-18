import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0128{


    @Test
        public void test_01() {
            AsgA0128 obj  = new AsgA0128();
            int temp = obj.zero(0);
            assertEquals(temp, 1);
                 }

    @Test
        public void test_02() {
            AsgA0128 obj  = new AsgA0128();
            int temp = obj.zero(10);
            assertEquals(temp, 0);
        }

        


@Test
        public void test_03() {
            AsgA0128 obj  = new AsgA0128();
            int temp = obj.zero(-3);
            assertEquals(temp, 0);
        }






@Test
        public void test_04() {
            AsgA0128 obj  = new AsgA0128();
            int temp = obj.zero(55);
            assertEquals(temp, 0);
        }





}



