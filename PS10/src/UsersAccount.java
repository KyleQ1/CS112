public class UsersAccount {
    public int id;
    private double low, high, last;

    public UsersAccount(int id, String bal) {
        this.id = id;
        double balance = Double.parseDouble(bal.substring(1));
        low = balance;
        high = balance;
        last = balance;
    }

    public void add(String bal) {
        double balance = Double.parseDouble(bal.substring(1));
        last = balance;
        if (balance > high)
            high = balance;
        else if (balance < low)
            low = balance;
    }

    public String getLow() { return String.format("%.2f", low ); }

    public String getHigh() { return String.format("%.2f", high); }

    public String getLast() { return String.format("%.2f", last); }

}
