import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Question5 {
    public static HashMap<Integer, UsersAccount> loadUsers(String fileName) {
        HashMap<Integer, UsersAccount> users = new HashMap<>();
        try {
            Scanner inputFile = new Scanner(new File(fileName));

            inputFile.nextLine();
            while (inputFile.hasNextLine()) {
                String[] userInfo = inputFile.nextLine().split("\t", 2);

                int userID = Integer.parseInt(userInfo[0]);

                UsersAccount knownUsers = users.get(userID);

                if (knownUsers == null)
                    users.put(userID, new UsersAccount(userID, userInfo[1]));
                else {
                    knownUsers.add(userInfo[1]);
                    users.put(userID, knownUsers);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        return users;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a filename");

        HashMap<Integer, UsersAccount> users = loadUsers(keyboard.nextLine());

        users.forEach((x, y) -> {
            System.out.println("Customer " + x + ": Last balance: $" + y.getLast() + " High balance: $" + y.getHigh()
                    + " Low balance: $" + y.getLow());
        });
    }
}
