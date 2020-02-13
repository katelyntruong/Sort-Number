
public class Demo {
	private static void printArray(int input[]) 
    { 
        int n = input.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(input[i] + " "); 
        System.out.println(); 
    } 
	public static void main(String args[]) { 
        int input[] = {12, 11, 13, 5, 6, 7};
        int inputAs[] = {5, 6, 7, 11, 12, 13};
        int inputDes[] = {13, 12, 11, 7, 6, 5};
        
        System.out.println("Given Array"); 
        printArray(input); 
        Sort.mergesort(input); 
        System.out.println("Sorted array after mergerSort is"); 
        printArray(input);
        Sort.quicksort(input);
        System.out.println("Sorted array after quickSort is"); 
        printArray(input);
        int k = 2; 
        System.out.print( "K'th smallest element is "+ Sort.kthSmallest(input, k) + "\n");
        
        
        System.out.println("\nGiven Array"); 
        printArray(inputAs); 
        Sort.mergesort(inputAs); 
        System.out.println("Sorted array after mergerSort is"); 
        printArray(inputAs);
        Sort.quicksort(inputAs);
        System.out.println("Sorted array after quickSort is"); 
        printArray(inputAs);  
        int k2 = 2; 
        System.out.print( "K'th smallest element is "+ Sort.kthSmallest(inputAs, k2) + "\n" );
        
        
        System.out.println("\nGiven Array"); 
        printArray(inputDes); 
        Sort.mergesort(inputDes); 
        System.out.println("Sorted array after mergerSort is"); 
        printArray(inputAs);
        Sort.quicksort(inputDes);
        System.out.println("Sorted array after quickSort is"); 
        printArray(inputDes);  
        int k3 = 2; 
        System.out.print( "K'th smallest element is "+ Sort.kthSmallest(inputDes, k3) );
        
        
        
        
        
    } 
}
