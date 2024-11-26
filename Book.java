public class Book
{
    private final int id;
    private final String name;
    private final String authorName;
    private final String genre;
    private final int published;
    private double pricePerDay;
    private double rating;
    Book(int id, String name, String authorName, String genre, int published, double pricePerDay)
    {
        this.id = id;
        this.name=name;
        this.authorName=authorName;
        this.genre=genre;
        this.published=published;
        this.pricePerDay=pricePerDay;
        this.rating=0.0;
    }
    int getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    String getAuthorName()
    {
        return authorName;
    }
    String getGenre()
    {
        return genre;
    }
    int getPublished()
    {
        return published;
    }
    double getPricePerDay()
    {
        return pricePerDay;
    }
    double getRating()
    {
        return rating;
    }
    void setPrice(double price)
    {
        this.pricePerDay=price;
    }
    void setRating(double rating)
    {
        //i will left it empty for some time
    }
}
