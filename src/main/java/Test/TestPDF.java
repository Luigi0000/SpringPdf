package Test;

import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class TestPDF {

	public static void main(String[] args) {
		try {
			Document document = new Document();
			PdfWriter.getInstance(document,
					new FileOutputStream("C:\\Insert yuor path for save \\Yuornamefile"));

			document.open();
			// Add Table
			PdfPTable table = new PdfPTable(2); // 2 columns
			table.setWidthPercentage(100);
			System.out.println("Saved File"+ document);

			// Add column headings

			table.addCell(new Phrase("Name"));
			table.addCell(new Phrase("Surname"));

			// Add data inside table
		
			table.addCell("John");
			table.addCell("");
			table.addCell("Jane");
			table.addCell("Smith");

			// Add the table to the document
			document.add(table);
			document.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
