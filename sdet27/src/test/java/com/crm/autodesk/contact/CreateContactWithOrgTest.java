package com.crm.autodesk.contact;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.autodesk.GenericUtility.BaseClass;
import com.crm.autodesk.objrepo.ContactInfoPage;
import com.crm.autodesk.objrepo.ContactPage;
import com.crm.autodesk.objrepo.CreateContactPage;
import com.crm.autodesk.objrepo.CreateOrganisationPage;
import com.crm.autodesk.objrepo.HomePage;
import com.crm.autodesk.objrepo.OrganizationPage;

public class CreateContactWithOrgTest extends BaseClass {

	@Test(groups = "regression suite")
	public void createContactWithOrgTest() throws Throwable {


		int randomnum = jLib.getRandomNumber();


		String contact = eLib.getDataFromExcel("contact", 1, 2) + randomnum;
		String org = eLib.getDataFromExcel("orgname", 1, 2)+ randomnum;

		HomePage hp = new HomePage(driver);
		hp.clickonOrgslink();

		OrganizationPage op = new OrganizationPage(driver);
		op.clickonCreateOrg();

		CreateOrganisationPage cop = new CreateOrganisationPage(driver);
		cop.CreateOrg(org);


		wLib.waitForElementToBeClickabale(driver, driver.findElement(By.className("dvHeaderText")));
		hp.clickonContactslink();

		ContactPage cp = new ContactPage(driver);
		cp.clickonCreateContact();

		CreateContactPage ccp = new CreateContactPage(driver);
		ccp.createContactWithOrg(contact, org, driver);;


		ContactInfoPage cip = new ContactInfoPage(driver);
		String actsucc_msg_contact = cip.contInfoText();

		Assert.assertTrue(actsucc_msg_contact.contains(contact));

		System.out.println("contact is successfully created : pass");


		String actsucc_msg_org = cip.orgInfoText() ;
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actsucc_msg_org.contains(org));
		sa.assertAll();

		System.out.println("contact is successfully created with org : pass");



	}
}


