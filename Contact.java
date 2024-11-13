package com.addressbook.entity;

public class Contact {
    String FirstName;
    String LastName;
    String city;
    String state;
    String zip;
    String phno;
    String address;
    public Contact(String FirstName,String LastName,String city,String state,String zip,String phno,String address)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phno=phno;
        this.address=address;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public void setFirstName(String a)
    {
        this.FirstName=a;
    }
    public String getLastName()
    {
        return LastName;
    }
    public void setLastName(String b)
    {
        this.LastName=b;
    }
    public String getCity()
    {
        return city;
    }
    public  void setCity(String f)
    {
        this.city=f;
    }
    public String getstate()
    {
        return state;
    }
    public void setstate(String m)
    {
        this.state=m;
    }
    public String getZip()
    {
        return zip;
    }
    public  void setZip(String u)
    {
        this.zip=u;
    }
    public String getphno()
    {
        return phno;
    }
    public void setphno(String c)
    {
        this.phno=c;
    }
    public String getaddress()
    {
        return address;
    }
    public void setaddress(String d)
    {
        this.address=d;
    }
    @Override
    public String toString() {
        return "firstName: " + FirstName + " LastName: " + LastName +" city: "+city +" state: "+state+" zip: "+zip +"Phone: " + phno + ", address: " + address;
    }
}
