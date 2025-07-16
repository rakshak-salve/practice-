public class BankAccount188 {
    private String id;
    public BankAccount188(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        BankAccount188 obj = new BankAccount188("123");
        System.out.println(obj.getId());
    }
}