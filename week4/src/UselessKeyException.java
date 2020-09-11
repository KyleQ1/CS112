public class UselessKeyException extends Exception
{
    private int key;

    UselessKeyException(int key) {
        super("Error: Key is divisible by 26. That's a bad key!");
        this.key = key;
    }

    public int getUselessKey() {
        return key;
    }
}
