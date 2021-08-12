package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMethods 
{
	public static WebDriver driver=null; //WebDriver is an interface. Can be used to open any browser. Ex:Chrome, Firefox,Opera, Edge..
	// private static String[] inputParameters;
	
	//browserLaunch by using array. Using Object array and reference variable is inputParameters
	//Object is a parent of all the data types. It accepts integers, string, float, double, char,boolean...
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	//public static Hashtable<String,Object> browserLaunch(Object[] inputParameters) //2 Parameters
	
	public static Hashtable<String,Object> browserLaunch(Object[] inputParameters) //2 Parameters

	{
		try 
		{
			String strBrowserName=(String) inputParameters[0]; //Browser Name
			String webDriverExpath=(String) inputParameters[1]; //exe
			
			if(strBrowserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", webDriverExpath);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
			
			else if(strBrowserName.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", webDriverExpath);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
			
			outputParameters.put("Status", "Pass");
			outputParameters.put("Message", "Action:browserLaunch,Input Given:" +inputParameters[0].toString());
		} 
		catch(Exception e)
		{
			outputParameters.put("Status", "Fail");
			outputParameters.put("Message", "Action:browserLaunch,Input Given:" +inputParameters[0].toString());		
		}
		
		return outputParameters;
	}
	
	/* public static Hashtable<String,Object> browserLaunch(Object[] inputParameters) //2 Parameters //BrowserLaunch
	

		{
			try 
			{
				String strBrowserName=(String) inputParameters[0]; //Browser Name
				String webDriverExpath=(String) inputParameters[1]; //exe
				
				if(strBrowserName.equalsIgnoreCase("Chrome"))
				{
					System.setProperty("webdriver.chrome.driver", webDriverExpath);
					driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				}
				
				else if(strBrowserName.equalsIgnoreCase("Firefox"))
				{
					System.setProperty("webdriver.gecko.driver", webDriverExpath);
					driver=new FirefoxDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				}
			} 
			catch(Exception e)
			{
				System.out.println(e);	
			}
			} */
	
	/*public static Hashtable<String,Object> click2(Object xpath1, String xpath2) //1 Parameter
	{
		driver.findElement(By.xpath((String)xpath1)).click();
		driver.findElement(By.xpath(xpath2)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}*/

	//click
	public static Hashtable<String,Object> click(Object[] inputParameters) //1 Parameter
	{
		try
		{
		  String xpath=(String) inputParameters[0];
		  driver.findElement(By.xpath(xpath)).click();
		  
		  Thread.sleep(1000);
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  outputParameters.put("Status", "Pass");
		  outputParameters.put("Message", "Action:click,Input Given:" + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("Status", "Fail");
			outputParameters.put("Message", "Action:click,Input Given:" +inputParameters[0].toString());		}
		
		return outputParameters;

	}
	
	//mouseOver
	public static Hashtable<String,Object> mouseOver(Object[] inputParameters)
	{
		try
		{
		  String xpath=(String) inputParameters[0]; //xpath
		  Actions act=new Actions(driver);
		  WebElement mouse=driver.findElement(By.xpath(xpath));
		  act.moveToElement(mouse).build().perform();
		  System.out.println("Successfully moved to given element");
		  Thread.sleep(1000);
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  outputParameters.put("Status", "Fail");
		  outputParameters.put("Message", "Action:mouseOver,Input Given:" +inputParameters[0].toString());
			
	    }
		catch(Exception e)
		{
		   outputParameters.put("Status", "Pass");
		   outputParameters.put("Message", "Action:mouseOver,Input Given:" +inputParameters[0].toString());		}
		
		return outputParameters;
	}
	
	//openApplication
	public static Hashtable<String,Object> openApplication(Object[] inputParameters) //1 parameter
	{
		try
		{
		  String Url=(String) inputParameters[0];
		  driver.get(Url);
		  String Url1=driver.getCurrentUrl(); 
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
          System.out.println("The Url of the website is" +Url);
          
          outputParameters.put("Status", "Pass");
		  outputParameters.put("MEssage", "Action:openApplication,Input Given:" +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("Status", "Fail");
			outputParameters.put("Message", "Action:openApplication,Input Given:" +inputParameters[0].toString());		}
		
		return outputParameters;
	}
	
	//sendKeys
	public static Hashtable<String,Object> sendKeys(Object[] inputParameters) //2 parameters
	{
		try
		{
		  String userId=(String) inputParameters[1];
		  String pwd = (String) inputParameters[3];
		  String xPathUserId = (String) inputParameters[0];
		  String xPathPwd = (String) inputParameters[2];

		  driver.findElement(By.xpath(xPathPwd)).sendKeys(pwd);
		  driver.findElement(By.xpath(xPathUserId)).sendKeys(userId);
          driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
          
          outputParameters.put("Status", "Pass");
		  outputParameters.put("Message", "Action:sendKeys,Input Given:" +inputParameters[1].toString());
		
	   }
		catch(Exception e)
		{
			outputParameters.put("Status", "Fail");
			outputParameters.put("Message", "Action:sendKeys,Input Given:" +inputParameters[1].toString());
					}	
		
		return outputParameters;
	}

	public static Hashtable<String,Object> sendKeysClassAndValue(Object[] inputParameters) //2 parameters
	{
		try
		{
			String classPath = (String) inputParameters[0];
		    String value = (String) inputParameters[1];

		    driver.findElement(By.xpath(classPath)).sendKeys(value);
		    
		    outputParameters.put("Status", "Pass");
			outputParameters.put("Message", "Action:sendKeysClassAndValue,Input Given:" +inputParameters[1].toString());
			
	    }
		catch(Exception e)
		{
			 outputParameters.put("Status", "Fail");
			 outputParameters.put("Message", "Action:sendKeysClassAndValue,Input Given:" +inputParameters[1].toString());
						}
		
		return outputParameters;
	}
	
	public static Hashtable<String,Object> dropdown(Object[] inputParameters) //2 parameters
	{
		try 
		{
			String xpath1=(String)inputParameters[0];
			String value=(String)inputParameters[1];
			
			Select sel=new Select(driver.findElement(By.xpath(xpath1)));
			
			sel.selectByVisibleText(value);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		return outputParameters;
		
	}
	
	public static Hashtable<String,Object> validation(Object[] inputParameters)
	{
		try 
		{
		String given=(String)inputParameters[0];
		String xpath=(String)inputParameters[1];
		
		String text=driver.findElement(By.xpath(xpath)).getText();
		
		if(text.equalsIgnoreCase(given))
		{
			outputParameters.put("Status", "Pass");
			outputParameters.put("Message", "Action:validation,Input Given:" +inputParameters[0].toString());			
		}
		else
		{
			outputParameters.put("Status", "Fail");
			outputParameters.put("Message", "Action:validation,Input Given:" +inputParameters[0].toString());			
		}
		    outputParameters.put("Status", "Fail");
		    outputParameters.put("Message", "Action:validation,Input Given:" +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("Status", "Fail");
			outputParameters.put("Message", "Action:validation,Input Given:" +inputParameters[0].toString());
		}
		
		return outputParameters;
		
	    }
	
	}
