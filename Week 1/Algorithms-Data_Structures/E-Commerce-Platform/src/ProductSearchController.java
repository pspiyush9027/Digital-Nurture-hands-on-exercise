public class ProductSearchController {
    private final ProductSearchService searchService;
    private final ProductView productView;

    public ProductSearchController(ProductSearchService searchService, ProductView productView) {
        this.searchService = searchService;
        this.productView = productView;
    }

    public void searchWithLinearSearch(Product[] products, int targetId) {
        productView.showTitle("Searching with Linear Search");
        Product foundProduct = searchService.linearSearch(products, targetId);
        productView.showProduct(foundProduct);
        productView.leaveSpace();
    }

    public void searchWithBinarySearch(Product[] sortedProducts, int targetId) {
        productView.showTitle("Searching with Binary Search");
        Product foundProduct = searchService.binarySearch(sortedProducts, targetId);
        productView.showProduct(foundProduct);
        productView.leaveSpace();
    }
}
