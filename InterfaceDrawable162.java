public class InterfaceDrawable162 {
    private String id;
    public InterfaceDrawable162(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        InterfaceDrawable162 obj = new InterfaceDrawable162("123");
        System.out.println(obj.getId());
    }
}