//Credits: The non-modified heap sorting class was initially created by Adohe

public class HeapSort
{
    private int[] a;
    private int nElems;               // number of data items
    private long elapsedTime;       // The time in milliseconds that it took the sorting to finish

    public HeapSort(int max)
    {
        a = new int[max];
        nElems = 0;
    }

    public void insert(int value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    public void heapSort()
    {
        //get the current time in millisecond
        long start = System.currentTimeMillis();

        int length = a.length;

        buildMaxHeap(a, length);
        for(int i = length - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            maxHeapify(a, 1, i);
        }

        //get the current time in millisecond
        long end = System.currentTimeMillis();

        //get the amount of time that took the algorithm to run
        elapsedTime = end - start;
    }

    private void buildMaxHeap(int[] array, int heapSize)
    {
        if(array == null) {
            throw new NullPointerException("null");
        }
        if(array.length <=0 || heapSize <= 0) {
            throw new IllegalArgumentException("illegal");
        }
        if(heapSize > array.length) {
            heapSize = array.length;
        }

        for(int i = heapSize/2; i > 0; i--) {
            maxHeapify(array, i, heapSize);
        }
    }

    private void maxHeapify(int[] array, int index, int heapSize)
    {
        int l = index * 2;
        int r = l + 1;
        int largest;

        if(l <= heapSize && array[l - 1] > array[index - 1]) {
            largest = l;
        } else {
            largest = index;
        }

        if(r <= heapSize && array[r - 1] > array[largest - 1]) {
            largest = r;
        }

        if(largest != index) {
            int temp = array[index - 1];
            array[index - 1] = array[largest - 1];
            array[largest - 1] = temp;
            maxHeapify(array, largest, heapSize);
        }
    }

    public long getElapsedTime()
    {
        //return the elapsed time of the algorithm
        return elapsedTime;
    }
}
