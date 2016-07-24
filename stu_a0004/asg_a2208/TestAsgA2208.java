import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA2208{
    @Test
        public void test_01() {
            AsgA2208 obj  = new AsgA2208();
            String temp = obj.myreverse("hello");
            assertEquals(temp, "olleh");
        }
     @Test
	public void test_02(){
		AsgA2208 obj=new AsgA2208();
		String temp=obj.myreverse("radar");
		assertEquals(temp,"radar");
	}
}
