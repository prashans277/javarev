import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapFilterReduce {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 6, 7);

        Function<Integer, Integer> fun = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n * 2;
            }
        };

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(fun)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);
    }
}