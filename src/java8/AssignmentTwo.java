package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AssignmentTwo
{
	public static <T> void toConvert(List<T> list, Consumer<T> consumer)
	{
		for(T i : list)
			consumer.accept(i);
	}
	
	public static void main(String[] args)
	{
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4);
		List<String> listOfString = Arrays.asList("Apple","Max","Android");
		
		toConvert(listOfInteger,l1 -> System.out.println("Square Of " +l1 +" is : " +l1 * l1));
		
		toConvert(listOfInteger,l1 -> System.out.println("Cube Of " +l1 +" is : " +l1 * l1 * l1));
		
		toConvert(listOfString,l1 -> System.out.println("Length of "+l1 +" is : " +l1.length()));
		
		toConvert(listOfString, l1 -> System.out.println("Block it : " +l1.toUpperCase()));
	}
}
