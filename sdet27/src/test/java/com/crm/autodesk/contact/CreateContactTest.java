package com.crm.autodesk.contact;



import org.junit.Assert;
import org.testng.annotations.Test;

import com.crm.autodesk.GenericUtility.BaseClass;
import com.crm.autodesk.objrepo.ContactInfoPage;
import com.crm.autodesk.objrepo.ContactPage;
import com.crm.autodesk.objrepo.CreateContactPage;
import com.crm.autodesk.objrepo.HomePage;

public class CreateContactTest extends BaseClass{
	
	@Test(groups = "smokesuite")
	public void createContactTest() throws Throwable {
	
		String contact = eLib.getDataFromExcel("contact", 1, 2);
		
		
HomePage hp = new HomePage(driver);
hp.clickonContactslink();


ContactPage cp = new ContactPage(driver);
cp.clickonCreateContact();

CreateContactPage ccp = new CreateContactPage(driver);
ccp.createContact(contact);

ContactInfoPage cip = new ContactInfoPage(driver);
String actsucc_msg_contact = cip.contInfoText();

Assert.assertTrue(actsucc_msg_contact.contains(contact));

	System.out.println("contact is successfully created : pass");
	}
}

	



