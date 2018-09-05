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

import com.alibaba.fastjson.annotation.JSONField;
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
public class DetailedScoreDo {				//试题分数
	
	@JSONField(name="exam_student_num")
	private String studentno;   //学号|1|1|1
	private Integer total_score;   //题组总分数1|1|1
	private Long seq_num;   //题组序号1|1|1
	private String score;   //得分1|1|1

	private Long exam_id;   //考试序号1|1|1
	private Long subjectid;   //科目序号1|1|1
	

	/**
	* @return the studentno
	*/
	public String getStudentno(){
		return studentno;
	}

	/**
	* @param studentno the studentno to set
	*/
	public void setStudentno(String studentno){
		this.studentno = StringUtils.trim(studentno);
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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
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
	
}