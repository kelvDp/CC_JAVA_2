package practice10_3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class RadioHutTest {

  public static void main(String[] args) {

    List<SalesTxn> tList = SalesTxn.createTxnList();
    Consumer<SalesTxn> radioReport = t -> System.out.printf("ID: " + t.getTxnId() + "  Seller: " + t.getSalesPerson()
        + "-- Buyer: " + t.getBuyerName() + " -- State: " + t.getState() + " -- Amt: $%,9.0f%n",
        t.getTransactionTotal());

    // Print out Radio Hut Transactions
    System.out.println("=== Radio Hut Transactions ===");

    tList.stream().filter(t -> t.getBuyerName().equals("Radio Hut")).forEach(t -> radioReport.accept(t));

    // Print out the total number of transactions
    long transactionCount = tList.stream().filter(t -> t.getBuyerName().equals("Radio Hut")).count();
    System.out.print("Total Transactions: " + transactionCount + "\n");

    // Print largest transaction
    System.out.println("=== Radio Hut Largest ===");
    Optional<SalesTxn> maxTransaction = tList.stream().filter(t -> t.getBuyerName().equals("Radio Hut"))
        .max(Comparator.comparing(SalesTxn::getTransactionTotal));

    if (maxTransaction.isPresent()) {
      SalesTxn transaction = maxTransaction.get();
      radioReport.accept(transaction);
    }

    // Print smallest transaction
    System.out.println("=== Radio Hut Smallest ===");

    Optional<SalesTxn> minTransaction = tList.stream().filter(t -> t.getBuyerName().equals("Radio Hut"))
        .min(Comparator.comparing(SalesTxn::getTransactionTotal));

    if (minTransaction.isPresent()) {
      radioReport.accept(minTransaction.get());
    }
  }
}
