public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Print numbers from 0 to 5
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        // Print a simple star pattern
        System.out.println("Star Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

