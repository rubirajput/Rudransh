package testClasses;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DashBoardTest extends BaseTestClasses {
	
	@Test
	public void VerifyDashbordIsDispalyed() throws InterruptedException
	{
		String actualText=dsh.dashboardIsDispalyed();
		Assert.assertEquals(actualText, "Dashboard");//Testcase: After log in dashboard page should be displayed 
		//actual textCompared with expect i.e. dashboard
		
	}
 @Test
 public void VerifyStartInvestingEnabled() throws InterruptedException
 {
	 boolean actualOutput=dsh.stratInvesting();
	 Assert.assertEquals(actualOutput, true);
	 
 }
 @Test
 public void VerifySearchField() throws Exception 
 {
	 dsh.searchShare();
 }

}
