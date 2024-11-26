

public class UserData
{
    private int userId;
    private String name;
    private String contactInfo;
    private double duty;
    private double totalMoneySpend;
    UserData(int userId, String name, String contactInfo, double duty, double totalMoneySpend)
    {
        this.userId=userId;
        this.name=name;
        this.contactInfo=contactInfo;
        this.duty=duty;
        this.totalMoneySpend=totalMoneySpend;
    }
    int getUserId()
    {
        return userId;
    }
    String getName()
    {
        return name;
    }
    String getContactInfo()
    {
        return contactInfo;
    }
    double getDuty()
    {
        return duty;
    }
    double getTotalMoneySpend()
    {
        return totalMoneySpend;
    }
    void setName(String name)
    {
        this.name=name;
    }
    void setContactInfo()
    {
        this.contactInfo=contactInfo;
    }
    void setDuty(double duty)
    {
        this.duty=duty;
    }
    void setTotalMoneySpend()
    {
        this.totalMoneySpend=totalMoneySpend;
    }
}