package Concrete;

import Abstract.CustomerService;
import Abstract.UserValidationService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

	UserValidationService userValidationService;
	public CustomerManager(UserValidationService userValidationService) {
		this.userValidationService=userValidationService;
	}
	@Override
	public void add(Customer customer) {
		if(userValidationService.validate(customer)) {
			System.out.println("\n Kullanici eklendi  :"+customer.getFirstName()+" "+customer.getLastName());
		}
		else {
			System.out.println("Not a Valid person");
		}
	}

	@Override
	public void delete(Customer customer) {
		if(userValidationService.validate(customer)) {
			System.out.println("\n Kullanici silindi  :"+customer.getFirstName()+" "+customer.getLastName());
		}
		else {
			System.out.println("Not a Valid person");
		}
		
	}

	@Override
	public void update(Customer customer) {
		if(userValidationService.validate(customer)) {
			System.out.println("\n Kullanici guncellendi  :"+customer.getFirstName()+" "+customer.getLastName());
		}
		else {
			System.out.println("Not a Valid person");
		}
		
	}

}
