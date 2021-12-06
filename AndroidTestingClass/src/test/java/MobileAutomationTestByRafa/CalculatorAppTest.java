package MobileAutomationTestByRafa;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorAppTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       
		//DesiredCapabilities object create and named as dc
		DesiredCapabilities dc=new DesiredCapabilities();
		
		//Mobile details
		dc.setCapability("deviceName","Galaxy S9+");
		dc.setCapability("udid","235021d0ca0c7ece");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","10");
	    
		//App Details
		dc.setCapability("appPackage","com.google.android.calculator");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		
		//192.168.1.7:5555
		
		//Server setup
		URL server= new URL("http://127.0.0.1:4723/wd/hub");
		
		//AppiumDriver object creation & send DesiredCapabilities information & server details
		AppiumDriver testobj= new AppiumDriver(server,dc);
		
		 //for verification purpose
		System.out.println("Hi,I'm Calcutest");
		
		//System.out.println("Addition is:"+result.getText());
		
		//Target (5+3)-(5*3)/2 & more option click
				//digit start bracket object create
				WebElement bracket1 =testobj.findElement(By.id("com.google.android.calculator:id/parens"));
				bracket1.click();
				
				//digit againstart bracket object create
				WebElement bracket2 =testobj.findElement(By.id("com.google.android.calculator:id/parens"));
				bracket2.click();
				
				//digit 5 object create
				WebElement digit5 =testobj.findElement(By.id("com.google.android.calculator:id/digit_5"));
				digit5.click();
				
				//addbtn object create
				WebElement addbtn =testobj.findElement(By.id("com.google.android.calculator:id/op_add"));
				addbtn.click();
				
				//digit 3
				WebElement digit3 =testobj.findElement(By.id("com.google.android.calculator:id/digit_3"));
				digit3.click();
				
				//digit stop bracket object create
				WebElement bracket3 =testobj.findElement(By.id("com.google.android.calculator:id/parens"));
				bracket3.click();
				
				//minus
				WebElement subbtn =testobj.findElement(By.id("com.google.android.calculator:id/op_sub"));
				subbtn.click();
				
				//bracket3 start
				WebElement bracket4 =testobj.findElement(By.id("com.google.android.calculator:id/parens"));
				bracket4.click();
		 
				//digit 5 mul object create
				WebElement digit5m =testobj.findElement(By.id("com.google.android.calculator:id/digit_5"));
				digit5m.click();
				
				//multiply
				WebElement mul =testobj.findElement(By.id("com.google.android.calculator:id/op_mul"));
				mul.click();
				
				//zero digit
				WebElement digit0 =testobj.findElement(By.id("com.google.android.calculator:id/digit_0"));
				digit0.click();
				
				//close bracket
				WebElement bracket5 =testobj.findElement(By.id("com.google.android.calculator:id/parens"));
				bracket5.click();
				
				//close bracket
				WebElement bracket6 =testobj.findElement(By.id("com.google.android.calculator:id/parens"));
				bracket6.click();
				
				//division
				WebElement div  =testobj.findElement(By.id("com.google.android.calculator:id/op_div"));
				div.click();
				
				//digit 2
				WebElement digit2 =testobj.findElement(By.id("com.google.android.calculator:id/digit_2"));
				digit2.click();
				
				//equalbtn object create
				WebElement eqBtn =testobj.findElement(By.id("com.google.android.calculator:id/eq"));
				eqBtn.click(); 
				
				//console show
				WebElement finalresult =testobj.findElement(By.id("com.google.android.calculator:id/result_final"));
				System.out.println("The equation is: "+"[("+digit5.getText()+addbtn.getText()+digit3.getText()+")"+subbtn.getText()+"{"+digit5.getText()+mul.getText()+digit0.getText()+"}]"+div.getText()+digit2.getText());
				System.out.println("The solution of the equation is: "+finalresult.getText());
				
				
				//more option Btn object create
				WebElement optbtn =testobj.findElement(By.xpath("//android.widget.ImageView[@content-desc='More options']"));
				optbtn.click();
				
				//history btn object create
				WebElement hbtn =testobj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
				hbtn.click(); 
				
				
				
	}

}
