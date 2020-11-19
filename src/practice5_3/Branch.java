package practice5_3;

public enum Branch {
    
    LA("Basic"),
    BOSTON("Loan"),
    BANGALORE("Full"),
    MUMBAI("Full");

    String serviceLevel;

    Branch(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }
}
