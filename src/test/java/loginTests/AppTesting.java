package loginTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTesting {
  @Test(description ="Valid")
  public void valid() {
	  App ap=new App();
	  boolean status=ap.userLogin("demouser", "password");
	  Assert.assertTrue(status,"Login failed with valid credentials");
  }
  
  @Test(description ="InValid")
  public void invalid() {
	  App ap=new App();
	  boolean status=ap.userLogin("userdemo", "password111");
	  Assert.assertFalse(status);
  }
}
