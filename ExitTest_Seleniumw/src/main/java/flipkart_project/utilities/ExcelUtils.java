package flipkart_project.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public final class ExcelUtils {
	private ExcelUtils() {
	}

	
	public static List<Map<String, String>> getTestDetails() {
		List<Map<String,String>> list = null;

		FileInputStream fs = null;
		try {
			fs = new FileInputStream(BasePage.getExcelpath());
			//@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(ReadingPropertiesFile.getProperty("sheetname"));

			int lastrownum = sheet.getLastRowNum();
			int lastcolnum = sheet.getRow(0).getLastCellNum();
			Map<String, String> map = null;
			list = new ArrayList<>();
			
			//DataFormatter formatter = new DataFormatter();
			for (int i = 1; i <= lastrownum; i++) {
				map=new HashMap<>();
				for (int j = 0; j < lastcolnum; j++) {
					
//					Cell cell1 = sheet.getRow(0).getCell(j);   
//	                //SET AS STRING TYPE
//	                cell1.setCellType(Cell.CELL_TYPE_STRING);
//	                String key= cell1.getStringCellValue();
//	                
	                Cell cell2 = sheet.getRow(i).getCell(j);   
	                //SET AS STRING TYPE
	                cell2.setCellType(Cell.CELL_TYPE_STRING);
	                String value= cell2.getStringCellValue();
	                
					String key=sheet.getRow(0).getCell(j).getStringCellValue();
					//String value=sheet.getRow(i).getCell(j).getStringCellValue();
					map.put(key, value);

				}
				list.add(map);
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(Objects.nonNull(fs)) {
					fs.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

		return list;

	}

}
