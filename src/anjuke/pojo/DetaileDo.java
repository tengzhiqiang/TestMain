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
public class DetaileDo  implements Serializable {				//房源的详细信息
	
	private Long houseid;   //房屋编码
	@JSONField(name="yyyy-MM-dd HH:mm:ss")
	private Date publictime;   //发布时间
	private String name;   //小区名称
	private String housetype;   //房屋类型，例如普通住宅
	private String dealtime;   //交易时间，满两年
	private String orientation;   //房屋朝向，南北
	private Short justone;   //是否唯一，0否，1是
	private String decoration;   //装修程度
	private String img;   //户型图片
	@JSONField(name="yyyy-MM-dd HH:mm:ss")
	private Date addtime;   //增加时间


	/**
	* @return the houseid
	*/
	public Long getHouseid(){
		return houseid;
	}

	/**
	* @param houseid the houseid to set
	*/
	public void setHouseid(Long houseid){
		this.houseid = houseid;
	}
	/**
	* @return the publictime
	*/
	public Date getPublictime(){
		return publictime;
	}

	/**
	* @param publictime the publictime to set
	*/
	public void setPublictime(Date publictime){
		this.publictime = publictime;
	}
	/**
	* @return the name
	*/
	public String getName(){
		return name;
	}

	/**
	* @param name the name to set
	*/
	public void setName(String name){
		this.name = StringUtils.trim(name);
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
	* @return the dealtime
	*/
	public String getDealtime(){
		return dealtime;
	}

	/**
	* @param dealtime the dealtime to set
	*/
	public void setDealtime(String dealtime){
		this.dealtime = StringUtils.trim(dealtime);
	}
	/**
	* @return the orientation
	*/
	public String getOrientation(){
		return orientation;
	}

	/**
	* @param orientation the orientation to set
	*/
	public void setOrientation(String orientation){
		this.orientation = StringUtils.trim(orientation);
	}
	/**
	* @return the justone
	*/
	public Short getJustone(){
		return justone;
	}

	/**
	* @param justone the justone to set
	*/
	public void setJustone(Short justone){
		this.justone = justone;
	}
	/**
	* @return the decoration
	*/
	public String getDecoration(){
		return decoration;
	}

	/**
	* @param decoration the decoration to set
	*/
	public void setDecoration(String decoration){
		this.decoration = StringUtils.trim(decoration);
	}
	/**
	* @return the img
	*/
	public String getImg(){
		return img;
	}

	/**
	* @param img the img to set
	*/
	public void setImg(String img){
		this.img = StringUtils.trim(img);
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