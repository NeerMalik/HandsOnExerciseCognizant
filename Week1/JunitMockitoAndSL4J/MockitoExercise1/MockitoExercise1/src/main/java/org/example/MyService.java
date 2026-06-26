package org.example;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void save(String data) {
        api.saveData(data);
    }

    public void executeProcess() {
        api.process();
    }

    public void executeOrder() {
        api.firstMethod();
        api.secondMethod();
    }
}