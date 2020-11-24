import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Comparable<Person>, Serializable {
    private final String name;
    private final long accountNumber;
    private final double balanceCash;
    private final boolean cashBack;

    public Person(String name, long accountNumber, double balanceCash, boolean cashBack) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balanceCash = balanceCash;
        this.cashBack = cashBack;
    }

    public String getName() {
        return name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalanceCash() {
        return balanceCash;
    }

    public boolean getCashBack() {
        return cashBack;
    }

    public String toString() {
        String formattedBalance = String.format("%.2f", getBalanceCash());
        if (getCashBack())
            return String.format("%20s%20s%10s%10s", getName(), getAccountNumber(), formattedBalance, "Yes");
        else
            return String.format("%20s%20s%10s%10s", getName(), getAccountNumber(), formattedBalance, "No");
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    public void save() throws Exception {
        ArrayList<Person> list = new ArrayList<>();

        FileOutputStream ostream = new FileOutputStream(accountNumber + ".dat");
        ObjectOutputStream objectOutputFile = new ObjectOutputStream(ostream);

        objectOutputFile.close();
    }
}
