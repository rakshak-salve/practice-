public class InterfaceDrawable169 {
    private String id;
    public InterfaceDrawable169(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        InterfaceDrawable169 obj = new InterfaceDrawable169("123");
        System.out.println(obj.getId());
    }
}