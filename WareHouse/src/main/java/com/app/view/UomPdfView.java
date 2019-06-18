package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Uom;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;


public  class UomPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		response.addHeader("Content-Disposition", "attachment;filename=UOM.pdf");
		Paragraph p=new Paragraph("WELCOME TO UOM DATA");
		document.add(p);
		
		List<Uom> uom=(List<Uom>)model.get("uom");
		PdfPTable t=new PdfPTable(4);
		t.addCell("ID");
		t.addCell("TYPE");
		t.addCell("MODEL");
		t.addCell("DESCRIPTION");
		
		
		for(Uom u:uom)
		{
			t.addCell(u.getId().toString());
			t.addCell(u.getType());
			t.addCell(u.getModel());
			t.addCell(u.getDsc());
		}
	
	
		document.add(t);
		document.add(new Paragraph(new Date().toString()));
	
	}

}
