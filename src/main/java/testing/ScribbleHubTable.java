package testing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class ScribbleHubTable {
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		
	ArrayList<String> arr=new ArrayList<String>();
	File f=new File("C:\\Users\\thuin\\git\\TesNovelPotato\\target\\Scribble\\inputStat.txt");
	
	//C:\Users\thuin\git\TesNovelPotato\target\Scribble

	Scanner in=new Scanner(f);
	System.out.println("Read Data From The Txt file ");
	while(in.hasNext())
	{    

	arr.add(in.nextLine());
	}
	
	ArrayList<String> data1 = new ArrayList<String>();
	ArrayList<String> data2 = new ArrayList<String>();
	
	for(String stat:arr) {
		
		String newStat = stat.replaceAll(":", "").replaceAll("\\s+", " ").trim().replaceAll(" +", " ");
		String newStat2 = newStat.replaceAll("Remaining Points", "RemainingZPoints");
		String newStat3 = newStat2.replaceAll("Sour Apples", "SourZApples");
		
		String[] arrayStat = newStat3.split(" ");
		data1.add(arrayStat[0].replaceAll("Z", " "));
		data2.add(arrayStat[1].replaceAll("Z", " "));
		
	}
	publishToExcel(data1,data2);
	
	//writeToExcel("C:\\Users\\thuin\\git\\TesNovelPotato\\target\\Scribble\\Writesheet.xlsx", Arrays.asList(data1, data2));


	}
	
	public static void publishToExcel(ArrayList<String> data1, ArrayList<String> data2) throws IOException {
		   // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        /* CreationHelper helps us create instances of various things like DataFormat, 
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Employee");


        // Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        // Create Other rows and cells with employees data
        for(int rowNum = 0; rowNum < data1.size(); rowNum++) {
            Row row = sheet.createRow(rowNum);

            row.createCell(0)
                    .setCellValue(data1.get(rowNum));

            row.createCell(1)
                    .setCellValue(data2.get(rowNum));
        }

		// Resize all columns to fit the content size
        for(int i = 0; i < data1.size(); i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\thuin\\git\\TesNovelPotato\\target\\Scribble\\Writesheet.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
	}
	

	
}

