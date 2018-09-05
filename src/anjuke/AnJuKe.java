package anjuke;

import anjuke.util.AnjukeUtil;

public class AnJuKe {

	
	public static void main(String[] args) {
		String result = AnjukeUtil.sendGet("www.baidu.com");
		System.out.println(result);
	}
}
