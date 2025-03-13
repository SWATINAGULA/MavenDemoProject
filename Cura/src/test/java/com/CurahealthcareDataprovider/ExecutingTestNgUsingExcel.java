package com.CurahealthcareDataprovider;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ExecutingTestNgUsingExcel extends  CuraDataProviderUsingExcel{
	@Test(dataProvider = "getData")
	public void login(String v1 ,String v2)
	{
		Reporter.log("the first data is - "+v1+" the second data is - "+v2,true);
	}
	
//	@Test
//	public void friendRequest()
//	{
//		Reporter.log("This is the friend request ",true);
//	}
//	
//	@Test
//	public void notification()
//	{
//		Reporter.log("This is the notification",true);
//	}
//	@Test
//	public void settings()
//	{
//		Reporter.log("change the settings",true);
//	}
}
