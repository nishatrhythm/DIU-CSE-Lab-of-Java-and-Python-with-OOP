public class Task03_ThrowAndThrows {
    static void checkEligibility(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18 to vote. Given: " + age);
        }
        System.out.println("Eligibility confirmed: Welcome voter!");
    }

    static void simulateDelay(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
        System.out.println("Delay completed: " + milliseconds + "ms");
    }

    public static void main(String[] args) {
        try {
            checkEligibility(21);
            checkEligibility(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            simulateDelay(100);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted: " + e.getMessage());
        }
    }
}