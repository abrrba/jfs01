import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA2210{
    @Test
        public void test_01() {
            AsgA2210 obj  = new AsgA2210();
		String st1=new String("2");
	       String st11=new String("1234");
            int temp = obj.is_member(st1,st11);
            assertEquals(temp, 1);
        }
     @Test
	public void test_02(){
		AsgA2210 obj=new AsgA2210();
	        String st2=new String("5");
	       String st22=new String("1234");
		int temp=obj.is_member(st2,st22);
		assertEquals(temp,0);
	}
}
