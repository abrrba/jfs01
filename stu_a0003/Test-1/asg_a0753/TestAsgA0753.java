import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA0753{
    @Test
        public void test_01() {
            AsgA0753 obj  = new AsgA0753();
            String temp = obj.insert_hello("hi am Dnyaneshwar");
        	assertEquals(temp, "hiHelloamHelloDnyaneshwar");
        }/*
    @Test
        public void test_02() {
            AsgA0753 obj = new AsgA0753();
            String temp = obj.insert_hello();
            assertEquals(temp, "aneshwardny");
        }

    @Test
        public void test_42() {
            AsgA0753 obj = new AsgA0753();
            String temp = obj.insert_hello("dnyaneshwar",8);
            assertEquals(temp, "wardnyanesh");
        }
    
    @Test
        public void test_04() {
            AsgA0753 obj = new AsgA0753();
            String temp = obj.insert_hello("dnyaneshwar",0);
            assertEquals(temp, "dnyaneshwar");
        }*/
}
