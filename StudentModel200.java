public class StudentModel200 {
    private String id;
    public StudentModel200(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        StudentModel200 obj = new StudentModel200("123");
        System.out.println(obj.getId());
    }
}