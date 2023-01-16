package com.testing;

public interface LoginDataFile {
	
	Xls_Reader 	d = new Xls_Reader("C:\\Users\\binap\\eclipse-workspace\\Final_Project_Selenium\\Project_Data\\testingdata.xlsx");

	
	public String URL = d.getCellData("URL", 1, 1);
	
	public String userName = d.getCellData("UserAndPassword", 1, 1);
	public String password = d.getCellData("UserAndPassword", 1, 2);
	
}
