package mysecondass;

public class bubblesort {

	public static void main(String[] args) {
		// WAP to sort an array using Bubble Sort Algorithm.
		int a[]= {5,8,2,9,3,4};
		int temp;
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
			for(int ele:a)
			{
				System.out.println(ele);
			}

	}

}
