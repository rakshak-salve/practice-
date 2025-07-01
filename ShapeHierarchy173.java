public class ShapeHierarchy173 {
    private String id;
    public ShapeHierarchy173(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        ShapeHierarchy173 obj = new ShapeHierarchy173("123");
        System.out.println(obj.getId());
    }
}