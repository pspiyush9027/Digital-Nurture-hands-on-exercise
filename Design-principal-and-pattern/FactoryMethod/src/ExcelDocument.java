public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Excel sheet opened successfully.");
    }

    @Override
    public String getType() {
        return "Excel Document";
    }
}
