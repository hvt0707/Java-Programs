public class Main {
    private static Bank hdfc = new Bank("HDFC");
    public static void main(String[] args) {
        hdfc.addBranch("Chhindwara");
        hdfc.addBranch("Mumbai");
        hdfc.addBranch("Bhopal");
        hdfc.addBranch("Kolkata");
        hdfc.searchBranch("Chhindwara");
        hdfc.addCustomer("Chhindwara","harsh",2000000.0);
    }
}
