import java.util.ArrayList;

public class MovieReducerEraCount implements MediaReducer
{
    @Override
    public String reduce(ArrayList<Media> list, String key) {
        int movieCounter = 0;
        for (Media counter : list) {
            if (counter.getEra() == key) {
                movieCounter++;
            }
        }

        return "Movies in " + key + ": " + movieCounter;
    }
}