public class ValidateCreditCard
{
    private int sum;
    private final String creditCard;

    public ValidateCreditCard(long creditCard) {
        this.creditCard = String.valueOf(creditCard);

        boolean secondRound = false;
        // start at the right hand side of credit card
        for (int i = this.creditCard.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(this.creditCard.charAt(i));

            if (secondRound) {
                num*= 2;
                if (num > 9) {
                    num-= 9;
                }
            }
            sum+= num;
            secondRound = !secondRound;
        }

    }

    public int getSum() {
        return sum;
    }

    public String CheckValidity() {
        if (sum % 10 == 0) {
            return "VALID";
        }
        else {
            return "INVALID";
        }
    }

    public String toString() {
        StringBuilder formattedCreditCard = new StringBuilder();
        for (int i = 0; i < creditCard.length(); i++) {
            if (i % 4 == 0)
                formattedCreditCard.append(" ");
            formattedCreditCard.append(creditCard.charAt(i));
        }
        return String.valueOf(formattedCreditCard);
    }
}
