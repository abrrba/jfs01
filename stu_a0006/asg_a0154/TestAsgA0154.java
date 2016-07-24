import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0154{


    @Test
        public void test_01() {
            AsgA0154 obj  = new AsgA0154();
            String temp = obj.rotate_string("anand");
            assertEquals(temp, "danan");
                 }

    @Test
        public void test_02() {
            AsgA0154 obj  = new AsgA0154();
            String temp = obj.rotate_string("gade");
            assertEquals(temp, "egad");
        }

        


@Test
        public void test_03() {
            AsgA0154 obj  = new AsgA0154();
            String temp = obj.rotate_string("omkar");
            assertEquals(temp, "romka");
        }






@Test
        public void test_04() {
            AsgA0154 obj  = new AsgA0154();
            String temp = obj.rotate_string("mahesh");
            assertEquals(temp, "hmahes");
        }





}



