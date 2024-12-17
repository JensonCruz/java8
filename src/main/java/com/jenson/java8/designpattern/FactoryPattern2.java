package com.jenson.java8.designpattern;

public class FactoryPattern2 {

	public static void main(String[] args) {
		// Simulate user input
		String gatewayType = "PAYPAL";
		double amount = 100.00;

		// Get the appropriate payment gateway using the factory
		PaymentGateway paymentGateway = PaymentGatewayFactory.getPaymentGateway(gatewayType);

		// Process the payment
		paymentGateway.processPayment(amount);
	}

}

interface PaymentGateway {
	void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing credit card payment of $" + amount);
	}
}

class PayPalPayment implements PaymentGateway {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing PayPal payment of $" + amount);
	}
}

class UpiPayment implements PaymentGateway {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing UPI payment of $" + amount);
	}
}

class PaymentGatewayFactory {
	public static PaymentGateway getPaymentGateway(String gatewayType) {
		switch (gatewayType) {
		case "CREDIT_CARD":
			return new CreditCardPayment();
		case "PAYPAL":
			return new PayPalPayment();
		case "UPI":
			return new UpiPayment();
		default:
			throw new IllegalArgumentException("Invalid payment gateway type: " + gatewayType);
		}
	}
}
