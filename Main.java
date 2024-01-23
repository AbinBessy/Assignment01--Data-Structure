import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();


        productList.add(new Product(1, "Wine - Vovray Sec Domaine Huet", 25.68));
        productList.add(new Product(2, "Oil - Truffle, Black", 23.98));
        productList.add(new Product(3, "Nori Sea Weed", 21.75));
        productList.add(new Product(4, "Tomatoes", 30.53));
        productList.add(new Product(5, "Truffle Cups - White Paper", 13.87));
        productList.add(new Product(6, "Jam - Blackberry, 20 Ml Jar", 45.51));
        productList.add(new Product(7, "Pickles - Gherkins", 22.99));
        productList.add(new Product(8, "Truffle Shells - Semi - Sweet", 43.99));
        productList.add(new Product(9, "Appetizer - Seafood Assortment", 34.90));
        productList.add(new Product(10, "Bread - Flat Bread", 13.72));


        Collections.sort(productList);
        System.out.println("Sorted by Product Price:");
        productList.forEach(System.out::println);



        Collections.sort(productList, new ProductIdComparator());
        System.out.println("Sorted by Product Id (Descending Order):");
        productList.forEach(System.out::println);
    }
}
