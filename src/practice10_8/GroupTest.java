package practice10_8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class GroupTest {

    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Map<String, List<SalesTxn>> tMap = new HashMap<>();

        // Print out transactions grouped by Buyer
        System.out.println("=== Transactions Grouped by Buyer ===");
        tMap = tList.stream().collect(Collectors.groupingBy(SalesTxn::getBuyerName));

        tMap.forEach((k, v) -> {
            System.out.println("Buyer: " + k);
            v.forEach(t -> System.out.println("ID: " + t.getTxnId() + " - Seller: " + t.getSalesPerson() + " - Buyer: "
                    + t.getBuyerName() + " - Product: " + t.getProduct() + " - ST: " + t.getState() + " - Amt: "
                    + t.getUnitCount() + " - Date: " + t.getTxnDate()));
        });
    }
}
