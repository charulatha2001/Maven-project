package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart extends BaseClass {
	public Flipkart() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@class='Pke_EE']")
	private WebElement search;
	
	@FindBy(xpath = "//button[@class='_2iLD__']")
	private WebElement Botton;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getBotton() {
		return Botton;
	}

}
