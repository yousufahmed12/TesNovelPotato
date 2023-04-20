package testing;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;

public class LargeWord {

	 public static void main(String args[]) throws Exception{
		    try {
		    	//String fileChange = "C:\\Users\\thuin\\OneDrive\\Documents\\test\\The Extra's Survival Chapter 1.docx";
		    	
		    	String fileChange = "C:\\Users\\thuin\\OneDrive\\Documents\\test3\\The Extra's Survival Chapter ";
		    	String resultAddingUp = "C:\\Users\\thuin\\OneDrive\\Documents\\test3\\resultFinal";
		  
		    	

		    	//This is the first file that is being added
		    	Document document = new Document(fileChange + 1 + ".docx");
		    	
		    	//This is from 2 to 3 that is being merged
		    	for(int i = 2; i <= 211; i++)
		    	{

		        document.insertTextFromFile(fileChange + i + ".docx", FileFormat.Docx);

		    	}
		    	
		    	document.saveToFile(resultAddingUp + ".docx", FileFormat.Docx);


		    } catch(Exception e){
		    	System.out.println(e.getMessage());
		    }
		    finally {
		    	System.out.println("This is the end");
		    }

		   }
}
