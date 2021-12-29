package com.crm.autodesk.org;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.autodesk.GenericUtility.BaseClass;
import com.crm.autodesk.objrepo.CreateOrganisationPage;
import com.crm.autodesk.objrepo.HomePage;
import com.crm.autodesk.objrepo.OrganisationInfoPage;
import com.crm.autodesk.objrepo.OrganizationPage;

public class CreateOrgWithIndAndTypeTest extends BaseClass {

	@Test(groups = "regression suite")
	public void createOtgWithIndAndTypeTest() throws Throwable {

		int randomnum = jLib.getRandomNumber();

		String org = eLib.getDataFromExcel("orgname", 5, 2)+ randomnum;
		String ind = eLib.getDataFromExcel("orgname", 5, 3);
		String type1 = eLib.getDataFromExcel("orgname", 5, 4);




		HomePage hp = new HomePage(driver);
		hp.clickonOrgslink();


		OrganizationPage op = new OrganizationPage(driver);
		op.clickonCreateOrg();

		CreateOrganisationPage cop = new CreateOrganisationPage(driver);
		cop.CreateOrgWithInduAndType(org, ind, type1);


		OrganisationInfoPage oip = new OrganisationInfoPage(driver);
		String actsucc_msg = oip.OrgInfotext();

		Assert.assertTrue(actsucc_msg.contains(org));

		System.out.println("org is successfully created : pass");



		String act_succ_ind = oip.IndusInfoText();
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(act_succ_ind.contains(ind));

		System.out.println("industry is successfully created : pass");

		String act_succ_typ = oip.TypeInfoText();
		sa.assertTrue(act_succ_typ.contains(type1));

		System.out.println("type is successfully created : pass");




	}




}














