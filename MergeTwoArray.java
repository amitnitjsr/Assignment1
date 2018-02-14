import java.util.*;
 
class MergeTwoArray {
            public static void sortedMerge(int a[], int b[], int res[], int n,int m) {
                    
            int i = 0, j = 0, k = 0;
            while (i < n) {
            res[k] = a[i];
            i ++;
            k ++;
        }
         
        while (j < m) {
            res[k] = b[j];
            j ++;
            k ++;
        }
      
        Arrays.sort(res);
    }
     
    
    public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st Array size");
		int n1=s.nextInt();
		System.out.println("Enter second Array size");
		int n2=s.nextInt();
        int a[] =new int[n1];
        int b[] = new int[n2];
		System.out.println("Enter first Array Number");
		for(int i=0;i<n1;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter Second Array Number");
		for(int i=0;i<n2;i++){
			b[i]=s.nextInt();
		}
        
        int res[]=new int[n1 + n2];
        sortedMerge(a, b, res, n1, n2);
      
        System.out.print( "Sorted merged list :");
        for (int i = 0; i < n1 + n2; i++)
            System.out.print(" " + res[i]);   
    }
}