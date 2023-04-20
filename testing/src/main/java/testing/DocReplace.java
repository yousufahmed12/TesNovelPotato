package testing;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;

public class DocReplace {

	 public static void main(String args[]) throws Exception{
    try {

    	String findKey = "Fredrick";
    	String replaceWith = "Frederick";
    	//String fileChange = "C:\\Users\\thuin\\OneDrive\\Documents\\test\\The Extra's Survival Chapter 1.docx";
    	
    	String fileChange = "C:\\Users\\thuin\\OneDrive\\Documents\\test\\The Extra's Survival Chapter ";
    	
    	// Find exact phrase and replace it with some other text using Java

    	
    	//Load a Word document
    	for(int i = 1; i <= 46; i++)
    	{
    	
        Document document = new Document(fileChange + i + ".docx");

        // Replace a specific text
        document.replace(findKey, replaceWith, false, true);

        //Save the result document
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
