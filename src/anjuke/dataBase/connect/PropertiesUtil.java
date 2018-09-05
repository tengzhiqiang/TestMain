package anjuke.dataBase.connect;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	
	public static void main(String g[]){
		
		PropertiesUtil pu = new PropertiesUtil();
		String pathoo = "";
		pathoo = System.getProperty("user.dir");  //��ȡ·������1
		System.out.println("jiandan"+pathoo);
		File  file  = new File("");               //��ȡ·������2
        System.out.println(file.getAbsolutePath());
		String filePath = "";
		filePath = (pu.getWebClassesPath()).substring(0, pu.getWebClassesPath().indexOf("bin"));
		filePath = filePath + "OCS_Product/chenghouwei.properties"; //�õ�Properties�ļ���Ŀ¼
		System.out.println(pathoo);
	    try {
	    	 Properties pp = new Properties();
	         InputStream in = new BufferedInputStream (new FileInputStream(filePath));
	         pp.load(in);        //����Properties�ļ�
	         String value1 = pp.getProperty("ocsproduct");  //��ȡ��ֵ
	         String value2 = pp.getProperty("chenghouwei");
	         System.out.println(value1);
	         System.out.println(value2);
	        } catch (Exception e) {
	         e.printStackTrace();
	        }
	}
	
	public String getWebClassesPath() {
		   String path = getClass().getProtectionDomain().getCodeSource()
		     .getLocation().getPath();
		   return path;
		  
		}
	
	public String getWebInfPath() throws IllegalAccessException{
		   String path = getWebClassesPath();
		   if (path.indexOf("WEB-INF") > 0) {
		    path = path.substring(0, path.indexOf("WEB-INF")+8);
		   } else {
		    throw new IllegalAccessException("·����ȡ����");
		   }
		   return path;
		}


}
