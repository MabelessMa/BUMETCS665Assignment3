package edu.bu.met.cs665.assignment3;

public class Main {
    public static void main(String[] args) {
        // Iterate over each customer type and generate emails
        for (CustomerType type : CustomerType.values()) {
            EmailGenerator emailGenerator = new EmailGenerator();
            System.out.println(emailGenerator.generateEmail(type));
            System.out.println("------------------------------------------------");
        }
    }
}

