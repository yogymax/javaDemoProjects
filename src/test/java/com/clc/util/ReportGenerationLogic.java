package com.clc.util;

import java.io.File;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class ReportGenerationLogic {
	
	
	public static void generateTestReport(int pass,int fail,int skip) throws Exception {
	      DefaultPieDataset dataset = new DefaultPieDataset( );
	      dataset.setValue("Pass", new Double( pass ) );
	      dataset.setValue("Fail", new Double( fail) );
	      dataset.setValue("Skip", new Double(skip ) );

	      JFreeChart chart = ChartFactory.createPieChart(
	         "TestReports",   // chart title
	         dataset,          // data
	         true,             // include legend
	         true,
	         false);
	         
	      int width = 640;   /* Width of the image */
	      int height = 480;  /* Height of the image */ 
	      File pieChart = new File( "CLCTestReport.jpeg" ); 
	      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
	   }
	

}
