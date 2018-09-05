/**
* <p> * Title: *</p>
* <p> * Description: * </p>
* <p> * Copyright: * </p>
* <p> * Company: * </p>
* @author 
* @version 
*/
package anjuke.pojo;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.alibaba.fastjson.annotation.JSONField;
/**
* 创建日期：2018-08-20 05:03:58
* 开发者：
* 修改者：
* 修改时间：
* 程序作用：
* 1、
* 2、
* 修改说明：
* 1、
* 2、
* 版本：@version 
* @author 
*/
@SuppressWarnings("serial")
public class SealDo  implements Serializable {				//t_seal : 房源的概括信息
	
	private String title;   //标题
	private String herf;   //详细内容连接
	private String housetype;   //户型
	private String area;   //面积
	private String blocktype;   //楼层类型
	private String year;   //建造时间
	private String address;   //地址
	private Double totleprice;   //总价
	private String unitprice;   //单价
	private Long detailid;   //详细信息的编号
	@JSONField(name="yyyy-MM-dd HH:mm:ss")
	private Date addtime;   //增加时间

	/**
	* @return the title
	*/
	public String getTitle(){
		return title;
	}

	/**
	* @param title the title to set
	*/
	public void setTitle(String title){
		this.title = StringUtils.trim(title);
	}
	/**
	* @return the herf
	*/
	public String getHerf(){
		return herf;
	}

	/**
	* @param herf the herf to set
	*/
	public void setHerf(String herf){
		this.herf = StringUtils.trim(herf);
	}
	/**
	* @return the housetype
	*/
	public String getHousetype(){
		return housetype;
	}

	/**
	* @param housetype the housetype to set
	*/
	public void setHousetype(String housetype){
		this.housetype = StringUtils.trim(housetype);
	}
	/**
	* @return the area
	*/
	public String getArea(){
		return area;
	}

	/**
	* @param area the area to set
	*/
	public void setArea(String area){
		this.area = StringUtils.trim(area);
	}
	/**
	* @return the blocktype
	*/
	public String getBlocktype(){
		return blocktype;
	}

	/**
	* @param blocktype the blocktype to set
	*/
	public void setBlocktype(String blocktype){
		this.blocktype = StringUtils.trim(blocktype);
	}
	/**
	* @return the year
	*/
	public String getYear(){
		return year;
	}

	/**
	* @param year the year to set
	*/
	public void setYear(String year){
		this.year = StringUtils.trim(year);
	}
	/**
	* @return the address
	*/
	public String getAddress(){
		return address;
	}

	/**
	* @param address the address to set
	*/
	public void setAddress(String address){
		this.address = StringUtils.trim(address);
	}
	/**
	* @return the totleprice
	*/
	public Double getTotleprice(){
		return totleprice;
	}

	/**
	* @param totleprice the totleprice to set
	*/
	public void setTotleprice(Double totleprice){
		this.totleprice = totleprice;
	}
	/**
	* @return the unitprice
	*/
	public String getUnitprice(){
		return unitprice;
	}

	/**
	* @param unitprice the unitprice to set
	*/
	public void setUnitprice(String unitprice){
		this.unitprice = StringUtils.trim(unitprice);
	}
	/**
	* @return the detailid
	*/
	public Long getDetailid(){
		return detailid;
	}

	/**
	* @param detailid the detailid to set
	*/
	public void setDetailid(Long detailid){
		this.detailid = detailid;
	}
	
    /* (non-Javadoc)
    * @see cn.javaworker.yeming.pojo.Entry#hashCode()
    */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	/* (non-Javadoc)
	* @see cn.javaworker.yeming.pojo.Entry#equals(java.lang.Object)
	*/
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
}