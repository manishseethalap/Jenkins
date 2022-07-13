package generic;

public class Browsers {
	PropertiesFile prop = new PropertiesFile();
	
public void browser() throws Throwable {

	prop.propertyFileData("browser");
}
public static void main(String[] args) throws Throwable {
	Browsers br = new Browsers();
	br.browser();
}
}
