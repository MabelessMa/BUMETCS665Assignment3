package edu.bu.met.cs665.assignment3;

public class BusinessCustomer implements Customer {

	@Override
	public String generateEmail() {
		
		return "Dear Business Customer,\n\nThank you for your business partnership. We value our collaboration and look forward to continued success.\n\nBest Regards,\nCompany Team";
	}

}
