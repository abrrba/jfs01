import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0126{

    @Test
        public void test_01() {
            AsgA0126 obj  = new AsgA0126();
            int temp = obj.pri(3);
            assertEquals(temp, 1);
                 }

    @Test
        public void test_02() {
            AsgA0126 obj  = new AsgA0126();
            int temp = obj.pri(10);
            assertEquals(temp, 0);
        }

        


@Test
        public void test_03() {
            AsgA0126 obj  = new AsgA0126();
            int temp = obj.pri(0);
            assertEquals(temp, 0);
        }






@Test
        public void test_04() {
            AsgA0126 obj  = new AsgA0126();
            int temp = obj.pri(-3);
            assertEquals(temp, 0);
        }





}



