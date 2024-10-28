# BUMETCS665Assignment3

## Implementation Description
The "Email Generation" application is designed to send personalized emails to various customer segments of a company, such as Business, Returning, Frequent, New, and VIP customers. The application uses a Factory Method Pattern to create instances of different customer types. This pattern allows the system to extend easily if new customer segments need to be added in the future.

Customer Interface: The Customer interface defines the generateEmail() method, which each customer type class implements. This method is responsible for returning a unique email message for each customer type.

Customer Type Classes: The classes BusinessCustomer, ReturningCustomer, FrequentCustomer, NewCustomer, and VIPCustomer each implement the Customer interface. Each class customizes the generateEmail() method to return a message specific to that customer type.

CustomerType Enum: CustomerType is an enumeration representing the different customer segments (Business, Returning, Frequent, New, and VIP). It helps to specify customer types in a clear, type-safe way.

CustomerFactory: CustomerFactory is a factory class responsible for creating instances of each customer type. It contains a single method, createCustomer(CustomerType type), which takes a CustomerType as input and returns an instance of the respective customer type class. This single factory class replaces multiple factory classes for each customer type, reducing redundancy and simplifying the design.

EmailGenerator: The EmailGenerator class is responsible for generating an email by calling CustomerFactory.createCustomer(CustomerType). It takes a CustomerType parameter and generates an email by invoking generateEmail() on the created Customer object.

Main Class: The Main class demonstrates the functionality of the application. It iterates through each customer type, generates an email for each, and prints it to the console. Each output is separated by a line for clarity.

JUnit Tests: The application includes unit tests in EmailGeneratorTest to verify that each customer type produces the correct email content. These tests validate the correctness of the generateEmail method in the EmailGenerator class.

## UML Class Diagram
Below is a description of the UML class diagram content, representing the class structure and relationships.

Classes and Interfaces:

Customer (Interface): Defines a single method generateEmail(): String.
CustomerType (Enum): Enum with constants BUSINESS, RETURNING, FREQUENT, NEW, and VIP.
BusinessCustomer, ReturningCustomer, FrequentCustomer, NewCustomer, VIPCustomer: Each implements Customer and provides a specific implementation for generateEmail.
CustomerFactory: Contains a static method createCustomer(CustomerType type): Customer which instantiates and returns the appropriate customer type.
EmailGenerator: Contains a method generateEmail(CustomerType type): String which uses CustomerFactory to create a Customer object and generates an email message.
Main: A class with a main(String[] args) method to demonstrate the application.

Relationships:

Customer interface is implemented by BusinessCustomer, ReturningCustomer, FrequentCustomer, NewCustomer, and VIPCustomer.
CustomerFactory has a dependency on CustomerType (uses it to determine the customer type to create).
EmailGenerator depends on CustomerFactory to obtain a Customer object for generating the email.
Main class demonstrates usage of EmailGenerator with different CustomerType values.

Attributes and Methods:

Customer: +generateEmail(): String
CustomerFactory: +createCustomer(type: CustomerType): Customer
EmailGenerator: +generateEmail(type: CustomerType): String
Main: +main(args: String[]): void

Diagram Structure:

Customer is at the top as an interface.
The five customer type classes (BusinessCustomer, ReturningCustomer, etc.) are shown below Customer, with a solid line and an open arrow indicating they implement Customer.
CustomerFactory is shown separately, with an association to CustomerType and a dependency to the Customer interface.
EmailGenerator depends on CustomerFactory.
Main interacts with EmailGenerator and CustomerType.
