package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class K번째큰수정리선형구조 {

public static void main(String[] args) {
	int[] num = {22, 33, 66, 11, 10, 15};
	System.out.println(Arrays.toString(num));
	Arrays.sort(num);
	System.out.println(Arrays.toString(num));
	System.out.println(num.length);
	System.out.println(num[num.length-1]);
	System.out.println(num[num.length-2]);
	
	int k = 3;
	int arr[] = {22, 22, 44, 11, 11, 33, 55, 66};
	TreeSet<Integer> tree = new TreeSet<Integer>();
	for (int i = 0; i < arr.length; i++) {
		tree.add(arr[i]);
	}
	System.out.println(tree);
	System.out.println(tree.size());
	System.out.println(tree.first());
	System.out.println(tree.last());
	System.out.println(tree.lower(20));
	Object[] arr2 = tree.toArray();
	System.out.println(arr2[arr2.length-3]);
	
}

}
