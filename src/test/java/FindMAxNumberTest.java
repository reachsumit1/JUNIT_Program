import org.junit.Assert;
import org.junit.Test;

public class FindMAxNumberTest {
    @Test
    public void testFindMax(){
        FindMaxNumber max= new FindMaxNumber();
        //max.findMax();
        Assert.assertEquals(4,max.findmax(new int[]{1,2,3,4}));
    }
}
