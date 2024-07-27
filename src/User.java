public class User
{
    private String userID;
    private String userName;
    private String email;
    private String mobileNo;

    public User(String userID, String userName, String email, String mobileNo)
    {
        this.userID=userID;
        this.userName=userName;
        this.email=email;
        this.mobileNo=mobileNo;
    }

    //Getter methods for all the attributes.
    public String getUserID()
    {
        return userID;
    }
    public String  getUserName()
    {
        return userName;
    }
    public String getEmail()
    {
        return email;
    }
    public String getMobileNo()
    {
        return mobileNo;
    }

    //Setter methods for name, email and mobileno.
    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setMobileNo(String mobileNo)
    {
        this.mobileNo=mobileNo;
    }

}
