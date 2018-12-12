package Two;

public class Runner {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.justPrint();
        Iout paperPrinter = new Iout() {
            @Override
            public void justPrint() {
                System.out.println("papper prints");
            }
        };
        paperPrinter.justPrint();
    }
}
