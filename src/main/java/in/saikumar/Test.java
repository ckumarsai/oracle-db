package in.saikumar;

import in.saikumar.security.PwdUtils;

public class Test {
	public static void main(String[] args) {
		PwdUtils pwd=new PwdUtils();
		String encodePwd = pwd.encodePwd("sai@123");
		System.out.println(encodePwd);
	}

}
