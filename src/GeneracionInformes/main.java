package GeneracionInformes;

public class main {
    public static void main(String[] args) {
        Report context = new Report();

        context.setReportGenerator(new PdfReportGenerator());
        context.generateReport();

        context.setReportGenerator(new ExcelReportGenerator());
        context.generateReport();

        context.setReportGenerator(new HTMLGenerador());
        context.generateReport();
    }
}
