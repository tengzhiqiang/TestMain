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
public class ExmStructureDo   {				//试题结构
	
	private Long seq_num;   //题组序号1|1|1
	private String name;   //名称|1|1|1
	private Integer total_score;   //题组总分数1|1|1
	private String item_type;   //分数标记1|1|1
	private String onpage;   //所在页码1|1|1
	private String answer;   //小题数组 期中 i: 小题标号, s:小题分数，取数组第一个值, a: 如果是选择题，则是选择题答案1|1|1
	
	private Long exam_id;   //考试序号1|1|1
	private Long subjectid;   //考试序号1|1|1


	/**
	* @return the seq_num
	*/
	public Long getSeq_num(){
		return seq_num;
	}

	/**
	* @param seq_num the seq_num to set
	*/
	public void setSeq_num(Long seq_num){
		this.seq_num = seq_num;
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
	* @return the total_score
	*/
	public Integer getTotal_score(){
		return total_score;
	}

	/**
	* @param total_score the total_score to set
	*/
	public void setTotal_score(Integer total_score){
		this.total_score = total_score;
	}
	/**
	* @return the item_type
	*/
	public String getItem_type(){
		return item_type;
	}

	/**
	* @param item_type the item_type to set
	*/
	public void setItem_type(String item_type){
		this.item_type = StringUtils.trim(item_type);
	}
	/**
	* @return the answer
	*/
	public String getAnswer(){
		return answer;
	}

	/**
	* @param answer the answer to set
	*/
	public void setAnswer(String answer){
		this.answer = StringUtils.trim(answer);
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

	public Long getExam_id() {
		return exam_id;
	}

	public void setExam_id(Long exam_id) {
		this.exam_id = exam_id;
	}

	public Long getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Long subjectid) {
		this.subjectid = subjectid;
	}

	public String getOnpage() {
		return onpage;
	}

	public void setOnpage(String onpage) {
		this.onpage = onpage;
	}

}