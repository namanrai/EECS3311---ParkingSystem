package Payment;

import Payment.User;

import java.time.LocalDateTime;

class Card  {
    private int cardNumber;
    private User cardHolder;
    private String billingAddress;
    private String cardType;
    private int CVV;
    private int expirationDate;

    public Card(int cardNumber, User cardHolder, String billingAddress, String cardType, int CVV, int expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.billingAddress = billingAddress;
        this.cardType = cardType;
        this.CVV = CVV;
        this.expirationDate = expirationDate;
    }

    // Ensure validateCard() is public
    public boolean validateCard() {
        return expirationDate > LocalDateTime.now().getYear();
    }

    public boolean processPaymentAmount(float amount) {
        return amount > 0; // Simulating a successful payment
    }
}
