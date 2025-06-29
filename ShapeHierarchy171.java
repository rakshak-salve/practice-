public class ShapeHierarchy171 {
    private String id;
    public ShapeHierarchy171(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        ShapeHierarchy171 obj = new ShapeHierarchy171("123");
        System.out.println(obj.getId());
    }
}