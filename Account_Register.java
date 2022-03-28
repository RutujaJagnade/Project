package Automation_Project;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Account_Register {
 
	 void Register()
	{
		// 1.Launch browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rutuja\\Desktop\\Selenium Jar\\chromedriver.exe" );
		WebDriver w=new ChromeDriver();

		// Open URL
		w.get("http://tutorialsninja.com/demo");
		w.manage().window().maximize();
		
		// Title check // URL Check
		System.out.println(w.getTitle());
		System.out.println(w.getCurrentUrl());
		
	    //My Account 
		w.findElement(By.linkText("My Account")).click();
		// Register
		w.findElement(By.linkText("Register")).click();
		
		//Adding Your Personal Details
		//firstname
		w.findElement(By.id("input-firstname")).sendKeys("Pranav");
		//lastname
		w.findElement(By.id("input-lastname")).sendKeys("Kale");
		//E-mail
		w.findElement(By.id("input-email")).sendKeys("KalePranav@gmail.com");
		//Telephone
		w.findElement(By.id("input-telephone")).sendKeys("1111111136");
		//input-password
		w.findElement(By.id("input-password")).sendKeys("00048");
		//input-confirm
		w.findElement(By.id("input-confirm")).sendKeys("00048");
		//Subscribe
		w.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
		//CheckBox
		w.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		
	
		//Continue
		w.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		//My Account 
		w.findElement(By.linkText("My Account")).click();
		w.findElement(By.linkText("Logout")).click();
		
		//Account logout Continue
		w.findElement(By.linkText("Continue")).click();
		
		// login
		w.findElement(By.linkText("My Account")).click();
		w.findElement(By.linkText("Login")).click();
		
		//To Login Enter Valid data
		//E-mail
		w.findElement(By.id("input-email")).sendKeys("KalePranav@gmail.com");
		//Password
		w.findElement(By.id("input-password")).sendKeys("00048");
		//click on login
		w.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		//logout
		w.findElement(By.linkText("Logout")).click();
		//Continue
		w.findElement(By.linkText("Continue")).click();
        
		//////////////////////////////////////////////////////////////////////////////////////
		
		//To Explorer Your Store 
		w.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")).click();
		   // To click on Image1=iPhone
		     w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[2]/a/img")).click();
		     //close Img1
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		     
	       // Iamge2
		     w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[3]/a/img")).click();
		     // Close img2
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		  
		   // Image3 
		     w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[4]/a/img")).click();
		     //close img3
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		     
		  // Image 4 
		     w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[5]/a/img")).click();
		     //close img4
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		     
		  // Image 5 
		     w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[6]/a/img")).click();
		     //close img5 
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		       
	   //Back To home page
		     w.navigate().back();
		    
		//To click on Image2=Canon EOS 5D   
		     w.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[1]/a/img")).click();
		     //img1 
		     w.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[2]/a/img")).click();
		     //close img1
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		     //img2 
		     w.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[3]/a/img")).click();
		     //close img2 
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		
	    //Back To home page
		     w.navigate().back();
		     
		 //To click on Image3=Apple Cinema 30 
		     w.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[1]/a/img")).click();
		     //Specification
		     w.findElement(By.linkText("Specification")).click();
		     //Img1
		     w.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[3]/a/img")).click();
		     //close img1
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		         
	    //Back To home page
		     w.navigate().back();
		          
		 //To click on Image4=MacBook
		     w.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")).click();
		     //Specification
		     w.findElement(By.linkText("Specification")).click();
		     //Img1
		     w.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[2]/a/img")).click();
		     //close Img1
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		     //Img2
		     w.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[3]/a/img")).click();
		     //close img2 
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		     //Img3
		     w.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[4]/a/img")).click();
		     //close img3
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		     //Img4
		     w.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[5]/a/img")).click();
		     //close img4
		     w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		
       //Back To home page
		     w.navigate().back();
		 
	}	     
		}

