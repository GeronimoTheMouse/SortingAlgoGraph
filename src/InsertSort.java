//Credits: The non-modified heap sorting class was initially created by Dr. Alexander Astaras

class InsertSort
{
    private int[] a;                 // ref to array a
    private int nElems;               // number of data items
    private long elapsedTime;       // The time in milliseconds that it took the sorting to finish

    public InsertSort(int max)          // constructor
    {
        a = new int[max];                 // create the array
        nElems = 0;                        // no items yet
    }

    public void insert(int value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    public void insertionSort()
    {
        int in, out;

        //get the current time in millisecond
        long start = System.currentTimeMillis();

        for(out=1; out<nElems; out++)     // out is dividing line
        {
            int temp = a[out];            // remove marked item
            in = out;                      // start shifts at out
            while(in>0 && a[in-1] >= temp) // until one is smaller,
            {
                a[in] = a[in-1];            // shift item to right
                --in;                       // go left one position
            }
            a[in] = temp;                  // insert marked item
        }

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