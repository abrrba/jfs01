import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA2204{
    @Test
        public void test_01() {
            AsgA2204 obj  = new AsgA2204();
            int temp = obj.mylen("hello world");
            assertEquals(temp, 11);
        }
     @Test
	public void test_02(){
		AsgA2204 obj=new AsgA2204();
		int temp=obj.mylen("");
		assertEquals(temp,0);
	}
}
