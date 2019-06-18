package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Item;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ItemPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse res) throws Exception {
		res.addHeader("Content-Disposition", "attachment;filename=item.pdf");
		
		List<Item> it=(List<Item>)model.get("item");
		
		Paragraph p=new Paragraph("ITEMS VIEW");
		document.add(p);
		PdfPTable t=new PdfPTable(9);
		
		t.addCell("ID");	
		t.addCell("CODE");
		t.addCell("WIDTH");
		t.addCell("LENGTH");
		t.addCell("HEIGHT");
		t.addCell("COST");
		t.addCell("CURRENCY");
		t.addCell("UOM");
		t.addCell("DESCRIPTION");


		
for(Item i:it)
{
t.addCell(i.getItId().toString());	
t.addCell(i.getItCode());
t.addCell(i.getItWidth().toString());
t.addCell(i.getItLength().toString());
t.addCell(i.getItHeight().toString());
t.addCell(i.getItCost().toString());
t.addCell(i.getItCurrency());
t.addCell(i.getUomm().getModel());
t.addCell(i.getItDsc());




}
		
		document.add(t);
		
		
	}

}
