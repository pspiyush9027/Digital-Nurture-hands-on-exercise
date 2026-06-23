public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Word file is ready to open.");
    }

    @Override
    public String getType() {
        return "Word Document";
    }
}
