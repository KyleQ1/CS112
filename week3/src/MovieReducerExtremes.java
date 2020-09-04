import java.util.ArrayList;

public class MovieReducerExtremes implements MediaReducer
{

    @Override
    public String reduce(ArrayList<Media> list, String key) {
        Media thing = list.get(0);
        if (key.equalsIgnoreCase("newest")) {
            for (Media current : list) {
                if (current.getYear() > thing.getYear()) {
                    thing = current;
                }
            }
        }
        else {
            for (Media current : list) {
                if (current.getYear() <= thing.getYear()) {
                    thing = current;
                }
            }
        }

        return thing.toString();
    }
}
