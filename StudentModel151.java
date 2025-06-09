public class StudentModel151 {
    private String id;
    public StudentModel151(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        StudentModel151 obj = new StudentModel151("123");
        System.out.println(obj.getId());
    }
}