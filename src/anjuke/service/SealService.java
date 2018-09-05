package anjuke.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;

import anjuke.dataBase.connect.ConnectMySQL;
import anjuke.pojo.SealDo;

public class SealService {
	
	
	public Connection getDataSource() {
		Connection cnn = null;
		while(cnn == null) {
			try {
				Thread.sleep(300);
				cnn = ConnectMySQL.getCnn();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cnn;
	}
	
	
	
	public boolean save(SealDo sealDo) {
		Connection cnn = getDataSource();
		StringBuilder fileds = new StringBuilder();
		StringBuilder values = new StringBuilder();
		
		if (StringUtils.isNoneBlank(sealDo.getTitle())) {
			fileds.append(" title ");
			values.append(sealDo.getTitle());
		}
		if (StringUtils.isNoneBlank(sealDo.getHerf())) {
			fileds.append(",herf");
			values.append(","+sealDo.getHerf());
		}
		if (StringUtils.isNoneBlank(sealDo.getHousetype())) {
			fileds.append(",housetype");
			values.append(","+sealDo.getHousetype());
		}
		if (StringUtils.isNoneBlank(sealDo.getArea())) {
			fileds.append(",area");
			values.append(","+sealDo.getArea());
		}
		if (StringUtils.isNoneBlank(sealDo.getBlocktype())) {
			fileds.append(",blocktype");
			values.append(","+sealDo.getBlocktype());
		}
		if (StringUtils.isNoneBlank(sealDo.getYear())) {
			fileds.append(",year");
			values.append(","+sealDo.getYear());
		}
		if (StringUtils.isNoneBlank(sealDo.getAddress())) {
			fileds.append(",address");
			values.append(","+sealDo.getAddress());
		}
		if (sealDo.getTotleprice()> 0) {
			fileds.append(",totleprice");
			values.append(","+sealDo.getTotleprice());
		}
		if (StringUtils.isNoneBlank(sealDo.getUnitprice())) {
			fileds.append(",unitprice");
			values.append(","+sealDo.getUnitprice());
		}
		if (sealDo.getDetailid() >0) {
			fileds.append(",detailid");
			values.append(","+sealDo.getDetailid());
		}
		
		
		String sql = "INSERT INTO t_seal ("+fileds.toString()+") VALUES ("+values.toString()+")";
		
		try {
			cnn.prepareStatement(sql);
			cnn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				cnn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return true;
	}

}
