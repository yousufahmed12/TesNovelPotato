package testing;

import java.util.HashMap;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;

public class DocReplace2 {

	 public static void main(String args[]) throws Exception{
		    try {

		    	
		    	String fileChange = "C:\\Users\\thuin\\OneDrive\\Documents\\test3\\The Extra's Survival Chapter ";
		    	
		    	// Find exact phrase and replace it with some other text using Java


		    	// Find exact phrase and replace it with some other text using Java

		    	HashMap<String,String> replaceMap = new HashMap<String,String>();
		    	
		    	//replaceMap.put("</strong>","");
		    	//replaceMap.put("<div class='adsbox leaderboard' datdefid='60dde5f97f59757a33dd565b' datmobid='60dde5e82181c862ff65a351'></div>", "");
		    	//replaceMap.put("</p>","\n");
		    	//replaceMap.put("<p>","");
		    	replaceMap.put("<div class='lnadcontainer sml leaderboard' datdefid='60dde5f97f59757a33dd565b' datmobid='60dde5e82181c862ff65a351'></div>","");
		    	
		    	
		    	//Load a Word document
		    	for(String findKey: replaceMap.keySet()) {
		    		String replaceWith = replaceMap.get(findKey);
		    	for(int i = 0; i <= 0; i++)
		    	{
		    	
		        Document document = new Document(fileChange + i + ".docx");

		        // Replace a specific text
		        document.replace(findKey, replaceWith, false, true);

		        //Save the result document
		        document.saveToFile(fileChange + i + ".docx", FileFormat.Docx);
		    	}}


		    } catch(Exception e){
		    	System.out.println(e.getMessage());
		    }
		    finally {
		    	System.out.println("This is the end");
		    }

		   }

}
