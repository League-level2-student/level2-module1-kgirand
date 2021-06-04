package intro_to_array_lists;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		System.out.println("Here's an ArrayList of Strings:\n");
		//ArrayList of Strings
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Jan");
		names.add("Sara");
		names.add("Fred");
		names.add("Marc");
		
		System.out.println("Here's an ArrayList of Strings:\n");
		//iterating through list with standard for-loop
		for(int i = 0; i < names.size(); i++){
			String s = names.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		System.out.println("\n");
		
		//iterating through list with for-each loop
		for(String s : names){
			System.out.println(s);
		}
		System.out.println("\n");
		
		System.out.println("Here's an ArrayList of Integers:\n");
		//ArrayList of Integers
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(7);
		numbers.add(-24);
		numbers.add(1);
		numbers.add(1040);
		numbers.add(-2327);
		
		//iterating through list with standard for-loop
		for(int i = 0; i < numbers.size(); i++){
			Integer j = numbers.get(i);
			System.out.println(j);
		}
		System.out.println("\n");
		
		//iterating through list with for-each loop
		for(Integer j : numbers){
			System.out.println(j);
		}
		System.out.println("\n");
		Object[] drums = {"drums1"};
		drums[0] = new Object();
		System.out.println(drums.length);
		float item = 3.5f;
		float itemm = 3.6f;
		if(item==itemm) {
			ArrayList<String> guests = new ArrayList<String>();
			guests.add("hi");
		}
		int[] nums = {1, 2, 3, 4, 5, 6};
		for(int i = 0; i < nums.length; i += 2){
		             System.out.println(nums[i]);
		            
		}
		int x = 52;
		int y = 25;
		int r = x; 
		x = y;
		y = r;
		System.out.println(x);
		int[] ints = {8,9,10};
		ints[1] = 8;
		
		abstract class Liquid {} 
		class Water extends Liquid {}
		 public class SoftDrink extends Liquid, Water{
		             public void main(String[] args){ 
		                     Water mizu = new Water(); 
		              } 
		}
	}
}
