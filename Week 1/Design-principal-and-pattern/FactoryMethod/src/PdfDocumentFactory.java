public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        System.out.println("Creating a PDF document...");
        return new PdfDocument();
    }
}
