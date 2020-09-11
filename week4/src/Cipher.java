public class Cipher
{
    private String plainText;
    private String cipherText;
    private int key;

    public Cipher(String text, int key) throws EmptyPlainText, UselessKeyException {
        plainText = text;
        this.key = key;

        int secretKey = key % 26;
        if (text.equals("")) {
            throw new EmptyPlainText();
        }
        if (secretKey == 0) {
            throw new UselessKeyException(key);
        }

        StringBuilder encryptedText = new StringBuilder();
        char c;
        for (int i = 0; i < text.length(); i++)
        {
            c = text.charAt(i);
            // if c is letter ONLY then shift them, else directly add it
            if (Character.isLetter(c))
            {
                c = (char) (text.charAt(i) + secretKey);
                // System.out.println(c);

                // checking case or range check is important, just if (c > 'z'
                // || c > 'Z')
                // will not work
                if ((Character.isLowerCase(text.charAt(i)) && c > 'z')
                        || (Character.isUpperCase(text.charAt(i)) && c > 'Z'))

                    c = (char) (text.charAt(i) - (26 - secretKey));
            }
            else {
                c = (char) (text.charAt(i) + secretKey);
            }
            encryptedText.append(c);
        }
        cipherText = encryptedText.toString();
    }

    public String getPlainText() {
        return plainText;
    }

    public String getCipherText() {
        return cipherText;
    }

    public int getKey() {
        return key;
    }

}
