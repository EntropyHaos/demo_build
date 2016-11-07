package entities;
    
public class ChocoUser implements Validable{    
    
    private String memberNumber;
    private String memberName;
    private String memberStreetAddress;
    private String memberCity;
    private String memberState;
    private long memberZip;
    
    public String getMemberNumber() {
        return memberNumber;
    }
    
    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }
    
    public String getMemberName() {
        return memberName;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    
    public String getMemberStreetAddress() {
        return memberStreetAddress;
    }
    
    public void setMemberStreetAddress(String memberStreetAddress) {
        this.memberStreetAddress = memberStreetAddress;
    }
    
    public String getMemberCity() {
        return memberCity;
    }
    
    public void setMemberCity(String memberCity) {
        this.memberCity = memberCity;
    }
    
    public String getMemberState() {
        return memberState;
    }
    
    public void setMemberState(String memberState) {
        this.memberState = memberState;
    }
    
    public long getMemberZip() {
        return memberZip;
    }
    
    public void setMemberZip(long memberZip) {
        this.memberZip = memberZip;
    }
    
    @Override
    public boolean isValid() {
        
        // TODO : CODE THIS!
        return true;
    }
    
} // Class generated by : Benjamin Haos
