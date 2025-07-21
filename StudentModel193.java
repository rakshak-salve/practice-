public class StudentModel193 {
    private String id;
    public StudentModel193(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        StudentModel193 obj = new StudentModel193("123");
        System.out.println(obj.getId());
    }
}