public class Fibonacci {
    public static void main(String[] args) {
        if (args.length !=1) {
            System.out.println("Usage: java Fibonacci <n>");
            return;
        }
        try{
            int n = Integer.parseInt(args[0]);
            if (n < 0){
                System.out.println("Please enter a non-negative number.:");
            }
            else{
                long result = computeFibonacci(n);
                System.out.println("Fibonacci(" + n + ") = " + result);
            }
            
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        public static long computeFibonacci(int n) {
            if (n <= 1) {
                return n;
            }

            long[] fib = new long[n + 1];
            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i-1] + fib[i-2];
            }

            return fib[n];
        }

     
    }

