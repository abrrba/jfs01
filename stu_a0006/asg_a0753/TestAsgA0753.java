import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0753{


    @Test
        public void test_01() {
            AsgA0753 obj  = new AsgA0753();
            String temp = obj.st("hi who are you");
            assertEquals(temp, "hi Hello who Hello are Hello you");
                 }

    @Test
        public void test_02() {
            AsgA0753 obj  = new AsgA0753();
            String temp = obj.st("anand hi");
            assertEquals(temp, "anand Hello hi");
        }

        


@Test
        public void test_03() {
            AsgA0753 obj  = new AsgA0753();
            String temp = obj.st("omkar hi");
            assertEquals(temp, "omkar Hello hi");
        }






@Test
        public void test_04() {
            AsgA0753 obj  = new AsgA0753();
            String temp = obj.st("mahesh hi");
            assertEquals(temp, "mahesh Hello hi");
        }





}



