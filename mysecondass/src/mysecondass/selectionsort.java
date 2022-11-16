package mysecondass;

import java.util.Arrays;

public class selectionsort {

	public static void main(String[] args) {
		// WAP to sort an array using Selection Sort Algorithm.
		int a[]= {2,5,4,1,6,0};
		for(int i=0;i<a.length-1;i++) {
			int x=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[x]>a[j]) {
					x=j;
				}
			}
			int temp=a[x];
			a[x]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
