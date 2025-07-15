public class StudentModel187 {
    private String id;
    public StudentModel187(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        StudentModel187 obj = new StudentModel187("123");
        System.out.println(obj.getId());
    }
}