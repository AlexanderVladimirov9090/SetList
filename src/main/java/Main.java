import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created on 27-Sep-17
 *
 * @author Alexander Vladimirov
 * <alexandervladimirov1902@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set1 = new TreeSet<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = -2; i < 3; i++) {
            set.add(i);
            set1.add(i);
            list.add(i);
            list1.add(i);
        }
        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i);
            System.out.println("\nIterations: "+ i +" Using List.remove(index)");
            System.out.println("\nResult of removing from Set and List");
            System.out.println("Set: "+ set + "\nList:  " + list);
        }


        for (int i = 0; i < 3; i++) {
            set1.remove(i);
            list1.remove((Integer) i);
            System.out.println("\nIterations: "+ i+ " Using List.remove(Object)");
            System.out.println("\nResult of removing from Set and List");
            System.out.println("Set: "+ set1 + "\nList:  " + list1);
        }
    }
}
