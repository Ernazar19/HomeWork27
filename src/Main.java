import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(4);
        list.add(14);
        list.add(54);
        method(list);
    }
    public static <T> void method(List<T> t) {
        if (t == null || t.isEmpty()) {
            return;
        }
        System.out.println("First element : " + t.get(0));
        System.out.println("Last element : " + t.get(t.size() - 1));
        System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~>");
        for (T t1 : t) {
            System.out.println("Element : " + t1);
        }
    }
}
