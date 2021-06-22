package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
   int MAX_POINT = 3;
        if (k == 0)
        {
            printArray(arr, i);
        }
        else if(n > 0)
        {
            for (int k = 1; k <= MAX_POINT; k++)
            {
                arr[i]= k;
                printCompositions(arr, n-k, i+1);
            }
        }
    }
     
    // Utility function to print array arr[]
    static void printArray(int arr[], int m)
    {
        for (int i = 0; i < m; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
   public static void main (String[] args)
    {
        int n = 5;
        int size = 100;
        int[] arr = new int[size];
        System.out.println("Different compositions formed by 1, 2 and 3 of "+ n + " are");
        printCompositions(arr, n, 0);
    }
    return 0;
  }

}
