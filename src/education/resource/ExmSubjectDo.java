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
* 创建日期：2018-08-15 02:46:17
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
public class ExmSubjectDo   {				//考试科目表
	
	private Long exam_id;   //考试编号1|1|1
	private Long subjectid;   //科目编号|2|3|0
	private String exam_name;   //考试名称1|1|1
	private String subject_name;   //科目名称|1|1


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
	* @return the subjectid
	*/
	public Long getSubjectid(){
		return subjectid;
	}

	/**
	* @param subjectid the subjectid to set
	*/
	public void setSubjectid(Long subjectid){
		this.subjectid = subjectid;
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
	* @return the subject_name
	*/
	public String getSubject_name(){
		return subject_name;
	}

	/**
	* @param subject_name the subject_name to set
	*/
	public void setSubject_name(String subject_name){
		this.subject_name = StringUtils.trim(subject_name);
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
}