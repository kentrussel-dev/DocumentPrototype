class DocumentRegistry {
    private final PdfDocument pdfPrototype;
    private final TextDocument textDocumentPrototype;
    private final SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public Document createSheep(String name) {
        return null;
    }

    public Document createCow() {
        return null;
    }

    public Document createHorse() {
        return null;
    }

    public PdfDocument createPdfDocument(String fileName, String author, int pageCount) {
        PdfDocument document = (PdfDocument) pdfPrototype.clone();
        document.setFileName(fileName);
        document.setAuthor(author);
        document.setPageCount(pageCount);
        return document;
    }

    public TextDocument createTextDocument(String name, String encoding, int wordCount) {
        TextDocument document = (TextDocument) textDocumentPrototype.clone();
        document.setName(name);
        document.setEncoding(encoding);
        document.setWordCount(wordCount);
        return document;
    }

    public SpreadsheetDocument createSpreadsheetDocument(String name, int rowCount, int columnCount) {
        SpreadsheetDocument document = (SpreadsheetDocument) spreadsheetPrototype.clone();
        document.setSpreadsheetName(name);
        document.setRowCount(rowCount);
        document.setColumnCount(columnCount);
        return document;
    }
}