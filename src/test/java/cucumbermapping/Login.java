package cucumbermapping;

import org.openqa.selenium.interactions.Actions;

import utility.SeleniumMethods;

public class Login {
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		Object[] input=new Object[2]; //browserLaunch
        input[0]="Chrome";
        input[1]="C:\\\\Sandhya\\\\Training\\\\Automation_Support_Tools\\\\chromedriver.exe";
        SeleniumMethods.browserLaunch(input);  
		 
		 
		 Object[] input1=new Object[1]; //openApplication
		 input1[0]="https://www.flipkart.com/";
		 SeleniumMethods.openApplication(input1);  
		 
		 
		 Object[] input2=new Object[1]; //click 
		 input2[0]="//*[@class='_2KpZ6l _2doB4z']"; //Cancel action
		 SeleniumMethods.click(input2);
		 
		 
		 Object[] input3=new Object[1]; //MouseOver
		 input3[0]="//*[@class='_1_3w1N']"; //Login action
		 SeleniumMethods.mouseOver(input3);

		 
		 Object[] input4=new Object[1];
		 input4[0]="//div[normalize-space()='My Profile']";
	   	 SeleniumMethods.click(input4);

		 
		 Object[] input5=new Object[2]; //sendKeys
		 input5[0]="//*[@class='_2IX_2- VJZDxU']"; // username xpath class
		 input5[1]="8106367400"; //username
		 SeleniumMethods.sendKeysClassAndValue(input5);
		 
		 Object[] input6=new Object[2]; //sendKeys
         input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']"; //pwd xpath class
		 input6[1]="Flipkart123"; //Pwd
		 SeleniumMethods.sendKeysClassAndValue(input6);		          

		 Object[] input7=new Object[1]; //click
		 input7[0]= "//*[@class='_2KpZ6l _2HKlqd _3AWRsL']"; //click on login
		 SeleniumMethods.click(input7);	
		 
		 Object[] input8=new Object[1]; // Click on manage address
		 input8[0]="(//*[@class='NS64GK'])[1]";
		 SeleniumMethods.click(input8);
		 
		 Object[] input9=new Object[1]; //Click on add new address
		 input9[0]="//*[@class='_1QhEVk']";
		 SeleniumMethods.click(input9);
		
		 Object[] input10=new Object[2]; //Enter name SendKeys
		 input10[0]="(//*[@type='text'])[2]";
		 input10[1]="Lakshmi";
		 SeleniumMethods.sendKeysClassAndValue(input10);
		 
		 Object[] input11=new Object[2]; //Enter mobile number
		 input11[0]="//*[@name='phone']";
		 input11[1]="8763457246";
		 SeleniumMethods.sendKeysClassAndValue(input11);
		 
		 Object[] input12=new Object[2]; //Enter pincode
		 input12[0]="//*[@name='pincode']";
		 input12[1]="500029";
		 SeleniumMethods.sendKeysClassAndValue(input12);

		 Thread.sleep(3000);		

		 Object[] input13=new Object[2]; // Locality
		 input13[0]="(//*[@type='text'])[5]";
		 input13[1]="Ecil";
		 SeleniumMethods.sendKeysClassAndValue(input13); 
		 
		 Object[] input14=new Object[2]; //Enter name SendKeys
		 input14[0]="//*[@name='addressLine1']";
		 input14[1]="Near bus stop";
		 SeleniumMethods.sendKeysClassAndValue(input14);
		 
		 Object[] input15=new Object[1]; // Save button Click
		 input15[0]="(//*[@type='button'])[2]";
		 SeleniumMethods.click(input15); 
		 
		 
		 
		 
		 

		
	
	
	
	}

}
