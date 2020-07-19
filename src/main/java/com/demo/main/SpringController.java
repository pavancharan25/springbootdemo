package com.demo.main;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.demo.model.*;
@RestController

@RequestMapping("/gcopy")
public class SpringController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String disp()
	{
		return ("Pavan Charan");
	}
	@PostMapping(path = "/save-cust-info")
	public String customerinformation(@RequestBody CustomerInfo cust)
	{
		 return "Customer information saved successfully ::." + cust.getCustomerNo() + " " + cust.getCustomerName() + " " + cust.getCountry();
	}

	@RequestMapping(value = "/empid/{Id}", method = RequestMethod.GET)
	public int display(@PathVariable int Id)
	{
		return (Id*1000);
	}
	
	@RequestMapping(value = "/empid/{fname}/{lname}", method = RequestMethod.GET)
	public String concat(@PathVariable("fname") String fname,@PathVariable("lname") String lname)
	{
		return ("Mr "+fname+" "+lname);
	}
	
	@RequestMapping(value = "/empname", method = RequestMethod.GET)
	public String concat2(@RequestParam(name="fname") String fname,@RequestParam(name="lname") String lname)
	{
		return ("Mr "+fname+" along with "+lname);
	}
}
