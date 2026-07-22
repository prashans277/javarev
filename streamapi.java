import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamapi
//  {

//     public static void main(String a[]) {

//         List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        
//         nums.forEach(n -> System.out.println(n));
//     }
// }
{
    public static void main(String a[]) {
    List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
    Stream<Integer>s1=nums.stream();
    Stream<Integer>s2=s1.filter(n->n%2==0);
    s2.forEach(n -> System.out.println(n));
    }
}