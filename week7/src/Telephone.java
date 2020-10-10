import java.util.ArrayList;

public class Telephone
{
    private String phone;
    private ArrayList<String> list = new ArrayList<String>();

    public Telephone(String phone) {
        this.phone = phone;
    }

    private void getPossibilities(String word, int iterator) {
        if (iterator < phone.length()) {
            char letter = phone.charAt(iterator);
            switch (letter) {
                case '0':
                    getPossibilities(word + "0", iterator + 1);
                    break;
                case '1':
                    getPossibilities(word + "1", iterator + 1);
                    break;
                case '2':
                    getPossibilities(word + "A", iterator + 1);
                    getPossibilities(word + "B", iterator + 1);
                    getPossibilities(word + "C", iterator + 1);
                    break;
                case '3':
                    getPossibilities(word + "D", iterator + 1);
                    getPossibilities(word + "E", iterator + 1);
                    getPossibilities(word + "F", iterator + 1);
                    break;
                case '4':
                    getPossibilities(word + "G", iterator + 1);
                    getPossibilities(word + "H", iterator + 1);
                    getPossibilities(word + "I", iterator + 1);
                    break;
                case '5':
                    getPossibilities(word + "J", iterator + 1);
                    getPossibilities(word + "K", iterator + 1);
                    getPossibilities(word + "L", iterator + 1);
                    break;
                case '6':
                    getPossibilities(word + "M", iterator + 1);
                    getPossibilities(word + "N", iterator + 1);
                    getPossibilities(word + "O", iterator + 1);
                    break;
                case '7':
                    getPossibilities(word + "P", iterator + 1);
                    getPossibilities(word + "Q", iterator + 1);
                    getPossibilities(word + "R", iterator + 1);
                    getPossibilities(word + "S", iterator + 1);
                    break;
                case '8':
                    getPossibilities(word + "T", iterator + 1);
                    getPossibilities(word + "U", iterator + 1);
                    getPossibilities(word + "V", iterator + 1);
                    break;
                case '9':
                    getPossibilities(word + "W", iterator + 1);
                    getPossibilities(word + "X", iterator + 1);
                    getPossibilities(word + "Y", iterator + 1);
                    getPossibilities(word + "Z", iterator + 1);
                    break;
            }
        } else {
            list.add(word);
        }
    }

    public ArrayList<String> getPossibilities() {
        getPossibilities("", 0);
        return list;
    }
}
