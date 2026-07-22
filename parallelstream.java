import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class parallelstream {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(1000);
        Random ran = new Random();

        for (int i = 1; i < 1000; i++) {
            nums.add(ran.nextInt(100));
        }

        // Sequential Stream
        long startSeq = System.currentTimeMillis();

        int sum2 = nums.stream()
                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();

        long endSeq = System.currentTimeMillis();

        // Parallel Stream
        long startPara = System.currentTimeMillis();

        int sum3 = nums.parallelStream()
                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();

        long endPara = System.currentTimeMillis();

        System.out.println("Sequential Sum: " + sum2);
        System.out.println("Parallel Sum: " + sum3);

        System.out.println("Sequential Time: " + (endSeq - startSeq) + " ms");
        System.out.println("Parallel Time: " + (endPara - startPara) + " ms");
    }
}