package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.Uom;

public class UomExcelView extends AbstractXlsxView {

	
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		response.addHeader("Content-Disposition", "attachment;filename=UOM.xlsx");
		Sheet sheet=workbook.createSheet("UOM DATA");
		
		
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("TYPE");
		row.createCell(2).setCellValue("MODEL");
		row.createCell(3).setCellValue("DESCRIPTION");

		List<Uom> uom=(List<Uom>)model.get("uom");
		setHead(sheet,uom);
		
		
	}
	
	public void setHead(Sheet sheet,List<Uom> uom)
	{
		int rowNumber=1;
		
		for(Uom u:uom) {

		Row row=sheet.createRow(rowNumber++);
		row.createCell(0).setCellValue(u.getId());
		row.createCell(1).setCellValue(u.getType());
		row.createCell(2).setCellValue(u.getModel());
		row.createCell(3).setCellValue(u.getDsc());
		}
	}

}
