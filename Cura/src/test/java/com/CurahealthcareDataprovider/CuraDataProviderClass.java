package com.CurahealthcareDataprovider;
import org.testng.annotations.DataProvider;
public class CuraDataProviderClass {
	@DataProvider
	public Object[][] getData()
	{
		Object[][] dataStorage =new  Object[4][3];

		dataStorage[0][0] = "Java";
		dataStorage[0][1] = "springboot";
		dataStorage[0][2] = "microservices";

		dataStorage[1][0] = "python";
		dataStorage[1][1] = "django";
		dataStorage[1][2] = "mongodb";

		dataStorage[2][0] = "selenium";
		dataStorage[2][1] = "cucumber";
		dataStorage[2][2] = "Java";

		dataStorage[3][0] = "javascript";
		dataStorage[3][1] = "cypress";
		dataStorage[3][2] = "react";
		return dataStorage;
	}
}

