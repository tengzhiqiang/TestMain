/**
* <p> * Title: *</p>
* <p> * Description: * </p>
* <p> * Copyright: * </p>
* <p> * Company: * </p>
* @author 
* @version 
*/
package education.resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
/**
* 创建日期：2018-08-15 11:03:52
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
public class EximinationDo   {				//考试信息
	
	private Long exam_id;   //考试编号1|1|1
	private String exam_name;   //考试名称1|1|1
	private Integer classlevel;   //级别1|1|1
	private String enroll_time;   //考试时间1|1|1
	private long schoolid;   //学校id


	/**
	* @return the exam_id
	*/
	public Long getExam_id(){
		return exam_id;
	}

	/**
	* @param exam_id the exam_id to set
	*/
	public void setExam_id(Long exam_id){
		this.exam_id = exam_id;
	}
	/**
	* @return the exam_name
	*/
	public String getExam_name(){
		return exam_name;
	}

	/**
	* @param exam_name the exam_name to set
	*/
	public void setExam_name(String exam_name){
		this.exam_name = StringUtils.trim(exam_name);
	}
	/**
	* @return the classlevel
	*/
	public Integer getClasslevel(){
		return classlevel;
	}

	/**
	* @param classlevel the classlevel to set
	*/
	public void setClasslevel(Integer classlevel){
		this.classlevel = classlevel;
	}
	/**
	* @return the enroll_time
	*/
	public String getEnroll_time(){
		return enroll_time;
	}

	/**
	* @param enroll_time the enroll_time to set
	*/
	public void setEnroll_time(String enroll_time){
		this.enroll_time = StringUtils.trim(enroll_time);
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

	public long getSchoolid() {
		return schoolid;
	}

	public void setSchoolid(long schoolid) {
		this.schoolid = schoolid;
	}

}