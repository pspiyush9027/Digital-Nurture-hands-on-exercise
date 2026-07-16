public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        System.out.println("Creating a Word document...");
        return new WordDocument();
    }
}
