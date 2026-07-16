public class Main {
    public static void main(String[] args) {
        Product[] regularProductList = {
                new Product(105, "Running Shoes", "Footwear"),
                new Product(101, "Wireless Mouse", "Electronics"),
                new Product(109, "Coffee Mug", "Kitchen"),
                new Product(103, "Notebook", "Stationery"),
                new Product(107, "Bluetooth Speaker", "Electronics")
        };

        Product[] sortedProductList = {
                new Product(101, "Wireless Mouse", "Electronics"),
                new Product(103, "Notebook", "Stationery"),
                new Product(105, "Running Shoes", "Footwear"),
                new Product(107, "Bluetooth Speaker", "Electronics"),
                new Product(109, "Coffee Mug", "Kitchen")
        };

        int searchId = 107;
        ProductSearchService searchService = new ProductSearchService();
        ProductView productView = new ProductView();
        ProductSearchController controller = new ProductSearchController(searchService, productView);

        controller.searchWithLinearSearch(regularProductList, searchId);
        controller.searchWithBinarySearch(sortedProductList, searchId);
    }
}
