package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver;

	public void LaunchApplication() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
   	 driver = new ChromeDriver();
   	driver.get("http://advantageonlineshopping.com/#/");
   	driver.manage().window().maximize();
   	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public void ClickOnUser() {
		WebElement user = driver.findElement(By.xpath("//a[@id='hrefUserIcon']"));
		user.click();
	}
	
	public void ClickOnUserName() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Vaishali");
	}
	
	public void ClickOnPassword() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vaishali123*");
	}
	
	public void ClickOnSign() {
		driver.findElement(By.xpath("//button[@id='sign_in_btnundefined']")).click();
	}
	public void CreateUserAccount() {
		WebElement userac = driver.findElement(By.linkText("CREATE NEW ACCOUNT"));
		userac.click();
	}
	
	public void CreateAccount() {
		WebElement username = driver.findElement(By.xpath("//input[@name ='usernameRegisterPage']"));
		username.sendKeys("Vaishali");
	}
	
	public void enteremail() {
		WebElement email = driver.findElement(By.xpath("//input[@name ='emailRegisterPage']"));
		email.sendKeys("vaishu54@yahoo.co.in");
	}
	
	public void EnterPassword() {
		WebElement password = driver.findElement(By.xpath("//input[@name ='passwordRegisterPage']"));
		password.sendKeys("Vaishali123*");
	}
	
	public void ConfirmPassword() {
		WebElement confpassword = driver.findElement(By.xpath("//input[@name ='confirm_passwordRegisterPage']"));
		confpassword.sendKeys("Vaishali123*");
	}
	
	public void SelectActiveCheckBox() 
    {
    	WebElement checkbox = driver.findElement(By.xpath("//input[@name ='i_agree']"));
    	if(checkbox.isSelected()==false)
    		checkbox.click();
    }
	
	public void ClickRegister() {
		driver.findElement(By.xpath("//button[@id='register_btnundefined']")).click();
	}
	
	public void ClickOnTablet() {
		driver.findElement(By.xpath("//div[@id='tabletsImg']")).click();
	}
	
	public void SelectTablet() {
		driver.findElement(By.xpath("//img[@id='16']")).click();
	}
	
	public void AddToCart() {
		driver.findElement(By.xpath("//button[@name='save_to_cart']")).click();
	}
	
	public void CheckCart() {
		driver.findElement(By.xpath("//a[@id='shoppingCartLink']")).click();
	}
	public void ClickonCheckOut() {
		driver.findElement(By.xpath("//button[text()='CHECKOUT ($1,009.00)']")).click();
	}
	
	public void ClickOnNext() {
		driver.findElement(By.xpath("//button[@id='next_btn']")).click();
	}
	public void SafePayUsername() {
		driver.findElement(By.xpath("//input[@name='safepay_username']")).sendKeys("Vaishali");
	}
	
	public void SafePayPassword() {
		driver.findElement(By.xpath("//input[@name='safepay_password']")).sendKeys("Vaishali123*");
	}
	
	public void ClickOnPay() {
		driver.findElement(By.xpath("//button[@id='pay_now_btn_SAFEPAY']")).click();
	}
	
	//abc
	

}
