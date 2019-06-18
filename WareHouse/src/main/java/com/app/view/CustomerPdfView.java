package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Customer;
import com.app.model.OrderMethod;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class CustomerPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {


		response.addHeader("Content-Disposition", "attachment;filename=CUSTOMER.pdf");
		Paragraph p=new Paragraph("WELCOME TO CUSTOMER DATA");
		document.add(p);
		
		List<Customer> uom=(List<Customer>)model.get("uom");
		PdfPTable t=new PdfPTable(6);
		t.addCell("ID");
		t.addCell("CODE");
		t.addCell("ADDRESS");
		t.addCell("LOCATIONS");
		t.addCell("ENABLED");
		t.addCell("CONTACT");
		
		for(Customer u:uom)
		{
			t.addCell(u.getCustId().toString());
			t.addCell(u.getCustCode());
			t.addCell(u.getCustAddr());
			t.addCell(u.getCustLocs().toString());
			t.addCell(u.getCustEnabled());
			t.addCell(u.getCustContact());
		}
	
	
		document.add(t);
		document.add(new Paragraph(new Date().toString()));
	
	}

}
