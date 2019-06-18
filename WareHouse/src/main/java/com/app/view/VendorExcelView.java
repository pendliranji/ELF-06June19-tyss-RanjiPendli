package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.OrderMethod;
import com.app.model.Vendor;

public class VendorExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {


		response.addHeader("Content-Disposition", "attachment;filename=VENDOR.xlsx");
		Sheet sheet=workbook.createSheet("VENDOR DATA");
		
		
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("NAME");
		row.createCell(2).setCellValue("CODE");
		row.createCell(3).setCellValue("DESIGNATION");
		row.createCell(4).setCellValue("PRESERVE");

		List<Vendor> uom=(List<Vendor>)model.get("uom");
		setHead(sheet,uom);
		
		
	}
	
	public void setHead(Sheet sheet,List<Vendor> uom)
	{
		int rowNumber=1;
		
		for(Vendor u:uom) {

		Row row=sheet.createRow(rowNumber++);
		row.createCell(0).setCellValue(u.getVenId());
		row.createCell(1).setCellValue(u.getVenName());
		row.createCell(2).setCellValue(u.getVenCode());
		row.createCell(3).setCellValue(u.getVenDesg());
		row.createCell(4).setCellValue(u.getVenPreserve().toString());
		}
	}

}
