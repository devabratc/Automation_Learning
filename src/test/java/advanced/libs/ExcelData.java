package advanced.libs;

import java.util.List;
import java.util.Map;
import com.framework.utils.ReadExcel;

public class ExcelData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] testData = ReadExcel.readData("TestData.xlsx","Sheet1");
		List<Map<String,String>> data = ReadExcel.readExcelData("TestData.xlsx", "Sheet1");
		System.out.println(data);
		//System.out.println(testData); 
	}
}
