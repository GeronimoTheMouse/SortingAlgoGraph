import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.util.Random;

public class MainApp
{
    public static void main(String[] args)
    {
        //Declare our objects
        Random rnd = new Random();
        XYSeriesCollection dataset = new XYSeriesCollection();
        LineGraph graph = new LineGraph("Sorting Algorithms Performance App - Created by Michelangelo S.", "Sorting Performance Graph", "Items",
                "Time (In millisecond)", dataset, 700, 500);

        //Create our XY series for each algorithm
        XYSeries bubbleSeries = new XYSeries("Bubble Sort");
        XYSeries insertSeries = new XYSeries("Insert Sort");
        XYSeries selectSeries = new XYSeries("Select Sort");
        XYSeries quickSeries = new XYSeries("Quick Sort");
        XYSeries heapSeries = new XYSeries("Heap Sort");

        //Add the series for each algorithm to the dataset
        dataset.addSeries(bubbleSeries);
        dataset.addSeries(insertSeries);
        dataset.addSeries(selectSeries);
        dataset.addSeries(quickSeries);
        dataset.addSeries(heapSeries);

        //Make the graph window visible
        graph.Show();

        //Start the loop until we go up to 100.000 elements
        for(int i = 2; i < 100000; i += 50)
        {
            //Create an object of each of the sorting algorithms
            BubbleSort bubbleSort = new BubbleSort(i);
            InsertSort insertSort = new InsertSort(i);
            SelectSort selectSort = new SelectSort(i);
            QuickSort quickSort = new QuickSort(i);
            HeapSort heapSort = new HeapSort(i);

            //Populate the bubble sort object with the required data
            for(int f = 0; f < i; f++)
                bubbleSort.insert(rnd.nextInt());

            //Populate the insert sort object with the required data
            for(int f = 0; f < i; f++)
                insertSort.insert(rnd.nextInt());

            //Populate the select sort object with the required data
            for(int f = 0; f < i; f++)
                selectSort.insert(rnd.nextInt());

            //Populate the quick sort object with the required data
            for(int f = 0; f < i; f++)
                quickSort.insert(rnd.nextInt());

            //Populate the heap sort object with the required data
            for(int f = 0; f < i; f++)
                heapSort.insert(rnd.nextInt());

            //Run all the sorting procedures
            bubbleSort.bubbleSort();
            insertSort.insertionSort();
            selectSort.selectionSort();
            quickSort.quickSort();
            heapSort.heapSort();

            //Add the records to our graph
            bubbleSeries.add(i, bubbleSort.getElapsedTime());
            insertSeries.add(i, insertSort.getElapsedTime());
            selectSeries.add(i, selectSort.getElapsedTime());
            quickSeries.add(i, quickSort.getElapsedTime());
            heapSeries.add(i, heapSort.getElapsedTime());
        }
    }
}
