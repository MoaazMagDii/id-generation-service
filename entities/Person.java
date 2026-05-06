package entities;



public class Person{

    private  String FullName;
    private  Long SSN = 12001000L;
    private  String DayOfBirth;
    private  String Gender;
    private  String Address;
    private  String SocialStatus;
    private  String PlaceOfBirth;
    private  String PlaceOfResidence;
    private  Long PhoneNumber ;
    
    
    public Person(){
        SSN++;
    }

    public String getFullName() {
        return FullName;
    }
    
    public Long getSSN() {
     
        return SSN;
    }

    public String getDayOfBirth() {
        return DayOfBirth;
    }


    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }

    public String getSocialStatus() {
        return SocialStatus;
    }

    public String getPlaceOfBirth() {
        return PlaceOfBirth;
    }

    public String getPlaceOfResidence() {
        return PlaceOfResidence;
    }

    public void setFullName(String FullName){        
        this.FullName = FullName;
    }

    public void setDayOfBirth(String DayOfBirth) {
        this.DayOfBirth = DayOfBirth;
    }


    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setSocialStatus(String SocialStatus) {
        this.SocialStatus = SocialStatus;
    }

    public void setPlaceOfBirth(String PlaceOfBirth) {
        this.PlaceOfBirth = PlaceOfBirth;
    }

    public void setPlaceOfResidence(String PlaceOfResidence) {
        this.PlaceOfResidence = PlaceOfResidence;
    }

    public Long getPhoneNumber() {
        
        return PhoneNumber;
    }

    public void setPhoneNumber(Long PhoneNumber) {
     
        this.PhoneNumber = PhoneNumber;
    }
}
