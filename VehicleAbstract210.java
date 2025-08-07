public class VehicleAbstract210 {
    private String id;
    public VehicleAbstract210(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        VehicleAbstract210 obj = new VehicleAbstract210("123");
        System.out.println(obj.getId());
    }
}