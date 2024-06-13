package org.sam;

public class PageObject extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.flipkart.com/");
		windowMaximize();

		Flipkart f = new Flipkart();
		passText("Mop", f.getSearch());
		
		
		driver.navigate().refresh();
		passText("cotton kids wear", f.getSearch());
		clickBtn(f.getBotton());

	}

}
