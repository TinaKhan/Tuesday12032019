package com.datadriven;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Datadriven {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		File f=new File("C://Users//Neisha//Desktop.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet("Sheet1");
		int rows=s.getRows();
		int columns=s.getColumns();
		System.out.println(rows);
		System.out.println(columns);

	}

}
