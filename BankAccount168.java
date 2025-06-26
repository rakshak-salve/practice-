public class BankAccount168 {
    private String id;
    public BankAccount168(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        BankAccount168 obj = new BankAccount168("123");
        System.out.println(obj.getId());
    }
}
// Revision block 7
