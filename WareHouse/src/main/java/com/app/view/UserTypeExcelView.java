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
import com.app.model.WhUserType;

public class UserTypeExcelView extends AbstractXlsxView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {


		response.addHeader("Content-Disposition", "attachment;filename=USERTYPE.xlsx");
		Sheet sheet=workbook.createSheet("USER DATA");
		
		
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("USER TYPE");
		row.createCell(2).setCellValue("USER CODE");
		row.createCell(3).setCellValue("USER FOR");
		row.createCell(4).setCellValue("EMAIL");
		row.createCell(5).setCellValue("CONTACT");
		row.createCell(5).setCellValue("ID TYPE");
		row.createCell(5).setCellValue("IF OTHER");
		row.createCell(5).setCellValue("IN NUMBER");

		List<WhUserType> uom=(List<WhUserType>)model.get("uom");
		setHead(sheet,uom);
		
		
	}
	
	public void setHead(Sheet sheet,List<WhUserType> uom)
	{
		int rowNumber=1;
		
		for(WhUserType u:uom) {

		Row row=sheet.createRow(rowNumber++);
		row.createCell(0).setCellValue(u.getId());
		row.createCell(1).setCellValue(u.getType());
		row.createCell(2).setCellValue(u.getCode());
		row.createCell(3).setCellValue(u.getForType());
		row.createCell(4).setCellValue(u.getEmail());
		row.createCell(5).setCellValue(u.getContact());
		row.createCell(6).setCellValue(u.getIdType());
		row.createCell(7).setCellValue(u.getIfOther());
		row.createCell(8).setCellValue(u.getIdNum());
		
		
		}
	}

		
	}


