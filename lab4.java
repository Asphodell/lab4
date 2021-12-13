import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class lab4 {
    public static void main(String[] arg) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextDouble();
            }
            System.out.println(Arrays.toString(array));
            double[] resultArray = new double[n];
            for (int j = 1; j <= n; j++) {
                    double result = avgArifm(Arrays.copyOf(array, j));
                    resultArray[j - 1] = result;
                }
            System.out.println(Arrays.toString(resultArray));
        }
        catch (InputMismatchException e) {
            System.out.println("Error");
        }
    }
    public static double avgArifm(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }
}