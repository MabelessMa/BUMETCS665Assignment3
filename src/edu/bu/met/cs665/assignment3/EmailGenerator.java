package edu.bu.met.cs665.assignment3;

public class EmailGenerator {
    public String generateEmail(CustomerType customerType) {
        Customer customer = CustomerFactory.createCustomer(customerType);
        return customer.generateEmail();
    }
}
