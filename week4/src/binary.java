import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class binary
{
    public static void main(String[] args)
    {
        try {
            FileOutputStream basic = new FileOutputStream("numbers.dat");
            DataOutputStream writer = new DataOutputStream(basic);
            writer.writeInt(Integer.MAX_VALUE);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
