public class Main {
    public static void main(String[] args) {
        DocumentFactory firstChoice = new WordDocumentFactory();
        DocumentFactory secondChoice = new PdfDocumentFactory();
        DocumentFactory thirdChoice = new ExcelDocumentFactory();

        Document file1 = firstChoice.createDocument();
        System.out.println("Created: " + file1.getType());
        file1.open();
        System.out.println();

        Document file2 = secondChoice.createDocument();
        System.out.println("Created: " + file2.getType());
        file2.open();
        System.out.println();

        Document file3 = thirdChoice.createDocument();
        System.out.println("Created: " + file3.getType());
        file3.open();
    }
}
