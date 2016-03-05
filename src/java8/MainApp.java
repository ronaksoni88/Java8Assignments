package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainApp
{
	public static void main(String[] args)
	{
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Android",1688));
		empList.add(new Employee("Mack",100));
		empList.add(new Employee("Jack",3255466));
		
		
		List<String> listOfStrings = Arrays.asList("mack","Apple","Android");
		Predicate<String> nonEmptyStringPredicate = (String s) -> s.length()>5;
		
		List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
		
		Predicate<Employee> salaryGreaterThan30 = (Employee e) -> e.getSalary() > 3000;
		
		Predicate<Employee> employeeNameStartsWithA = (Employee e) -> e.getName().startsWith("A");

		
		List<Employee> salaryGreaterThan30List = filter(empList , salaryGreaterThan30 );
		
		MainApp.iterateList(salaryGreaterThan30List, e1 -> System.out.println(e1.getName()));
		
	}
	
	public static <T> List<T> filter(List<T> list, Predicate<T> p) 
	{
		List<T> results = new ArrayList<>();
		for(T s: list)
		{
			if(p.test(s))
			{
				results.add(s);
			}
		}
		return results;
	}
	
	public static List<Employee> salaryGreaterThan30(List<Employee> listOfEmp , Predicate<Employee> p)
	{
		List<Employee> list = new ArrayList<>();
		
		for(Employee e1 : listOfEmp)
		{
			if(p.test(e1))
				list.add(e1);
		}
		
		return list;
	}
	
	public static void iterateList (List<Employee> listOfEmployee,	Consumer<Employee> c)
	{
		for(Employee e : listOfEmployee)
			c.accept(e);
	}
	
	public static <T,R>List <Integer> useFunction (List<Employee> listOfEmployee,	Function<T, List <Integer>>f)
	{
		List<Integer> list = new ArrayList<>();
		
		for(Employee e1 : listOfEmployee)
		{
			//list.add(f.apply(e1));
		}
		
		return list;
	}
}
