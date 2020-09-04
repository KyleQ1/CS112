public class Movie extends Media
{
    public Movie(String name, int year, String genre) {
        super(name, year, genre);
    }

    @Override
    public String getEra() {
        int year = getYear();

        if (year >= 2000) {
            return "New Millennium Era";
        }
        else if (year >= 1977) {
            return "Modern Era";
        }
        else if (year >= 1955) {
            return "Change Era";
        }
        else if (year >= 1941) {
            return "Golden Era";
        }
        else return "Pre-Golden Era";
    }

    @Override
    public boolean wasReleasedAfter(Media other) {
        int firstYear = getYear();
        int secondYear = other.getYear();

        return firstYear > secondYear;
    }

    @Override
    public boolean wasReleasedBeforeOrInSameYear(Media other) {
        int firstYear = getYear();
        int secondYear = other.getYear();

        return firstYear <= secondYear;
    }
}
