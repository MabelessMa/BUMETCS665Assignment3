package edu.bu.met.cs665.assignment3;

public class CustomerFactory {
	public static Customer createCustomer(CustomerType type) {
        switch (type) {
            case BUSINESS:
                return new BusinessCustomer();
            case RETURNING:
                return new ReturningCustomer();
            case FREQUENT:
                return new FrequentCustomer();
            case NEW:
                return new NewCustomer();
            case VIP:
                return new VIPCustomer();
            default:
                throw new IllegalArgumentException("Unknown customer type: " + type);
        }
    }
}
