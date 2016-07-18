import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAsgA2205{
    @Test
        public void test_01() {
            AsgA2205 obj  = new AsgA2205();
            int temp = obj.is_vowel("a");
            assertEquals(temp, 1);
        }
     @Test
	public void test_02(){
		AsgA2205 obj=new AsgA2205();
		int temp=obj.is_vowel("e");
		assertEquals(temp,1);
	}

@Test
	public void test_03(){
		AsgA2205 obj=new AsgA2205();
		int temp=obj.is_vowel("i");
		assertEquals(temp,1);
	}

@Test
	public void test_04(){
		AsgA2205 obj=new AsgA2205();
		int temp=obj.is_vowel("r");
		assertEquals(temp,0);
	}
}
