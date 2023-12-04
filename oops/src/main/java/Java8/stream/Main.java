package Java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product>lst = new ArrayList<>();

        lst.add(new Product(1,"HP Laptop",2500));
        lst.add(new Product(2,"Dell Laptop",3000));
        lst.add(new Product(3,"Lenevo Laptop",2800));
        lst.add(new Product(4,"Sony Laptop",2800));
        lst.add(new Product(5,"Apple Laptop",9000));

//        lst.forEach(
//                (elem)-> System.out.println(elem.name)
//        );
        List<Integer>priceLst =
                lst.stream().filter(elem->elem.price>=3000).map(elem->elem.price).collect(Collectors.toList());

        System.out.println(priceLst);

        lst.stream()
                .filter(elem->elem.price>=3000)
                .forEach(elem-> System.out.println(elem.name));

        int total = lst.stream()
                .filter(elem->elem.price>=3000)
                .map(elem->elem.price)
                .reduce(0,(sum,elem)->sum+elem);
        System.out.println(total);
    }
}
