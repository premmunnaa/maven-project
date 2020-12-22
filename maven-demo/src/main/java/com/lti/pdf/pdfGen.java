package com.lti.pdf;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfGen {
	public static void main(String args[]) {
		Document document = new Document();
		try {
			FileOutputStream out =  new FileOutputStream("d:/NewGeneratedPdf.pdf");
			PdfWriter writer = PdfWriter.getInstance(document,out);
			
			document.open();
			Paragraph para = new Paragraph("Content of pdf will be here");
			document.add(para);
			document.close();
			
			writer.close();
			System.out.println("pdf generated");
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
