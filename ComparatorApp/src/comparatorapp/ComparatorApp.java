package comparatorapp;

import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author Luke
 */
public class ComparatorApp {

    public static void main(String[] args) {
        Integer[] tab = {5, 18, 20, 1, 78, 95, 14, 665, 441, 12, 0, 65, 43, 15, 18, 978, 321, 6, 74, 100};
        for(Integer i: tab)
        {
            System.out.println(i);
        }
        
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
        
        Arrays.sort(tab, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return -(o1.compareTo(o2));
        }
    });
        System.out.println(Arrays.toString(tab));
    }
    
}
