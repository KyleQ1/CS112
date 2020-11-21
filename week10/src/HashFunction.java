import java.util.Set;
import java.util.TreeMap;

public class HashFunction {
    public static TreeMap<Integer, String> getAllHashes(Set<String> data) {
        TreeMap<Integer, String> keyData = new TreeMap<>();

        data.forEach(x -> {
            if (keyData.getOrDefault(getHash(x), "Not Present").equals("Not Present"))
                keyData.put(getHash(x), x);
        });

        return keyData;
    }

    public static int getHash(String hash) {
        return getHash(hash.toLowerCase().toCharArray());
    }

    public static int getHash(char[] hash) {
        int hashCode = 0;
        for (int i = 0; i < hash.length; i++) {
            if (Character.isLetter(hash[i])) {
                if (isVowel(hash[i]) != 0) {
                    hashCode+= isVowel(hash[i]);
                } else {
                    int position = findPosition(hash[i]);
                    hashCode+= position * (i + 1);
                }
            }
        }

        return hashCode;
    }

    private static int isVowel(char c) {
        if (c == 'a')
            return 100;
        else if (c == 'e')
            return 200;
        else if (c == 'i')
            return 300;
        else if (c == 'o')
            return 400;
        else if (c == 'u')
            return 500;
        else return 0;
    }

    private static int findPosition(char c) {
        // Converting char to its ascii value
        // ASCII value of lower case letters starts from 97
        return (int) c - 96;
    }
}
