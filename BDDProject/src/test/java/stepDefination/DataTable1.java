package stepDefination;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class DataTable1
{
	@When("the following user credential")
	public void the_following_user_credential(DataTable table)
	{
		 Map<String,String> map = table.asMap(String.class,String.class);
		 
		 System.out.println(map.get("username"));
		 System.out.println(map.get("password"));
	}

}
