import java.time.LocalDate;

public class BookItem
{
    private int id;
    private int userId;
    private int libraryId;
    private int bookId;
    private LocalDate returnTime;
    int getId()
    {
        return id;
    }
    int getUsetId()
    {
        return userId;
    }
    int getLibraryId()
    {
        return libraryId;
    }
    LocalDate getReturnTime()
    {
        return returnTime;
    }
    int getBookId()
    {
        return bookId;
    }
    void setUserId(int userId)
    {
        this.userId=userId;
    }
    void setLibraryId(int libraryId)
    {
        this.libraryId=libraryId;
    }
    void setReturnTime(LocalDate returnTime)
    {
        this.returnTime=returnTime;
    }
}
