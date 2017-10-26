package com.cnwisdom.Prometheus.utils;

import java.security.MessageDigest;

import com.cnwisdom.Prometheus.exception.CustomException;
import com.cnwisdom.Prometheus.exception.ErrorCode;



public class MD5Util {

	private static final char[] HEX_CHARS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
			'f' };

	/**
	 * MD5加密
	 * 
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static String getMD5(String str) throws Exception {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			char[] hexDigest = encodeHex(md.digest());
			return new String(hexDigest);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(ErrorCode.MD5_ENCRYPTION_ERROR, "MD5加密出现错误");
		}
	}

	/**
	 * SAH1加密
	 * 
	 * @param str
	 * @return
	 */
	public static String getSAH1(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA1");
			md.update(str.getBytes());
			char[] hexDigest = encodeHex(md.digest());
			return new String(hexDigest);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(ErrorCode.MD5_ENCRYPTION_ERROR, "MD5加密出现错误");
		}
	}

	/**
	 * byte转化为hashcode
	 * 
	 * @param bytes
	 * @return
	 */
	private static char[] encodeHex(byte[] bytes) {
		char chars[] = new char[32];
		for (int i = 0; i < chars.length; i = i + 2) {
			byte b = bytes[i / 2];
			chars[i] = HEX_CHARS[(b >>> 0x4) & 0xf];
			chars[i + 1] = HEX_CHARS[b & 0xf];
		}
		return chars;
	}
}