import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Product implements Comparable<Product> {
    private int productId;
    private String productName;
    private double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.productPrice, otherProduct.productPrice);
    }

    @Override
    public String toString() {
        return String.format("%d,%s,$%.2f", productId, productName, productPrice);
    }
}

class ProductIdComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return Integer.compare(product2.getProductId(), product1.getProductId());
    }
}