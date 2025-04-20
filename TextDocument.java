class TextDocument extends AbstractDocument {
    private int filePath;
    private String encoding;
    private int wordCount;
    private String name;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    public TextDocument(String name, String encoding, int wordCount) {
        this.name = name;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + name + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: " + getType() + ", Path: " + name + ", Encoding: " + encoding + ", Words: " + wordCount);
    }

    @Override
    public String getType() {
        return "Text";
    }

    // Setters for creating customized clones
    public void setName(String name) {
        this.name = name;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
}