package pukka;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import pukka.source.JvmMetrics;
import pukka.source.RegionServer;

public class TestMain {

	public static void main(String[] args) throws Exception {
		parsertoObj();
	}

	public static void parsertoObj() throws Exception {
		String content = httpRequestGet("http://192.168.0.128:84/jmx");
		JSONObject object = JSON.parseObject(content);
		JSONArray arrs = object.getJSONArray("beans");
		for (int i = 0; i < arrs.size(); i++) {
			JSONObject obj = arrs.getJSONObject(i);	
			// System.out.println(obj.get("name"));
			String name = obj.get("name").toString();
			if ("Hadoop:service=HBase,name=JvmMetrics".equals(name)) {
//				System.out.println("reginonserver" + obj.toJSONString());
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
				System.out.println(JSONObject.toJavaObject(obj, JvmMetrics.class).toString() );
			} else if ("Hadoop:service=HBase,name=RegionServer,sub=Server".equals(name)) {
//				JSONObject.toJavaObject(obj, RegionServer.class);
				System.out.println("********************************");
				RegionServer regionServer = JSONObject.toJavaObject(obj, RegionServer.class);
				System.out.println(regionServer.toString());
			}

		}
	}

	/**
	 * datanode
	 * 
	 * @throws Exception
	 */
	public static void jvm_rpc_datenode1() throws Exception {
		String jsonStr = httpRequestGet("http://192.168.0.128:81/jmx?qry=Hadoop:service=NameNode,name=RpcActivityForPort9000");
		String jsonStr1 = httpRequestGet("http://192.168.0.128:82/jmx?qry=Hadoop:service=DataNode,name=JvmMetrics");
		String rpc = getRpcActivity(jsonStr);
		String jvm = getJvmMetrics(jsonStr1);
		// String result = "{ \"beans\":["+rpc+","+jvm+"] }";
	}

	/**
	 * namenode
	 * 
	 * @throws Exception
	 */
	public static void jvm_rpc() throws Exception {
		String jsonStr = httpRequestGet("http://192.168.0.128:81/jmx?qry=Hadoop:service=NameNode,name=RpcActivityForPort9000");
		String jsonStr1 = httpRequestGet("http://192.168.0.128:81/jmx?qry=Hadoop:service=NameNode,name=JvmMetrics");
		String rpc = getRpcActivity(jsonStr);
		String jvm = getJvmMetrics(jsonStr1);
		// String result = "{ \"beans\":["+rpc+","+jvm+"] }";
		// System.out.println(result);
	}

	/**
	 * http get 请求
	 * 
	 * @param urlStr
	 *            请求URL地址
	 * @throws Exception
	 */
	private static String httpRequestGet(String urlStr) throws Exception {
		BufferedReader reader = null;
		HttpURLConnection httpConn = null;
		StringBuilder content = new StringBuilder();
		try {
			// URL拼接,如："http://www.baidu.com?name=HI,中国",这里对特殊字符进行了编码，不然会产生乱码
			URL url = new URL(urlStr);

			// openConnection函数会根据URL的协议返回不同的URLConnection子类的对象
			// 这里URL是一个http,因此实际返回的是HttpURLConnection
			httpConn = (HttpURLConnection) url.openConnection();

			// 进行连接,实际上request要在下一句的connection.getInputStream()函数中才会真正发到
			// 服务器****待验证
			httpConn.connect();

			// 取得输入流，并使用Reader读取
			reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));

			String lines = "";

			while ((lines = reader.readLine()) != null) {
				content.append(lines);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			reader.close();
			httpConn.disconnect();
		}
		return content.toString();
	}

	/**
	 * qry=java.lang:type=Memory 获取内存的数据
	 * 
	 * @param json
	 *            { "HeapMemoryUsage": { "init": 260046848, "committed":
	 *            260046848, "max": 932184064, "used": 48904784 },
	 *            "NonHeapMemoryUsage": { "init": 2555904, "committed":
	 *            48758784, "max": -1, "used": 47911944 } }
	 */
	public static void getHeapMemoryJson(String json) {
		JSONObject jsonObject = JSONObject.parseObject(json);

		JSONArray beans = jsonObject.getJSONArray("beans");
		for (int i = 0; i < beans.size(); i++) {
			JSONObject object = beans.getJSONObject(i);
			object.remove("name");
			object.remove("modelerType");
			object.remove("ObjectPendingFinalizationCount");
			object.remove("Verbose");
			object.remove("ObjectName");
			System.out.println(object.toJSONString());
		}
	}

	/**
	 * Hadoop:service=NameNode,name=JvmMetrics
	 * 
	 * @param jvmMetrics
	 *            { "MemMaxM": 889.0, "ThreadsTerminated": 0, "ThreadsWaiting":
	 *            4, "MemNonHeapCommittedM": 51.6875, "MemNonHeapUsedM":
	 *            50.74209, "MemNonHeapMaxM": -9.536743E-7,
	 *            "GcTotalExtraSleepTime": 40, "GcCount": 8, "ThreadsBlocked":
	 *            0, "LogWarn": 13, "MemHeapCommittedM": 319.0,
	 *            "ThreadsRunnable": 6, "GcNumWarnThresholdExceeded": 0,
	 *            "LogInfo": 412, "ThreadsNew": 0, "MemHeapUsedM": 47.003838,
	 *            "ThreadsTimedWaiting": 24, "MemHeapMaxM": 889.0, "LogError":
	 *            0, "LogFatal": 0, "GcTimeMillis": 255,
	 *            "GcNumInfoThresholdExceeded": 0 }
	 * 
	 */
	public static String getJvmMetrics(String jvmMetrics) {
		JSONObject jsonObject = JSONObject.parseObject(jvmMetrics);
		JSONArray beans = jsonObject.getJSONArray("beans");
		JSONObject object = beans.getJSONObject(0);

		object.remove("name");
		object.remove("modelerType");
		object.remove("tag.Context");
		object.remove("tag.ProcessName");
		object.remove("tag.Hostname");

		JvmMetrics jvmMetrics2 = JSONObject.toJavaObject(object, JvmMetrics.class);
		System.out.println(object);
		return object.toJSONString();
	}

	/**
	 * Hadoop:service=NameNode,name=RpcActivityForPort9000
	 * 
	 * @param rpcActivity
	 * 
	 *            { "ReceivedBytes": 663199, "RpcQueueTimeAvgTime":
	 *            0.2795031055900621, "RpcSlowCalls": 0,
	 *            "RpcAuthorizationSuccesses": 158, "NumDroppedConnections": 0,
	 *            "RpcClientBackoff": 0, "RpcProcessingTimeAvgTime":
	 *            0.2484472049689441, "RpcAuthorizationFailures": 0,
	 *            "NumOpenConnections": 4, "SentBytes": 256031,
	 *            "RpcProcessingTimeNumOps": 2000, "RpcAuthenticationSuccesses":
	 *            0, "CallQueueLength": 0, "RpcAuthenticationFailures": 0,
	 *            "RpcQueueTimeNumOps": 2000 }
	 */
	public static String getRpcActivity(String rpcActivity) {
		JSONObject jsonObject = JSONObject.parseObject(rpcActivity);
		JSONArray beans = jsonObject.getJSONArray("beans");
		JSONObject object = beans.getJSONObject(0);

		object.remove("name");
		object.remove("modelerType");
		object.remove("tag.port");
		object.remove("tag.Context");
		object.remove("tag.NumOpenConnectionsPerUser");
		object.remove("tag.Hostname");
		System.out.println(object);

		return object.toJSONString();
	}

	public static String getDfsJson(String json) {
		JSONObject jsonObject = JSONObject.parseObject(json);
		JSONArray beans = jsonObject.getJSONArray("beans");
		JSONObject object = beans.getJSONObject(0);

		return object.toJSONString();
	}

}
