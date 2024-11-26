import java.time.LocalDate;

public class Review
{
    private int id;
    private int userId;
    private int bookId;
    private String text;
    private int rate;//1-5 stars
    private LocalDate date;
    int getId()
    {
        return id;
    }
    int getUserId()
    {
        return userId;
    }
    int getBookId()
    {
        return bookId;
    }
    String getText()
    {
        return text;
    }
    int getRate()
    {
        return rate;
    }
    LocalDate getDate()
    {
        return date;
    }
    void setText(String text)
    {
        this.text=text;
    }
    void setRate(int rate)
    {
        this.rate=rate;
    }
    void setDate(LocalDate date)
    {
        this.date=date;
    }
}