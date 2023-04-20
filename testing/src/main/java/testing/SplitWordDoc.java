package testing;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class SplitWordDoc {

	public static void main(String args[]) throws Exception {
		try {

			String largeDoc = "C:\\Users\\thuin\\OneDrive\\Documents\\test4\\The Extra's Survival Chapter 0.docx";
			String resultAddingUp = "C:\\Users\\thuin\\OneDrive\\Documents\\test4\\The Extra's Survival Chapter ";

			FileInputStream fis = new FileInputStream(largeDoc);
			XWPFDocument file = new XWPFDocument(OPCPackage.open(fis));
			XWPFWordExtractor ext = new XWPFWordExtractor(file);

			String[] chapterArray = ext.getText().toString().split("Chapterend");

			for (int i = 0; i < 159; i++) {

				int chapterNumber = 53 + i;

				String chapterWords = chapterArray[i];

				chapterWords = chapterWords.replaceAll("\n", "\n\n");

				Document chapter = new Document();

				InputStream is = new ByteArrayInputStream(chapterWords.getBytes(StandardCharsets.UTF_8));
				chapter.loadText(is);
				chapter.saveToFile(resultAddingUp + chapterNumber + ".docx", FileFormat.Docx);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("This is the end");
		}

	}

}
