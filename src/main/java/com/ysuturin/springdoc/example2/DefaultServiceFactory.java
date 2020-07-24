package com.ysuturin.springdoc.example2;

public class DefaultServiceFactory {
    public ClientService createClientServiceInstance(String serviceType) {
        ClientService clientService = new ClientService();

        clientService.setServiceType(serviceType);
        if(serviceType.equals("Software Development")){
            clientService.setRemote(true);
        } else {
            clientService.setRemote(false);
        }

        return clientService;
    }

}
