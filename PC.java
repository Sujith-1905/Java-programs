import java.util.*;

class PermutationCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        int p = 1, c = 1;

        for (int i = 0; i < r; i++)
            p *= (n - i);

        for (int i = 1; i <= r; i++)
            c = c * (n - i + 1) / i;

        System.out.println("Permutation = " + p);
        System.out.println("Combination = " + c);
    }
}