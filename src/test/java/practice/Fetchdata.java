package practice;
import generic.DataFile;

public class Fetchdata {

public static void main(String[] args) throws Throwable {
	DataFile datas = new DataFile();
	String value = datas.xlsxFileData("Sheet1", 0, 2);
	System.out.println(value);
}
}
