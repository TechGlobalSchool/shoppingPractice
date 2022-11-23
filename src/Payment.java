public class Payment {

    public static final String askCardNumber = "What is your card number?";
    public static final String askCardName = "What is the name on the card?";
    public static final String askExp = "What is your card's expiration date?";
    public static final String askSecurityCode = "What is your card's security code?";

    public Payment(String cardNumber, String expDate, String nameOnTheCard, String securityCode) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.nameOnTheCard = nameOnTheCard;
        this.securityCode = securityCode;
    }

    public String cardNumber;
    public String expDate;
    public String nameOnTheCard;
    public String securityCode;

    public static Payment createPayment(){
        String cardNumber = ScannerHelper.getString(askCardNumber);
        String expDate = ScannerHelper.getString(askExp);
        String nameOnTheCard = ScannerHelper.getString(askCardName);
        String securityCode = ScannerHelper.getString(askSecurityCode);

        return new Payment(cardNumber, expDate, nameOnTheCard, securityCode);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expDate='" + expDate + '\'' +
                ", nameOnTheCard='" + nameOnTheCard + '\'' +
                ", securityCode='" + securityCode + '\'' +
                '}';
    }

}
