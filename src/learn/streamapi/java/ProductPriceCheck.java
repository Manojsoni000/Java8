package learn.streamapi.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class ProductPriceCheck {
	public static void main(String[] args) {
		List<Product> productlist = new ArrayList<Product>();

		productlist.add(new Product(1, "Rohan", 25000f));
		productlist.add(new Product(2, "Mohan", 45000f));
		productlist.add(new Product(3, "Sohan", 65000f));
		productlist.add(new Product(4, "Suresh", 85000f));
		productlist.add(new Product(5, "Mukesh", 55000f));
		productlist.add(new Product(6, "Rahul", 22000f));
		productlist.add(new Product(7, "Mudit", 25000f));
		productlist.add(new Product(8, "Roshan", 265000f));    

		productlist.forEach(System.out::println);

		List<Float> productlist1 = productlist.stream()
							.filter(p -> p.price > 30000)
							.map(p -> p.price)
							.collect(Collectors.toList());		
		productlist1.forEach(System.out::println);

	}
}
