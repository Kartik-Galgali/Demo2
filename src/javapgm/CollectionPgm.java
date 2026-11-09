package javapgm;

import java.util.ArrayList;
import java.util.List;

public class CollectionPgm {
public static void main(String[] args) {
	List<Object> arr = new ArrayList<>();
	arr.add(12);
	arr.add(14);
	arr.add(15);
	arr.add(21);
	
	System.out.println(arr);
	for (Object o : arr) {
		System.out.println(o);
	}
}
}
