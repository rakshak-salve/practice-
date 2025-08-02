public class BankAccount205 {
    private String id;
    public BankAccount205(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        BankAccount205 obj = new BankAccount205("123");
        System.out.println(obj.getId());
    }
}
// Revision block 6
