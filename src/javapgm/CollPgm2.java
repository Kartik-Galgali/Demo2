package javapgm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
//import java.util.function.Consumer;
//import java.util.stream.Stream;
import java.util.function.Predicate;

public class CollPgm2 {
public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(3,8,7,12);
	
/*	Consumer<Integer> c = new Consumer<Integer>() {
		public void accept(Integer n) {
			System.out.print(n+" ");
		}
	}; */
//	Consumer<Integer> c = n -> System.out.println(n);

//	nums.forEach(c);
	
//	nums.forEach(n -> System.out.print(n+" "));
	
	/*
	Stream<Integer> s1 = nums.stream();
	
	Stream<Integer> s2 = s1.filter(n -> n%2==0);
	
	Stream<Integer> s3 = s2.map(n -> n*2);
	
	Integer result = s3.reduce(0,(c,e) -> c+e);
	
	System.out.println(result);
	*/
	
	/*
	Integer result = nums.stream()
			.filter(n->n%2==0)
			.map(n->n*2)
			.reduce(0,(c,e) -> c+e);
	*/
	
	/*
	Predicate<Integer> p = new Predicate<Integer>() {

		@Override
		public boolean test(Integer n) {
			if (n % 2 == 0)
				return true;
			else
				return false;
		}
	}; */
	
	/*
	Function<Integer, Integer> fun = new Function<Integer, Integer>() {

		@Override
		public Integer apply(Integer n) {
			return n*2;
		}
		
	}; */
	
	Predicate<Integer> p = n -> n%2==0;
	
	Function<Integer, Integer> fun = n -> n*2;
	
	Integer result = nums.stream()
			.filter(p)
			.map(fun)
			.reduce(0,(c,e) -> c+e);
	
	System.out.println(result);
	
//	s3.forEach(n -> System.out.print(n+" "));
	
//	s1.forEach(n -> System.out.print(n+" ")); //Illegal State Exception -> use steam twice	
	
}
}
