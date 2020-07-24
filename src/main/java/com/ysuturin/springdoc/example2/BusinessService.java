package com.ysuturin.springdoc.example2;

public class BusinessService {
    private String companyName;
    private String domain;

    private BusinessService(){
        domain = "Financial";
    }

    public static BusinessService createInstance(String companyName){
        BusinessService businessService = new BusinessService();
        businessService.setCompanyName(companyName);
        if(businessService.getCompanyName().equals("Luxoft")){
            businessService.setDomain("IT");
        }
        return businessService;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "BusinessService{" +
                "companyName='" + companyName + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }
}
