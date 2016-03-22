package datastructures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws IOException {
		
		int a = 50;
		char b  =(char)a;
		
		System.out.println("a is : "+a+" b is : "+b);
		Test t = new Test();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		//t.changeVal(al);
		System.out.println(al);
		
		int[] data = {34,56,3,4,65};
		
		MergeSort.sort(data);
		System.out.println(Arrays.toString(data));
		
		StringBuffer str = new StringBuffer("Amar");
		t.changeVal(str);
		System.out.println(str);
		
		String str1 = "test";
		String str2 = str1;
		//str2 += "amar";
		str1 = "newtest";
		//str2 = "test2";
		System.out.println("str1 and hascode is: "+str1+" and "+str1.hashCode()+" str2 and hashcode is: "+str2+" and "+str2.hashCode());
		
		int i = 10;
		int j = i;
		
		i = 20;
		
		System.out.println("i is : "+i);
		System.out.println("j is : "+j);
	}
	
	public void changeVal(StringBuffer data){
		changeVal2(data);
	}

	public void changeVal2(StringBuffer data) {
		data = new StringBuffer("fateh singh");
		
	}
}
