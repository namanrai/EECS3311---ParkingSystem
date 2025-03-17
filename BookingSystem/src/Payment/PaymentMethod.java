package Payment;

public abstract class PaymentMethod {
    protected float amount;

    public PaymentMethod( float amount ){
        this.amount = amount;
    }

    public abstract boolean processPayment();

}
