package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class AssignmentTwo
{
	public static <T> void toConvert(List<T> list, Consumer<T> consumer)
	{
		for(T i : list)
			consumer.accept(i);
	}
	
	public static <T,R> List<R> StringToLength(List<T> list, Function<T, R> func)
	{
		List<R> returnList = new ArrayList<>();
		for(T i : list)
			returnList.add(func.apply(i));
		
		return returnList;
	}
	
	public static void main(String[] args)
	{
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4);
		List<String> listOfString = Arrays.asList("Apple","Max","Android");
		
		toConvert(listOfInteger,l1 -> System.out.println("Square Of " +l1 +" is : " +l1 * l1));
		
		toConvert(listOfInteger,l1 -> System.out.println("Cube Of " +l1 +" is : " +l1 * l1 * l1));
		
		toConvert(listOfString,l1 -> System.out.println("Length of "+l1 +" is : " +l1.length()));
		
		toConvert(listOfString, l1 -> System.out.println("Block it : " +l1.toUpperCase()));
		
		List<Integer> list = StringToLength(listOfString , l1 -> l1.length());
		System.out.println(list);
	}
	
	
}
