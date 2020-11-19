package practice4_1;

public class EmployeeStockPlan {

    public int grantStock(Employee e) {

        int nrOfOptions = 0;

        if (e instanceof Director)
            nrOfOptions = 1000;

        if (e instanceof Manager)
            nrOfOptions = 100;

        if (e instanceof Admin)
            nrOfOptions = 10;

        if (e instanceof Engineer)
            nrOfOptions = 10;

        return nrOfOptions;
    }
}
