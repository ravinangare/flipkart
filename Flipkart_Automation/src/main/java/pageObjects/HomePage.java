package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 public HomePage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath= "//input[@title='Search for products, brands and more']") 
	 private WebElement searchbox;
	 
	 @FindBy(xpath = "//button[@class='L0Z3Pu']") 
	 private WebElement searchbutton;
	 
	 @FindBy(xpath = "//a[contains(text(),'HP Pavilion Gaming Ryzen 5 Quad Core 3550H - (8 GB/1 TB')]") 
	 private WebElement searchproduct;
	 
	 public void enter_searchProduct(String element) {
		 searchbox.sendKeys(element);
		 }
	 public void click_onsearchbtn() {
		 searchbutton.click();
		 }
	 public void click_onsearchproduct() {
		 searchproduct.click();
		 }
	 public void enter_search() {
		 enter_searchProduct("hp laptop");
		 }
}
