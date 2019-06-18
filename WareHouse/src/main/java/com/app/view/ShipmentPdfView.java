package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.OrderMethod;
import com.app.model.ShipmentType;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ShipmentPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		response.addHeader("Content-Disposition", "attachment;filename=SHIPMENT.pdf");
		Paragraph p=new Paragraph("WELCOME TO SHIPMENT DATA");
		document.add(p);

		List<ShipmentType> uom=(List<ShipmentType>)model.get("uom");
		PdfPTable t=new PdfPTable(6);
		t.addCell("ID");
		t.addCell("MODE");
		t.addCell("CODE");
		t.addCell("ENABLED");
		t.addCell("GRADE");
		t.addCell("DESCRIPTION");

		for(ShipmentType u:uom)
		{
			t.addCell(u.getId().toString());
			t.addCell(u.getMode());
			t.addCell(u.getCode());
			t.addCell(u.getEnabled());
			t.addCell(u.getGrade());
			t.addCell(u.getDsc());
		}


		document.add(t);
		document.add(new Paragraph(new Date().toString()));

	}

}

