
	package org.pojo;

	import org.base.BaseClass;
   
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class fbpojo extends BaseClass {

		//constructor - declare and initializing
		public fbpojo() {
			PageFactory.initElements(d, this);
		}
		
		//WebElement email = d.findElement(By.id("email"));
		//setters 
		@FindBy(id="email")
		private WebElement email;
		
		@FindBy(name="pass")
		private WebElement pass;
		
		@FindBy(name="login")
		private WebElement login;
		
		@FindBy(xpath = "//a[text()='Forgotten password?']")
		private  WebElement fpass;
		
		@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
		private  WebElement acc;
		
		@FindBy(name="firstname")
		private WebElement name;
		
		
		@FindBy(xpath = "//input[@aria-label='Surname']")
		private WebElement sname;
	   
	    @FindBy(id="u_j_d_SP")
	    private  WebElement regemail;
	
	    @FindBy(xpath="//*[@id=\"password_step_input\"]")
	    private WebElement pword;
	    
	    @FindBy(xpath="//*[@id=\"u_3_n_Pw\"]")
	    private WebElement sing;
	    
	    @FindBy(xpath="//img[@class='fb_logo _8ilh img']")
	    private WebElement title;
	    
	    
		
		
		
		
		
		//to pass values to the program 

		public WebElement getFpass() {
			return fpass;
		}

		public WebElement getAcc() {
			return acc;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLogin() {
			return login;
		}
		
		public WebElement getname() {
			return name;
		}
		
		public WebElement getsname() {
			return sname;
		}
		public WebElement getregemail()
		{
			return regemail;
		}
		

		public WebElement getpword() {
			return pword;
		}
		public WebElement getsing()
		{
			return sing;
		}
		
		public WebElement title()
		{
			return title;
		}

		public WebElement getSfeild() {
			// TODO Auto-generated method stub
			return null;
		}

			}

