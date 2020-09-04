public class SmartPhone extends Phone
{
    private String email;

    public SmartPhone() {
        this.email = "None";
    }

    public SmartPhone(String name, String phone) {
        super(name, Long.parseLong(phone));
        this.email = "None";
    }

    public SmartPhone(String name, String phone, String email) {
        super(name, Long.parseLong(phone));
        this.email = email;
    }

    public String toString() {
        String output = "Name: " + super.name + "\n";
        if (super.number == -1) {
            output += "Phone: Not set\n";
        }
        else {output+= "Phone: " + super.number + "\n";}
        output+= "Email: " + this.email + "\n";
        return output;
    }

    public boolean hasPhoneNumber() {
        return super.number != -1;
    }

    public long getAreaCode() {
        return Long.parseLong(Long.toString(this.number).substring(0,3));
    }

    public long getPrefix() {
        return Long.parseLong(Long.toString(this.number).substring(3,6));
    }

    public long getLineNumber() {
        return Long.parseLong(Long.toString(this.number).substring(6,10));
    }

    public String getTeleponeNeighbor() {
        if (this.number != -1) {
            long telephoneNeighbor = this.number + 1;
            return "(" + Long.parseLong(Long.toString(telephoneNeighbor).substring(0,3))
                    + ") " + Long.parseLong(Long.toString(telephoneNeighbor).substring(3,6))
                    + "-" + Long.parseLong(Long.toString(telephoneNeighbor).substring(6,10));
        }
        else {
            return "Cannot calculate phone number neighbor";
        }
    }
}
