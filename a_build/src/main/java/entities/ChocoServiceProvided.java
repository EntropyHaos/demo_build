package entities;
    
public class ChocoServiceProvided implements Validable{    
    
    private String chocoServiceProvidedIdNumber;
    private String memberNumberService;
    private String providerNumberServicing;
    private String dateServiced;
    private String dateServicedRecorded;
    private String serviceComment;
    
    public String getChocoServiceProvidedIdNumber() {
        return chocoServiceProvidedIdNumber;
    }
    
    public void setChocoServiceProvidedIdNumber(String chocoServiceProvidedIdNumber) {
        this.chocoServiceProvidedIdNumber = chocoServiceProvidedIdNumber;
    }
    
    public String getMemberNumberService() {
        return memberNumberService;
    }
    
    public void setMemberNumberService(String memberNumberService) {
        this.memberNumberService = memberNumberService;
    }
    
    public String getProviderNumberServicing() {
        return providerNumberServicing;
    }
    
    public void setProviderNumberServicing(String providerNumberServicing) {
        this.providerNumberServicing = providerNumberServicing;
    }
    
    public String getDateServiced() {
        return dateServiced;
    }
    
    public void setDateServiced(String dateServiced) {
        this.dateServiced = dateServiced;
    }
    
    public String getDateServicedRecorded() {
        return dateServicedRecorded;
    }
    
    public void setDateServicedRecorded(String dateServicedRecorded) {
        this.dateServicedRecorded = dateServicedRecorded;
    }
    
    public String getServiceComment() {
        return serviceComment;
    }
    
    public void setServiceComment(String serviceComment) {
        this.serviceComment = serviceComment;
    }
    
    @Override
    public boolean isValid() {
        
        // TODO : CODE THIS!
        return true;
    }
    
} // Class generated by : Benjamin Haos
