package org.dummy;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mytra extends BaseClass {
	public mytra() {
		PageFactory.initElements(d,this);
	}
	@FindBy(xpath = "\"//input[@class='desktop-searchBar']\"")
	private WebElement search;
    @FindBy(xpath ="(//div[@class='product-sliderContainer'])[1]")
    private WebElement watch;
		
	@FindBy(xpath="//div[text()='ADD TO BAG']")
	private WebElement bag;
	
	@FindBy(xpath= "//span[text()='Bag']")
	private WebElement cart;
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	public WebElement getWatch() {
		return watch;
	}
	public void setWatch(WebElement watch) {
		this.watch = watch;
	}
	public WebElement getBag() {
		return bag;
	}
	public void setBag(WebElement bag) {
		this.bag = bag;
	}
	public WebElement getCart() {
		return cart;
	}
	public void setCart(WebElement cart) {
		this.cart = cart;
	}
	
	}
    


