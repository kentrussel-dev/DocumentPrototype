public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        // Create and open a PDF document
        Document pdfDoc = registry.createPdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        pdfDoc.open();

        // Create and open a text document
        Document textDoc = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        textDoc.open();

        // Create and open a spreadsheet document
        Document spreadsheetDoc = registry.createSpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
        spreadsheetDoc.open();

        // Create another PDF document
        Document anotherPdfDoc = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
        anotherPdfDoc.open();
    }
}