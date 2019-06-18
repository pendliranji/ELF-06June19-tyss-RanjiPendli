package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.ShipmentType;
import com.app.model.WhUserType;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class UserTypePdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 
		response.addHeader("Content-Disposition", "attachment;filename=USERTYPE.pdf");
		Paragraph p=new Paragraph("WELCOME TO USER DATA");
		document.add(p);

		List<WhUserType> uom=(List<WhUserType>)model.get("uom");
		PdfPTable t=new PdfPTable(9);
		t.addCell("ID");
		t.addCell("USER TYPE");
		t.addCell("USER CODE");
		t.addCell("USER FOR");
		t.addCell("EMAIL");
		t.addCell("CONTACT");
		t.addCell("ID TYPE");
		t.addCell("IF OTHER");
		t.addCell("IN NUMBER");
		
		for(WhUserType u:uom)
		{
			t.addCell(u.getId().toString());
			t.addCell(u.getType());
			t.addCell(u.getCode());
			t.addCell(u.getForType());
			t.addCell(u.getEmail());
			t.addCell(u.getContact());
			t.addCell(u.getIdType());
			t.addCell(u.getIfOther());
			t.addCell(u.getIdNum());
			
		}


		document.add(t);
		document.add(new Paragraph(new Date().toString()));

	}
		
	}

