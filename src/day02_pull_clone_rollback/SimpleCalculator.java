package day02_pull_clone_rollback;


    public class SimpleCalculator {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }
        public static int multiply(int a, int b) {
            return a * b;
    }
        public static double divide(int a, int b) {
            if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
                return (double) a / b;
    }


            public static void main(String[] args) {
            int x = 10, y = 5;
            System.out.println("Add: " + add(x, y));
            System.out.println("Subtract: " + subtract(x, y));
            System.out.println("Multiply: " + multiply(x, y));











        }
    }

