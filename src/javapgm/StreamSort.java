package javapgm;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Optional;
//import java.util.Random;
//import java.util.stream.Stream;

public class StreamSort {
public static void main(String[] args) {
	/*
	List<Integer> nums = Arrays.asList(3,8,7,14,12);
	
	Stream<Integer> sorted = nums.stream()
			.filter(n -> n%2==0)
			.sorted();
	
	sorted.forEach(n -> System.out.print(n+ " "));
	*/
	
	/*
	int size = 10_000;
	ArrayList<Integer> nums = new ArrayList<>(size);
	
	Random rand = new Random();
	
	for (int i = 1; i <= size; i++) {
		nums.add(rand.nextInt(10));
	}
	*/
	
//	System.out.println(nums);
	
	/*
	int sum1 = nums.stream()
//			.map(i -> i*2)
			.reduce(0, (c,e) -> c+e);
	*/
	
	/*
	long startSeq = System.currentTimeMillis();
	int sum2 = nums.stream()
//			.map(i -> i*2)
			.mapToInt(i -> i)
			.sum();
	long endSeq = System.currentTimeMillis();
	
	long startPara = System.currentTimeMillis();
	int sum3 = nums.parallelStream()
//			.map(i -> i*2)
			.mapToInt(i -> i)
			.sum();
	long endPara = System.currentTimeMillis();

	System.out.println(sum2+" "+sum3);
	System.out.println("Sequence: "+(endSeq-startSeq));
	System.out.println("Parallel: "+(endPara-startPara));
	*/
	
	List<String> names = Arrays.asList("Naveen", "Rahul", "Rohit", "Lakshman");
	
	String name = names.stream()
			.filter(str -> str.contains("x"))
			.findFirst()
			.orElse("Not Found");
	
//	System.out.println(name.get());
	System.out.println(name);
}
}
