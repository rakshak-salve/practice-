public class VehicleAbstract192 {
    private String id;
    public VehicleAbstract192(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        VehicleAbstract192 obj = new VehicleAbstract192("123");
        System.out.println(obj.getId());
    }
}