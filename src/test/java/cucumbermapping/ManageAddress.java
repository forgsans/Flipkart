package cucumbermapping;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumMethods;

public class ManageAddress 
{
	@When("^user click on manage address$")
	public void user_click_on_manage_address() throws InterruptedException
	{
		Thread.sleep(3000);
		//Click on manage address
		Object[] input1=new Object[1];
		input1[0]="(//*[@class='NS64GK'])[1]";
		SeleniumMethods.click(input1);
	    
	}

	@When("^user click on ADD A NEW ADDRESS$")
	public void user_click_on_add_a_new_address() 
	{
		//Click on add new address
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_1QhEVk']";
		SeleniumMethods.click(input2);
	    
	}

	@When("^user enter \"(.*)\" as name$")
	public void user_enter_as_name(String name)
	{
		//Enter name
		Object[] input3=new Object[2];
		input3[0]="(//*[@type='text'])[2]";
		input3[1]="Lakshmi";	
		SeleniumMethods.sendKeysClassAndValue(input3);
	    
	}

	@When("^user enter \"(.*)\" as mobile number$")
	public void user_enter_as_mobile_number(String mobile) 
	{
		 //Enter mobile number
		 Object[] input4=new Object[2];
		 input4[0]="//*[@name='phone']";
		 input4[1]="8763457246";	
		 SeleniumMethods.sendKeysClassAndValue(input4);
	    
	}

	@When("^user enter \"(.*)\" as pincode$")
	public void user_enter_as_pincode(String pincode)
	{
		 //Enter pincode
		 Object[] input5=new Object[2];
		 input5[0]="//*[@name='pincode']";
		 input5[1]="500029";	
		 SeleniumMethods.sendKeysClassAndValue(input5);
		
		 SeleniumMethods.waitTime(2000);
    }

	@When("^user enter \"(.*)\" as locality$")
	public void user_enter_as_locality(String locality) 
	{
		 Object[] input6=new Object[2]; // Locality
		 input6[0]="(//*[@type='text'])[5]";
		 input6[1]="Ecil";
		 SeleniumMethods.sendKeysClassAndValue(input6);
	   
	}

	@When("^user enter \"(.*)\" as address$")
	public void user_enter_as_address(String address)
	{
		Object[] input7=new Object[2]; //Enter address
		input7[0]="//*[@name='addressLine1']";
	    input7[1]="Near bus stop";
	    SeleniumMethods.sendKeysClassAndValue(input7);
		 
	   
	}

	@When("^user click on save button$")
	public void user_click_on_save_button()
	{
		Object[] input8=new Object[1]; // Save button Click
		input8[0]="(//*[@type='button'])[2]";
	    SeleniumMethods.click(input8); 
		 
	    
	}

	@Then("^validate address is added successfully$")
	public void validate_address_is_added_successfully() 
	{
		Object[] input9=new Object[2]; //Enter address
		input9[0]="8763457246";
	    input9[1]="(//*[@class='_1Z7fmh _3CfVDh'])[1]";
	    SeleniumMethods.validation(input9);
		 
		
	   
	}
	
	

}
