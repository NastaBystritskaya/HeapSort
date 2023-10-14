package au.bystritskaia;

import au.bystritskaia.sort.HeapSort;

import java.util.Arrays;

/**
 * ДЗ 2 семинара "Алгоритмы и структуры данных "
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] array = {1, 4, 10, 22, 9, 18, 23, 45, 3};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
