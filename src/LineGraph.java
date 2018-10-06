import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class LineGraph extends ApplicationFrame
{

    public LineGraph(String applicationTitle , String chartTitle, String xAxisLabel, String yAxisLabel, XYDataset dataset, int width, int height)
    {
        //Set the title of the window by calling the constructor of the super class
        super(applicationTitle);

        //Create our chart
        JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
                xAxisLabel, yAxisLabel, dataset);

        //Create our chart panel
        ChartPanel chartPanel = new ChartPanel(chart);
        //Set the size of our panel
        chartPanel.setPreferredSize( new java.awt.Dimension(width, height));
        //Apply the chart panel to the window
        setContentPane(chartPanel);
    }

    public void Show()
    {
        //We pack the components all together
        this.pack();
        //Set the window at the center of the screen
        RefineryUtilities.centerFrameOnScreen(this);
        //We make the window visible
        this.setVisible(true);
    }
}
