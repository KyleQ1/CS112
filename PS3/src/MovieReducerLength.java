import java.util.ArrayList;

public class MovieReducerLength implements MediaReducer
{

    @Override
    public String reduce(ArrayList<Media> list, String length) {
        StringBuilder movies = new StringBuilder();
        for (Media current : list) {
            if (current.getName().length() == Integer.parseInt(length)) {
                movies.append(current.toString());
                movies.append("\n");
            }
        }

        return movies.toString();
    }
}
