package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class LoginTest {
	
	@Test
	public void loginviaFacebook() {
		
		System.out.println("login with facebook");
		Assert.assertFalse(4<1);
	}
	
    @Test
	public void loginviaGoogle() {
		System.out.println("login with google");
	    Assert.assertEquals("string", "string1");
	}
	
     @Test
    public void loginviaTwitter() {
    	System.out.println("login with twitter");
    	Assert.assertTrue(4>1);
    }
}