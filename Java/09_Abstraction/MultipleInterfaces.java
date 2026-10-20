interface Printable {
    void printDocument(String content);
}

interface Scannable {
    void scanDocument(String fileName);
}

class MultiFunctionPrinter implements Printable, Scannable {
    private String modelName;

    MultiFunctionPrinter(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void printDocument(String content) {
        System.out.println("[" + modelName + "] Printing: " + content);
    }

    @Override
    public void scanDocument(String fileName) {
        System.out.println("[" + modelName + "] Scanning and saving to: " + fileName);
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        MultiFunctionPrinter printer = new MultiFunctionPrinter("Canon All-In-One");

        printer.printDocument("Final Exam Syllabus 2026.pdf");
        printer.scanDocument("PassportScan.jpg");
    }
}
