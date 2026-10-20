public class Task05_Loops {
    public static void main(String[] args) {
        System.out.println("For Loop (1 to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nWhile Loop (5 down to 1):");
        int count = 5;
        while (count >= 1) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        System.out.println("\nDo-While Loop:");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 3);
        System.out.println();

        System.out.println("\nEnhanced For Loop (For-Each):");
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        System.out.println("\nBreak and Continue Demo:");
        for (int i = 1; i <= 6; i++) {
            if (i == 3) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println("Value: " + i);
        }
    }
}