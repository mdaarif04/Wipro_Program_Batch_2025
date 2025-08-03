//Comparator for custom ordering 



package com.example.queue;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



	
	/*Parameters:
		d1 the first double to compare
		d2 the second double to compare
		Returns:
		the value 0 if d1 is numerically equal to d2; 
		a value less than 0 if d1 is numerically less than d2; 
		and a value greater than 0 if d1 is numerically greater than d2.
	*/
	
//    // Rating Comparator class for custom ordering 
//	class RatingComparator implements Comparator<Products>
//	{
//	
//
//	@Override
//	public int compare(Products p1, Products p2) {
//		// TODO Auto-generated method stub
//		return Double.compare(p2.rating , p1.rating );
//	}
//	
//	
//	
//	}
//	
	

// Name Comparator class for custom ordering 
class NameComparator implements Comparator<Product>
{


@Override
public int compare(Product p1, Product p2) {
	// TODO Auto-generated method stub
	return p1.name.compareTo(p2.name);
}



}



public class ComparatorSortingDemo {

	public static void main(String[] args) {
		List<Product> pr = new ArrayList<>();
		pr.add(new Product("Laptop" , 50000, 5));
		pr.add(new Product("Phone" , 20000, 3));
		pr.add(new Product("Tablet" , 10000, 1));
		pr.add(new Product("Mouse" , 500, 2));
		
		//pr.sort(Comparator.comparing());
		Collections.sort(pr, new NameComparator());
		
		for(Product p : pr)
		
		{
			System.out.println(p);
		}
	
         // For Custom Ordering you want to order by their name
		
		
	}

}