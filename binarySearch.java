class BinarySearch 
{ 
    double binarySearch(double arr[], double l, double r, double x) 
    { 
        if (r>=l) 
        { 
            double mid = l + (r - l)/2; 
  
            if (arr[mid] == x) 
               return mid; 
  
            if (arr[mid] > x) 
               return binarySearch(arr, l, mid-1, x); 
  
            return binarySearch(arr, mid+1, r, x); 
        } 
  
        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        double arr[] = {22.12,32.2,42.2,10.21,40.2}; 
        double n = arr.length; 
        double x = 10; 
        double result = ob.binarySearch(arr,0,n-1,x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " +  
                                                 result); 
    } 
} 