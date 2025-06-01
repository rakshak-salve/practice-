public class InterfaceDrawable143 {
    private String id;
    public InterfaceDrawable143(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        InterfaceDrawable143 obj = new InterfaceDrawable143("123");
        System.out.println(obj.getId());
    }
}