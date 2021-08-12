package cucumbermapping;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumMethods;

public class LoginFlipkart 
{
	@Given ("^user opens \"(.*)\" browser and exe \"(.*)\"$")
	public void user_opens_browser_and_exe(String bname, String exe)
	{
		Object[] input=new Object[2];
		input[0]=bname ;
		input[1]=exe;
		SeleniumMethods.browserLaunch(input);
	   
	}

	@Given("^user enters url as \"(.*)\"$")
	public void user_enters_url_as(String url) 
	{
		Object[] input1=new Object[1];
		input1[0]=url ;
		SeleniumMethods.openApplication(input1);
	   
	}

	@Given("^user cancel the initial login window$")
	public void user_cancel_the_initial_login_window()
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']"; 
		SeleniumMethods.click(input2);
	   
	}

	@Given("^user move on Login button$")
	public void user_move_on_login_button() 
	{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumMethods.mouseOver(input3);
	    
	}

	@When("^user click on my profile$")
	public void user_click_on_my_profile()
	{
		Object[] input4=new Object[1];
		input4[0] = "//div[normalize-space()='My Profile']";
		Hashtable<String,Object> output4 = SeleniumMethods.click(input4);
		
		HTMLReportGenerator.StepDetails(output4.get("Status").toString(), "^user click on my profile$", output4.get("Message").toString());
		
		
	   
	}

	@When("^user enter \"(.*)\" as username$")
	public void user_enter_as_username(String uname)
	{
		Object[] input5=new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]=uname;
		Hashtable<String,Object> output5=SeleniumMethods.sendKeysClassAndValue(input5);
		HTMLReportGenerator.StepDetails(output5.get("Status").toString(), "^user enter \"(.*)\" as username$", output5.get("Message").toString());

	   
	}

	@When("^user enter \"(.*)\" as password$")
	public void user_enter_as_password(String password)
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1]=password;
		Hashtable<String,Object> output6=SeleniumMethods.sendKeysClassAndValue(input6);		
		HTMLReportGenerator.StepDetails(output6.get("Status").toString(), "^user enter \"(.*)\" as password$", output6.get("Message").toString());

	}

	@When("^user click on Login button$")
	public void user_click_on_login_button()
	{
		Object[] input7=new Object[1];
		input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String,Object> output7=SeleniumMethods.click(input7);
		HTMLReportGenerator.StepDetails(output7.get("Status").toString(), "^user click on Login button$", output7.get("Message").toString());

	}

	@Then("^valid login page$")
	public void valid_login_page()
	{
		Object[] input8=new Object[2];
		input8[0]="Sandhya G";
		input8[1]="//*[@class='_1ruvv2']";
		Hashtable<String,Object> output8=SeleniumMethods.validation(input8);
		HTMLReportGenerator.StepDetails(output8.get("Status").toString(), "^valid login page$", output8.get("Message").toString());

	    
	}

	
	
}
