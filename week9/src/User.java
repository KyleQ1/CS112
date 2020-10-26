public class User implements Comparable<User> {

    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return String.format("%20s%20s", password, username);
    }

    @Override
    public int compareTo(User u) {
        // compare length
        int compareLength = -Integer.compare(u.password.length(), password.length());
        // length is the same
        if (compareLength == 0)
            // passwords are the same
            if (password.compareToIgnoreCase(u.password) == 0)
                // compare username
                return username.compareToIgnoreCase(u.username);
            else
                // compare passwords
                return password.compareToIgnoreCase(u.password);
        else
            // password length differs
            return compareLength;
    }
}
