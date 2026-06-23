public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("PDF file opened in read mode.");
    }

    @Override
    public String getType() {
        return "PDF Document";
    }
}
