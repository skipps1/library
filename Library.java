import java.util.ArrayList;
import java.time.LocalDate;
import java.awt.*;



public class Library
{
    private int id;
    private String address;
    private int freePlaces;
    Library(int id, String address, int freePlaces)
    {
        this.id=id;
        this.address=address;
        this.freePlaces=freePlaces;
    }
    int getId()
    {
        return id;
    }
    String getAddress()
    {
        return address;
    }
    int getFreePlaces()
    {
        return freePlaces;
    }
    void setAddress(String address)
    {
        this.address=address;
    }
    void setFreePlaces(int freePlaces)
    {
        this.freePlaces=freePlaces;
    }
}
