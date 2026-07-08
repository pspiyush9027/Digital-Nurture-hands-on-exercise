public class ProductView {

    public void showTitle(String title) {
        System.out.println(title);
    }

    public void showProduct(Product product) {
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        System.out.println("Product Id   : " + product.getProductId());
        System.out.println("Product Name : " + product.getProductName());
        System.out.println("Category     : " + product.getCategory());
    }

    public void showAnalysis(String notes) {
        System.out.println(notes);
    }

    public void leaveSpace() {
        System.out.println();
    }
}
