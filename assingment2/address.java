

public class address
{
    // instance variables - replace the example below with your own
    private String numorname;
    private String street;
    private String city;
    private String zip;
    private String country;

    
    public address(String numorname, String street, String city,String zip, String country)
    {
        this.numorname = numorname;
        this.street = numorname;
        this.city = city;
        this.zip = zip;
        this.country = country;
       
    }
     
    public String getnumorname()
    {
        return numorname;
       
    }
    
    public String getstreet()
    {
        return street;
             
    }
    
    public String getcity()
    {
        return city;
       
    }
    
    public String getzip()
    {
        return zip;
       
    }
    
    public String getcountry()
    {
        return country;
       
    }
}
