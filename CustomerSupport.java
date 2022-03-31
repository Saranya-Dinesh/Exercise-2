package org.kiot.customersupport;

import java.util.Scanner;
import org.kiot.customer.Customer;
public class CustomerSupport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		String emailId = scanner.next();
		if(customer.isValidEmailId(emailId)) {
			System.out.println("Valid emailId");
		} else {
			System.out.println("inValid emailId");
		}
	}
}
