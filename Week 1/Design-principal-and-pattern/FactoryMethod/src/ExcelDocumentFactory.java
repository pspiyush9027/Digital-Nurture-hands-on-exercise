public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        System.out.println("Creating an Excel document...");
        return new ExcelDocument();
    }
}
