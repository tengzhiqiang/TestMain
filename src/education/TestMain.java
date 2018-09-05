package education;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import education.resource.DetailedScoreDo;
import education.resource.EximinationDo;
import education.resource.ExmStructureDo;
import education.resource.ExmSubjectDo;

public class TestMain {
	
	public static void main(String[] args) throws Exception {
		String clbum = "高中1班";
		String str = "高中";
		System.out.println(clbum.substring(clbum.indexOf(str)+str.length()));
//		getLastEximanation();
	}
	
	//1.	读取最近5个考试
	public static void getLastEximanation() throws Exception {
		String url = "http://www.xyketang.com/api/exam/getExamlistOfSchool";
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("school_id", 58);
//		jsonObject.put("school_key", "xyd930ea5d5a258f4sdsd");
//		jsonObject.put("page_num", 1);
//		JSONObject tem = doPost(url, jsonObject);
		Map<String, Object> map = new HashMap<>();
		map.put("school_id", 58);
		map.put("school_key", "xyd930ea5d5a258f4sdsd");
		map.put("page_num", "1");
		httpRequestPost(url, map);
	}
	
	//2.	读取某个考试包含的科目
	public static void getSubject() throws Exception {
		String url = "http://www.xyketang.com/api/exam/getExamSubject";
		Map<String, Object> map = new HashMap<>();
		map.put("exam_id", 2698);
		httpRequestPost(url, map);
	}
	//3.	读取某个考试科目的试题结构，每题分数，题型，序号，名称等
	public static void getEximanationDetail() throws Exception {
		String url = "http://www.xyketang.com/api/exam/getExamSubjectSchema";
		Map<String, Object> map = new HashMap<>();
		map.put("exam_id", 2698);
		map.put("subject_id", 1);
		httpRequestPost(url, map);
	}
	
	//4.	读取某个考试科目的详细考分
	public static void getEximanationSubjectDetail() throws Exception {
		String url = "http://www.xyketang.com/api/report/getDetailedScore";
		Map<String, Object> map = new HashMap<>();
		map.put("exam_id", 2698);
		map.put("subject_id", 1);
		List<Integer> list = new ArrayList<>();
		list.add(130024);
		list.add(130096);
		String[] strs = new String[list.size()];
		for(int i=0;i<list.size();i++) {
			strs[i] = list.get(i)+"";
		}
		
		map.put("kaohaos", Arrays.toString(strs));//考试编号
//		map.put("kaohaos", "[130024,130096]");//考试编号
		httpRequestPost(url, map);
	}
	//5.	读取某次考试成绩：
	public static void getEximanationScore() throws Exception {
		String url = "http://www.xyketang.com/api/exam/getExamScore";
		Map<String, Object> map = new HashMap<>();
		map.put("exam_id", 2698);
		map.put("subject_id", 1);
		httpRequestPost(url, map);
	}
	
	
	private static void httpRequestPost(String urlStr,Map<String, Object> map) throws Exception {
		URL url = new URL(urlStr);

		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();

		// 设置是否向connection输出，因为是post请求，参数要放在 http正文内，因此需要设为true
		httpConn.setDoOutput(true);

		// 是否向connection输入，默认为true
		httpConn.setDoInput(true);

		// POST请求方式
		httpConn.setRequestMethod("POST");

		// post请求不能使用缓存
		httpConn.setUseCaches(false);

		// 是否自动执行重定向,默认为true
		httpConn.setInstanceFollowRedirects(true);

		// 配置本次连接的Content-type，配置为application/x-www-form-urlencoded的意思是正文是urlencoded编码过的form参数
		// 下面我们可以看到我们对正文内容使用URLEncoder.encode 进行编码
		httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

		// 连接，从openConnection()至此的配置必须要在connect之前完成，
		// 注意的是connection.getOutputStream会隐含的进行connect。
		httpConn.connect();

		DataOutputStream dos = new DataOutputStream(httpConn.getOutputStream());

		// 发送正文，正文内容其实跟get的URL中'?'后的参数字符串一致 word=wait&tn=news&from=news
		String content = "";//"filePath=" + URLEncoder.encode("设计资料/设计", "utf-8")
		for (Map.Entry<String, Object> entry:map.entrySet()) {
			if (content.length() <1) {
				content += entry.getKey()+"="+entry.getValue();
			}else {
				content +="&"+ entry.getKey()+"="+entry.getValue();
			}
		}

		// DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写道流里面
		dos.writeBytes(content);

		// 刷新流
		dos.flush();

		// 关闭流
		dos.close();

		// 取得输入流，并使用Reader读取
		BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));

		System.out.println("=========post request接收数据内容开始============");
		String lines;
		String contents ="";
		while ((lines = reader.readLine()) != null) {
			contents += lines;
		}
		
		reader.close();
		System.out.println(contents);
		System.out.println("=========post request接收数据内容结束============");
		httpConn.disconnect();
//		parseToDetailStructur(contents);
//		parseToExm_subject(contents,map);
//		parseToEximination(contents,map);
//		parseToExmStuct(contents,map);
//		parseToDetailStructur(contents,map);
	}
	
	
	 /**
	   * post请求
	   * @param url
	   * @param json
	   * @return
	   */
	  public static JSONObject doPost(String url,JSONObject json){
	    DefaultHttpClient client = new DefaultHttpClient();
	    HttpPost post = new HttpPost(url);
	    JSONObject response = null;
	    try {
	      StringEntity s = new StringEntity(json.toString());
	      s.setContentEncoding("UTF-8");
	      s.setContentType("application/json");//发送json数据需要设置contentType
	      post.setEntity(s);
	      HttpResponse res = client.execute(post);
	      if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
	        HttpEntity entity = res.getEntity();
	        String result = EntityUtils.toString(res.getEntity());// 返回json格式：
	        response = JSONObject.parseObject(result);
	      }
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }
	    return response;
	  }
	
	  @SuppressWarnings("deprecation")
	public void httpGet(String url) {
		HttpClient client = new DefaultHttpClient();
		
		
	}

	  /**
	   * 11111
	   * @param jsonstr
	   * @param map
	   */
	  public static void parseToEximination(String jsonstr,Map<String, Object> map) {
		  JSONObject obj = JSONObject.parseObject(jsonstr);
		  JSONArray array = obj.getJSONArray("data");
		  List<EximinationDo> scoreDos = new ArrayList<>();
		  EximinationDo eximination = null;
		  
		  for (int i=0;i<array.size();i++) {
			  JSONObject object = array.getJSONObject(i);
			  eximination = JSON.toJavaObject(object, EximinationDo.class);
			  eximination.setSchoolid(Long.valueOf(map.get("school_id").toString()));
			  scoreDos.add(eximination);
		  }
		  System.out.println(scoreDos);
	  }
	  
	  /**
	   * 22222
	   * @param jsonstr
	   * @param map
	   */
	  public static void parseToExm_subject(String jsonstr,Map<String, Object> map) {
		  JSONObject obj = JSONObject.parseObject(jsonstr);
		  JSONObject data = JSONObject.parseObject(obj.getString("data"));
		  JSONArray array = data.getJSONArray("data");
		  List<ExmSubjectDo> scoreDos = new ArrayList<>();
		  ExmSubjectDo eximination = null;
		  
		  for (int i=0;i<array.size();i++) {
			  JSONObject object = array.getJSONObject(i);
			  eximination = JSON.toJavaObject(object, ExmSubjectDo.class);
			  scoreDos.add(eximination);
		  }
		  System.out.println(scoreDos);
	  }
	  /**
	   * 3333333
	   * @param jsonstr
	   * @param map
	   */
	  public static void parseToExmStuct(String jsonstr,Map<String, Object> map) {
		  JSONObject obj = JSONObject.parseObject(jsonstr);
		  JSONArray array = obj.getJSONArray("data");
		  List<ExmStructureDo> scoreDos = new ArrayList<>();
		  ExmStructureDo eximination = null;
		  
		  for (int i=0;i<array.size();i++) {
			  JSONObject object = array.getJSONObject(i);
			  eximination = JSON.toJavaObject(object, ExmStructureDo.class);
			  eximination.setExam_id(Long.valueOf(map.get("exam_id").toString()));
			  eximination.setSubjectid(Long.valueOf(map.get("subject_id").toString()));
			  scoreDos.add(eximination);
		  }
		  System.out.println(scoreDos);
	  }
	  
	  /**
	   * 444444
	   * @param jsonstr
	   * @param map
	   */
	  public static void parseToDetailStructur(String jsonstr,Map<String, Object> map) {
		JSONObject obj = JSONObject.parseObject(jsonstr);
		JSONArray array = obj.getJSONArray("data");
		List<DetailedScoreDo> scoreDos = new ArrayList<>();
		DetailedScoreDo score = null;
		
		for (int i=0;i<array.size();i++) {
			JSONObject object = array.getJSONObject(i);
			score = JSON.toJavaObject(object, DetailedScoreDo.class);
			score.setExam_id(Long.valueOf(map.get("exam_id").toString()));
			score.setSubjectid(Long.valueOf(map.get("subject_id").toString()));
			scoreDos.add(score);
		}
		System.out.println(scoreDos);
	}
	  
	  
	

}
