import junit.framework.Assert;
import org.junit.Test;
public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Rajkumar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_ShouldReturnFalse() {
        boolean result = userRegistration.firstName("rajkumar");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Varma");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("varma");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_ShouldReturnTrue() {
        boolean result = userRegistration.email("rajkumar@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_ShouldReturnFalse() {
        boolean result = userRegistration.email("rajkumar&.com");
        Assert.assertEquals(false, result);

    }
    @Test
    public void givenPhoneNumber_ShouldReturnTrue() {
        boolean result = userRegistration.mobileNumber("919925067545");
        Assert.assertEquals(true, result);

    }

    @Test
    public void givenPhoneNumber_ShouldReturnFalse() {
        boolean result = userRegistration.mobileNumber("64587541236");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_ShouldReturnTrue(){
        boolean result = userRegistration.password("Rajubhai");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_ShouldReturnFalse(){
        boolean result = userRegistration.password("asdfghjk");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPasswordRule2_ShouldReturnTrue() {
        boolean result = userRegistration.password2("Rajubahi21");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule2_ShouldReturnFalse() {
        boolean result = userRegistration.password2("asdfghjk");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPasswordRule3_ShouldReturnTrue() {
        boolean result = userRegistration.password3("asdfghjk");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPasswordRule3_ShouldReturnFalse() {
        boolean result = userRegistration.password3("asdfghjkpppp");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPasswordRule4_ShouldReturnTrue() {
        boolean result = userRegistration.password4("Rajubhai@55");
        Assert.assertEquals(true, result);

    }

    @Test
    public void givenPasswordRule4_ShouldReturnFalse() {
        boolean result = userRegistration.password4("Asdfgh55");
        Assert.assertEquals(false, result);

    }
    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abcd..2002@gmail.com");
        Assert.assertEquals(false, result);

    }
}
