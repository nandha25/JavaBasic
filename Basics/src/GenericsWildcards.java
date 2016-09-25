import java.util.ArrayList;
import java.util.List;

/**
 * Created by nandh on 25-09-2016.
 */
public class GenericsWildcards {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3); ints.add(5); ints.add(10);
        double sum = sum(ints);
        System.out.println("Sum of ints="+sum);
    }
    //public static double sum(List<? extends Number> list)
    //public static void printData(List<?> list){ = Java Generics Unbounded Wildcard = Java Generics Upper Bounded Wildcard

    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
}
