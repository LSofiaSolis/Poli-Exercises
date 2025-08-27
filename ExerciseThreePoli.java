import java.util.Locale;
import java.util.Scanner;

public class ExerciseThreePoli {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double tol = sc.nextDouble();
            String result = (Math.abs(a - b) <= tol) ? "equals" : "not equals";
            System.out.println(result);
        }
    }
}
