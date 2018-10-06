import java.util.Arrays;

public class QuickSort
{
    private int[] a;                 // ref to array a
    private int nElems;               // number of data items
    private long elapsedTime;           // The time in milliseconds that it took the sorting to finish

    public QuickSort(int max)          // constructor
    {
        a = new int[max];                 // create the array
        nElems = 0;                        // no items yet
    }

    public void insert(int value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    public void quickSort()
    {
        //get the current time in millisecond
        long start = System.currentTimeMillis();

        Arrays.sort(a);

        //get the current time in millisecond
        long end = System.currentTimeMillis();

        //get the amount of time that took the algorithm to run
        elapsedTime = end - start;
    }

    public long getElapsedTime()
    {
        //return the elapsed time of the algorithm
        return elapsedTime;
    }
}
