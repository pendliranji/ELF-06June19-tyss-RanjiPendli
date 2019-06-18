package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.Customer;
import com.app.model.OrderMethod;

public class CustomerExcelView extends AbstractXlsxView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		
		response.addHeader("Content-Disposition", "attachment;filename=CUSTOMER.xlsx");
		Sheet sheet=workbook.createSheet("CUSTOMER DATA");
		
		
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("CODE");
		row.createCell(2).setCellValue("ADDRESS");
		row.createCell(3).setCellValue("LOCATIONS");
		row.createCell(4).setCellValue("ENABLED");
		row.createCell(5).setCellValue("CONTACT");

		List<Customer> uom=(List<Customer>)model.get("uom");
		setHead(sheet,uom);
		
		
	}
	
	public void setHead(Sheet sheet,List<Customer> uom)
	{
		int rowNumber=1;
		
		for(Customer u:uom) {

		Row row=sheet.createRow(rowNumber++);
		row.createCell(0).setCellValue(u.getCustId());
		row.createCell(1).setCellValue(u.getCustCode());
		row.createCell(2).setCellValue(u.getCustAddr());
		row.createCell(3).setCellValue(u.getCustLocs().toString());
		row.createCell(4).setCellValue(u.getCustEnabled());
		row.createCell(5).setCellValue(u.getCustContact());
		}
	}

}
