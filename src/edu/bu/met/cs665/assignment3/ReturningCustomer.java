package edu.bu.met.cs665.assignment3;

public class ReturningCustomer implements Customer {

	@Override
	public String generateEmail() {
		return "Dear Returning Customer,\n\nWelcome back! We’re thrilled to see you again and appreciate your loyalty.\n\nBest Regards,\nCompany Team";
	}

}
