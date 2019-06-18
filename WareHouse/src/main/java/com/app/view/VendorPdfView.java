package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Vendor;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class VendorPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		


		response.addHeader("Content-Disposition", "attachment;filename=VENDOR.pdf");
		Paragraph p=new Paragraph("WELCOME TO VENDOR DATA");
		document.add(p);
		
		List<Vendor> uom=(List<Vendor>)model.get("uom");
		PdfPTable t=new PdfPTable(5);
		t.addCell("ID");
		t.addCell("NAME");
		t.addCell("CODE");
		t.addCell("DESGINATION");
		t.addCell("PRESERVE");
		
		for(Vendor u:uom)
		{
			t.addCell(u.getVenId().toString());
			t.addCell(u.getVenName());
			t.addCell(u.getVenCode());
			t.addCell(u.getVenDesg());
			t.addCell(u.getVenPreserve().toString());
		}
	
	
		document.add(t);
		document.add(new Paragraph(new Date().toString()));
	
	}
		
	}


