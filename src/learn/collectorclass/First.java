package learn.collectorclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class First {
public static void main(String[] args) {
		
		List<Product>productList= new ArrayList<Product>();
		productList.add(new Product(1,"Apple Mobile",25000f));
		productList.add(new Product(2,"Samsung Moblile",35000f));
		productList.add(new Product(3,"Realme Moblile",45000f));
		productList.add(new Product(4,"Mi Moblile",45000f));
		
		List<Float> priceList = productList.stream().map(p->p.price).collect(Collectors.toList());
		
		Set<Float> priceList1 = productList.stream().map(p->p.price).collect(Collectors.toSet());
		
		Map<String,Float> priceList2 = productList.stream().collect(Collectors.toMap(p->p.name, p->p.price));
		
		System.out.println("-----------------------------------List Method-------------------------------------------");
		priceList.forEach(System.out::println);
		System.out.println("-----------------------------------Set Method---------------------------------------------");
		priceList1.forEach(System.out::println);
		System.out.println("-----------------------------------Map Method---------------------------------------------");
		System.out.println(priceList2);
}}
