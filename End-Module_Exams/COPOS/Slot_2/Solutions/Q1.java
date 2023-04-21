import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int a[] = new int[sc.nextInt()];
		
		// Taking size as input from user
		
		System.out.println("Enter the elements of array");
		// Taking elements as input
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Elements of array: ");
		// Printing array elements
		
		for(int i=0; i<a.length; i++) {
		    System.out.print(a[i]+" ");
		}
		System.out.println();
		int count=0;
		
		for(int i=0;i<a.length;i++){
		    count=0;
		    for(int j=0;j<a.length;j++){
		        if((j<i)&&(a[i]==a[j])){
		            break;//if number has been count in previous iteration then skip this iteration
		        }
		        else if(a[i]==a[j]){
		            count++;
		        }
		        
		    }
		    if(count>0){System.out.println("frequency of element "+a[i]+ " is "+count);}
		}

	}

}
