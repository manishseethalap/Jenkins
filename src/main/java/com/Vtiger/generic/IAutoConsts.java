package com.Vtiger.generic;


public interface IAutoConsts {

String currentdirectory = System.getProperty("user.dir");


String propertyFile = currentdirectory+"/Files/browser.PROPERTIES";
String excelData = currentdirectory+"/Files/Data.xlsx";
String screenshotfile = currentdirectory+"/screenshots/";
String reportfile = currentdirectory+"/zreport/Vtiger"+MyRandom.randomNumber()+".html";
}
