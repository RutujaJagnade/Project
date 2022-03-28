package Automation_Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class YourStrore_Mouse_Over {
	
	void Mouse_over() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rutuja\\Desktop\\Selenium Jar\\chromedriver.exe" );
		WebDriver w=new ChromeDriver();
		w.get("http://tutorialsninja.com/demo");
		w.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) w;
		js.executeScript("window.scrollBy(0,2000)");

		// TO check Mouseover on home page 
		// Desktop=Show all Desktop 
		Actions a=new Actions(w);
		a.moveToElement(w.findElement(By.linkText("Desktops"))).build().perform();
		w.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a")).click();

		w.findElement(By.id("grid-view")).click();

		Select SortBy=new Select(w.findElement(By.id("input-sort")));
		SortBy.selectByVisibleText("Price (High > Low)");

		Select Show=new Select(w.findElement(By.id("input-limit")));
		Show.selectByVisibleText("50");

		//Laptops & Notebooks
		a.moveToElement(w.findElement(By.linkText("Laptops & Notebooks"))).build().perform();
		w.findElement(By.linkText("Show All Laptops & Notebooks")).click();

		JavascriptExecutor java = (JavascriptExecutor) w;
		java.executeScript("window.scrollBy(0,1000)");

		//Components
		a.moveToElement(w.findElement(By.linkText("Components"))).build().perform();
		w.findElement(By.linkText("Monitors (2)")).click();
		//Components=Apple Cinema 30"
		w.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[1]/a/img")).click();
		w.findElement(By.linkText("Specification")).click();
		w.navigate().back();

		//Components=Samsung SyncMaster 941BW
		w.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[1]/a/img")).click();

		//Tables
		a.moveToElement(w.findElement(By.linkText("Tablets"))).build().perform();
		w.findElement(By.linkText("Tablets")).click();

		//Software
		a.moveToElement(w.findElement(By.linkText("Software"))).build().perform();
		w.findElement(By.linkText("Software")).click();

		//Phones & PDAs
		a.moveToElement(w.findElement(By.linkText("Phones & PDAs"))).build().perform();
		w.findElement(By.linkText("Phones & PDAs")).click();
		
		JavascriptExecutor PhonePad = (JavascriptExecutor) w;
		PhonePad.executeScript("window.scrollBy(0,1000)");
		
		w.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")).click();
		//img1
		w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[2]/a/img")).click();
		//close img1
		w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		//img2
		w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[3]/a/img")).click();
		//close img2
		w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		//img3
		w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[4]/a/img")).click();
		//close img3
		w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		//img4
		w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[5]/a/img")).click();
		//close img4
		w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		//img5
		w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[6]/a/img")).click();
		//closeimg5
		w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
	
	//Camera
		a.moveToElement(w.findElement(By.linkText("Cameras"))).build().perform();
		w.findElement(By.linkText("Cameras")).click();
		
		// Canon EOS 5D
		  w.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")).click();
		  w.navigate().back();
		// Nikon D300
		  w.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")).click();
    //MP3 Players
		a.moveToElement(w.findElement(By.linkText("MP3 Players"))).build().perform();
		w.findElement(By.linkText("test 15 (0)")).click();
	 //Continue
		w.findElement(By.linkText("Continue")).click();
	    //
		a.moveToElement(w.findElement(By.linkText("MP3 Players"))).build().perform();
		w.findElement(By.linkText("Show All MP3 Players")).click();
		
		
		////////////////////////////////////////////////////////////////////////////////////
		//iPod Shuffle
		w.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[3]/div/div[1]/a/img")).click();
		//img1
		w.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[2]/a/img")).click();
		//close img1
		w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		//img2
		w.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[3]/a/img")).click();
		//close img2
		w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		//img3
		w.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[4]/a/img")).click();
		//close img3
		w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		//img4
		w.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[5]/a/img")).click();
		//close img4
		w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		
		// Add-cart
		w.findElement(By.id("button-cart")).click();
		// Go to Cart ////*[@id="cart"]/ul/li[2]/div/p/a[1]
		w.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
		////*[@id="cart"]/ul/li[2]/div/p/a[1]/strong
		w.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();
		//Estimate Shipping & Taxes 
		w.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).click();
		
		//Country
		Select country =new Select(w.findElement(By.id("input-country")));
		country.selectByValue("99");
		
		//Region / State
		Select state =new Select(w.findElement(By.id("input-zone")));
		state.selectByValue("1500");
		
		//Post Code
		 w.findElement(By.id("input-postcode")).sendKeys("403801");
		 //button-quote
		
	 //Checkout Button
		 w.findElement(By.linkText("Checkout")).click();
		 //Continue Shopping
		 w.findElement(By.linkText("Continue Shopping")).click();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Account_Register obj= new Account_Register();
		obj.Register();
	
		YourStrore_Mouse_Over obj1=new YourStrore_Mouse_Over();
		obj1.Mouse_over();

	}
}
