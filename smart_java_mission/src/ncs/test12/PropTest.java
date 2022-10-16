package ncs.test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		 //명시한 사용 데이터를 prop 에 기록한다.
		String line = "1=apple,1200,3, 2=banana,2500,2, 3=grape,4500,5, 4=orange,800,10, 5=melon,5000,2";
		String[] dataWord = line.split(",\\s");
		for(String word : dataWord) {
			String[] keyValue = word.split("=");
			prop.setProperty(keyValue[0], keyValue[1]);
		}
		
		 // fileSave() 메소드를 호출한다.
		 fileSave(prop);
		 // fileOpen() 메소드를 호출한다.
		 fileOpen(prop);
	}
	public static void fileSave(Properties p) {
		try(FileOutputStream fos = new FileOutputStream("src/ncs/test12/data.xml")){
			p.storeToXML(fos, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(Properties p) {
		Fruit[] fruitArray = null;
		ArrayList<Fruit> fruitList = null;
		try(FileInputStream fis = new FileInputStream("src/ncs/test12/data.xml")){
			p.load(fis);
			fruitList = new ArrayList<Fruit>();
			int keyInt = 1;
			while(true) {
				try {
					String key = String.valueOf(keyInt++);
					String[] data = p.getProperty(key).split(",");
					fruitList.add(new Fruit(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2])));
					
				}catch(Exception e) {
					break;
				}
			}
			fruitArray = fruitList.toArray(new Fruit[0]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Fruit fu : fruitArray) {
			System.out.println(fu.toString());
		}
	}
}
