package org.kiot.customer;

public class Customer {
	public boolean isValidEmailId(String emailId ) {
		if( ((emailId.startsWith(".") || emailId.startsWith("@")) == false) ){
			if(emailId.endsWith("m") || emailId.endsWith("n")){
				int count = 0;
				for(int i = 0; i< emailId.length(); i++) {
					if(emailId.charAt(i) == '@') {
						count++;
					}
				}
				if(count == 1) {
					if(emailId.length() == 10 || emailId.length()<=30)
						return true;
				}
			}
		}
		return false;
	}
}
	
