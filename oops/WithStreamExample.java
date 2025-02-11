import java.util.Arrays;
import java.util.List;

public class WithStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                         .filter(n -> n % 2 == 0) // Keep even numbers
                         .reduce(0, Integer::sum); // Sum them

        System.out.println(sum);  // Output: 6
    }
}
