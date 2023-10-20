package week1.day1;

public class Browser {
public String launchBrowser(String browserName) {
	System.out.println("Browser launched successfully");
	return browserName;
	
	}
public void loadurl() {
	System.out.println("Applicatiopn url loaded successfully");
	
}
public static void main(String[] args) {
	
	Browser chrome = new Browser();
	chrome.launchBrowser("Chrome");
	chrome.loadurl();
	
}
}
