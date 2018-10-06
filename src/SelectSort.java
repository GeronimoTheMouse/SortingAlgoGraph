//Credits: The non-modified heap sorting class was initially created by Dr. Alexander Astaras

class SelectSort
{
    private int[] a;                 // ref to array a
    private int nElems;               // number of data items
    private long elapsedTime;       // The time in milliseconds that it took the sorting to finish

    public SelectSort(int max)          // constructor
    {
        a = new int[max];                 // create the array
        nElems = 0;                        // no items yet
    }

    public void insert(int value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    public void selectionSort()
    {
        int out, in, min;

        //get the current time in millisecond
        long start = System.currentTimeMillis();

        for(out=0; out<nElems-1; out++)   // outer loop
        {
            min = out;                     // minimum
            for(in=out+1; in<nElems; in++) // inner loop
                if(a[in] < a[min] )         // if min greater,
                    min = in;               // we have a new min
            swap(out, min);                // swap them
        }

        //get the current time in millisecond
        long end = System.currentTimeMillis();

        //get the amount of time that took the algorithm to run
        elapsedTime = end - start;
    }

    private void swap(int one, int two)
    {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public long getElapsedTime()
    {
        //return the elapsed time of the algorithm
        return elapsedTime;
    }
}