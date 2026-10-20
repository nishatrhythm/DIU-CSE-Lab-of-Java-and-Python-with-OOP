public class MultipleCatch {
    public static void main(String[] args) {
        String[] inputs = {"10", "20", "abc", "40"};

        for (int i = 0; i <= inputs.length; i++) {
            try {
                System.out.println("Processing index " + i + ":");
                int value = Integer.parseInt(inputs[i]);
                int calculation = 100 / value;
                System.out.println("100 / " + value + " = " + calculation);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is out of bounds: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer format: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("General exception caught: " + e.getMessage());
            }
            System.out.println("-------------------------");
        }
    }
}
