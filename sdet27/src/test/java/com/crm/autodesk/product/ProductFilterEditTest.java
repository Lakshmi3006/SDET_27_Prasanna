package com.crm.autodesk.product;

import org.testng.annotations.Test;

import com.crm.autodesk.GenericUtility.BaseClass;
import com.crm.autodesk.objrepo.CreateProductsPage;
import com.crm.autodesk.objrepo.HomePage;
import com.crm.autodesk.objrepo.ProductInfoPage;
import com.crm.autodesk.objrepo.ProductsPage;

public class ProductFilterEditTest extends BaseClass {
	
	@Test
	public void productFilterEditTest() throws Throwable {
		
		int randomnum = jLib.getRandomNumber();

		  String pro = eLib.getDataFromExcel("product", 1, 2) + randomnum;
		  String procat = eLib.getDataFromExcel("product", 1, 3) ;
		  String viewname = eLib.getDataFromExcel("product", 1, 4) + randomnum;
  		
		
		
			HomePage hp = new HomePage(driver);
			hp.clickonProductslink();
			
			ProductsPage pp = new ProductsPage(driver);
			pp.clickonCreateProduct();
			
			CreateProductsPage cpp = new CreateProductsPage(driver);
			cpp.createProduct(pro, procat);
			
			
			ProductInfoPage pip = new ProductInfoPage(driver);
			String acctsuu_msg = pip.prodInfoText();
			if(acctsuu_msg.contains(pro)) {
				System.out.println("product is created");
				hp.clickonProductslink();
				
			}
			else {
				System.out.println("product is not created");
			}
			
			pp.selectFromFilter(viewname);
			
	}
}
