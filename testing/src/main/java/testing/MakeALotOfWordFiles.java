package testing;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;

public class MakeALotOfWordFiles {
	
	 public static void main(String args[]) throws Exception{
		    try {
		    	String original = "C:\\Users\\thuin\\OneDrive\\Documents\\test2\\test.docx";
		    	
		    	String fileChange = "C:\\Users\\thuin\\OneDrive\\Documents\\test2\\The Extra's Survival Chapter ";
		  
		    	Document document = new Document(original);
		    	
		    	for(int i = 101; i <= 120; i++)
		    	{

		    		document.saveToFile(fileChange + i + ".docx", FileFormat.Docx);

		    	}


		    } catch(Exception e){
		    	System.out.println(e.getMessage());
		    }
		    finally {
		    	System.out.println("This is the end");
		    }

		   }

}
