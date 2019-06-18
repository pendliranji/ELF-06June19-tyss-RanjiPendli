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
import com.app.model.Uom;

public class OrderExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		response.addHeader("Content-Disposition", "attachment;filename=ORDER.xlsx");
		Sheet sheet=workbook.createSheet("ORDER DATA");
		
		
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("MODE");
		row.createCell(2).setCellValue("CODE");
		row.createCell(3).setCellValue("METHOD");
		row.createCell(4).setCellValue("ACCEPT");
		row.createCell(5).setCellValue("DESCRIPTION");

		List<OrderMethod> uom=(List<OrderMethod>)model.get("uom");
		setHead(sheet,uom);
		
		
	}
	
	public void setHead(Sheet sheet,List<OrderMethod> uom)
	{
		int rowNumber=1;
		
		for(OrderMethod u:uom) {

		Row row=sheet.createRow(rowNumber++);
		row.createCell(0).setCellValue(u.getId());
		row.createCell(1).setCellValue(u.getMode());
		row.createCell(2).setCellValue(u.getCode());
		row.createCell(3).setCellValue(u.getMethod());
		row.createCell(4).setCellValue(u.getAccept().toString());
		row.createCell(5).setCellValue(u.getDsc());
		}
	}

		
	}


