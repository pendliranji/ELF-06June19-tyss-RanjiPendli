package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.Item;

public class ItemExcelView extends AbstractXlsxView {

	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse res) throws Exception {

		Sheet sheet=workbook.createSheet("ITEM");
		res.addHeader("Content-Disposition", "attachment;filename=item.xlsx");
		
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("CODE");
		row.createCell(2).setCellValue("DIMENSIONS");
		row.createCell(3).setCellValue("COST");
		row.createCell(4).setCellValue("CURRENCY");
		row.createCell(5).setCellValue("UOM");
		row.createCell(6).setCellValue("DESCRIPTION");
		List<Item> it=(List<Item>)model.get("item");
		
		setBody(sheet,it);
	
	}
	
	private void setBody(Sheet sheet,List<Item> it)
	{
		
		int rowNumber=1;
		
		for(Item i:it)
		{

			Row row=sheet.createRow(rowNumber++);
			row.createCell(0).setCellValue(i.getItId());
			row.createCell(1).setCellValue(i.getItCode());
			row.createCell(2).setCellValue(i.getItWidth());
			row.createCell(2).setCellValue(i.getItHeight());
			row.createCell(2).setCellValue(i.getItLength());
			row.createCell(3).setCellValue(i.getItCost());
			row.createCell(4).setCellValue(i.getItCurrency());
			row.createCell(5).setCellValue(i.getUomm().getModel());
			row.createCell(6).setCellValue(i.getItDsc());
		}
		
		
		
	}
	
	
	
}
