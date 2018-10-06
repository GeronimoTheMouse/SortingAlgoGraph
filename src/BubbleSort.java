//Credits: The non-modified heap sorting class was initially created by Dr. Alexander Astaras

class BubbleSort
{
    private int[] a;                 // ref to array a
    private int nElems;               // number of data items
    private long elapsedTime;       // The time in milliseconds that it took the sorting to finish

    public BubbleSort(int max)          // constructor
    {
        a = new int[max];                 // create the array
        nElems = 0;                        // no items yet
    }

    public void insert(int value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    public void bubbleSort()
    {
        int out, in;

        //get the current time in millisecond
        long start = System.currentTimeMillis();

        for(out=nElems-1; out>1; out--)   // outer loop (backward)
            for(in=0; in<out; in++)        // inner loop (forward)
                if( a[in] > a[in+1] )       // out of order?
                    swap(in, in+1);          // swap them

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

    private void swap(int one, int two)
    {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}