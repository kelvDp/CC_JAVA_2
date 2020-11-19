package practice4_3;

public class Main {
  public static void main(String[] args) {

    PeerSingleton peerList1 = PeerSingleton.getInstance();
    PeerSingleton peerList2 = PeerSingleton.getInstance();

    String[] list1 = peerList1.getHostNames();
    for (String s : list1) {
      System.out.println(s);
    }

    System.out.println();

    String[] list2 = peerList2.getHostNames();
    for (String s : list2) {
      System.out.println(s);
    }
  }
}
