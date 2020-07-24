package com.ysuturin.springdoc.example2;

public class ClientService {
    private String serviceType;
    private boolean remote = false;

    public static ClientService createInstance(String serviceType){
        ClientService clientService = new ClientService();
        clientService.setServiceType(serviceType);
        if(serviceType.equals("Software Development")){
            clientService.setRemote(true);
        }

        return clientService;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(boolean remote) {
        this.remote = remote;
    }

    @Override
    public String toString() {
        return "ClientService{" +
                "serviceType='" + serviceType + '\'' +
                ", remote=" + remote +
                '}';
    }
}
