	package org.pojo;

	import org.base.BaseClass;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

		public class AzPojo extends BaseClass {
			
			public AzPojo() {
				PageFactory.initElements(d,this);
			}

			@FindBy(id = "twotabsearchtextbox")
			private WebElement search;

			public WebElement getSubmit() {
				return submit;
			}

			@FindBy(id = "nav-search-submit-button")
			private WebElement submit;

			public WebElement getSearch() {
				return search;
			}
		}


