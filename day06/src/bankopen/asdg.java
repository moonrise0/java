package bankopen;

import java.util.Arrays;

public class asdg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[]a= new int[]{4,2,3,4,5};
	
	System.out.println(a.length);
	
	System.out.print(a[1]+" ");
	System.out.print(a[2]+" ");
	System.out.print(a[3]+" ");
	System.out.print(a[4]+" ");
	System.out.print(a[0]+" ");
    System.out.println();
	
	for(int i =0; i<a.length; i++) 
	System.out.print(a[i]+" ");
	System.out.println();
	
	for(int k:a) {
		System.out.print(k +" ");
	}

	System.out.println(Arrays.toString(a));
	

int ab[][]= {{1,2},{1,2,3}};
for(int[]k :ab){
	for (int s:k) {
		System.out.print(s + " ");
	}
}
	String str2 = new String("java");
	String str3 = new String("java");
    
	System.out.println();	
	System.out.println(str2.equals(str3));
	


}}