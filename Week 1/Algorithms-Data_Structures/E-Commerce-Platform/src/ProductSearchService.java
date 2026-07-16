public class ProductSearchService {

    public Product linearSearch(Product[] productList, int targetId) {
        for (Product currentProduct : productList) {
            if (currentProduct.getProductId() == targetId) {
                return currentProduct;
            }
        }
        return null;
    }

    public Product binarySearch(Product[] sortedProductList, int targetId) {
        int start = 0;
        int end = sortedProductList.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            int currentId = sortedProductList[middle].getProductId();

            if (currentId == targetId) {
                return sortedProductList[middle];
            }

            if (currentId < targetId) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return null;
    }
}
