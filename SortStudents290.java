import java.util.*;
public class SortStudents290 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        Collections.sort(list);
        for(String s : list) System.out.println(s);
    }
}