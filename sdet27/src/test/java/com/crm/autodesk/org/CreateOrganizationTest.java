package com.crm.autodesk.org;



import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.autodesk.GenericUtility.BaseClass;
import com.crm.autodesk.objrepo.CreateOrganisationPage;
import com.crm.autodesk.objrepo.HomePage;
import com.crm.autodesk.objrepo.OrganisationInfoPage;
import com.crm.autodesk.objrepo.OrganizationPage;

@Listeners(com.crm.autodesk.GenericUtility.ListenerImplementation.class)
public class CreateOrganizationTest extends BaseClass {
	
	@Test(groups = "smokesuite" , retryAnalyzer = com.crm.autodesk.GenericUtility.RetryAnalyserImpl.class)
	public void createOrganisationTest() throws Throwable {
		
		
	
int randomnum = jLib.getRandomNumber();
		
		
		String org = eLib.getDataFromExcel("orgname", 1, 2) + randomnum;
		    
		   
		   
		
		HomePage hp = new HomePage(driver);
		hp.clickonOrgslink();
		
		
		OrganizationPage op = new OrganizationPage(driver);
		op.clickonCreateOrg();
		
		
		
		CreateOrganisationPage cop = new CreateOrganisationPage(driver);
		cop.CreateOrg(org);
		Assert.fail();
		
		OrganisationInfoPage oip = new OrganisationInfoPage(driver);
		String actsucc_msg = oip.OrgInfotext();
		
		//Assert.assertTrue(actsucc_msg.contains(org));
		//SoftAssert sa = new SoftAssert();
		//sa.assertTrue(actsucc_msg.contains(org));
		//Reporter.log("org" , true);
		//sa.assertAll();	
		
	}
	@Test
	public void demotest() {
	System.out.println("this is working");
	}

}


