package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fib1 = 1;
        int fib2 = 1;
        int fib3 = 0;
        for (int i = 1; i <= lastFibonacci; i++) {
            if (i <= 3) {
                switch (i){
                    case(1):
                        System.out.println(0);
                        break;
                    case (2):
                        System.out.println(1);
                        break;
                    case (3):
                        System.out.println(1);
                        break;
                }
            } else {
                fib3 = fib1 + fib2;
                System.out.println(fib3);
                fib1 = fib2;
                fib2 = fib3;
            }

        }
    }
}
