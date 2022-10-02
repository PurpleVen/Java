public class ArraySort {
    public static void ArraySort(int[] arr)
    {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int array[] = {56, 9, 45, 108, 567, 21};
        System.out.println( "Array values before sorting:" );
        for (int i =0 ; i < array.length; i++)
        {
            System.out.print(array[i]+ "  ");
        }
        System.out.println();
        ArraySort(array);
        System.out.println( "Array values after sorting:" );
        for (int i =0 ; i < array.length; i++)
        {
            System.out.print(array[i]+ "  ");
        }
    }
}

