public class Factorial {
    public static void main(String[] args) {
        int number = 12;
        Factorial Factorial = new Factorial();

        System.out.println(number);
        System.out.println("***********Iterative Solution***********");
        System.out.println(Factorial.IterativeFactorial(number));

        System.out.println(number);
        System.out.println("***********Recursive Solution***********");
        System.out.println(Factorial.RecursiveFactorial(number));
    }

    public long IterativeFactorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    } // Complexity: ø(n)

    public long RecursiveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * RecursiveFactorial(n - 1);
    } // Complexity: T(n) = T(n-1) + ø(1)
}
