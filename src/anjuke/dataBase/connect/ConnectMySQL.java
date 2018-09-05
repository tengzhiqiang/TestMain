package anjuke.dataBase.connect;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

/**
 * ConnectMySQL
 *   初始化数据连接
 * @author 滕米
 * @date 2018年8月20日
 */
public class ConnectMySQL {

	public static DataSource dataSource = null;
	
	public static DataSource getDataSource() {
		Properties properties = new Properties();
		try {
			String path = System.getProperty("user.dir");
			System.out.println(path);
			properties.load(new FileInputStream(path+"\\src\\anjuke\\dataBase\\connect\\druid.properties"));
			if (dataSource == null) {
				dataSource = DruidDataSourceFactory.createDataSource(properties);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataSource;
	}
	
	public static Connection getCnn() {
		Connection cnn = null;
		try {
			cnn = getDataSource().getConnection();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return cnn;
	}
	

}
