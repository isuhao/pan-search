package com.kite.search.common.exceptions;

/**
 * ��װ�쳣��
 * @author hasee
 *
 */
public class PanException extends RuntimeException {
	
	private String code;
	
	private String message;

	/**
	 * 
	 */
	private static final long serialVersionUID = 4628036246062969511L;

	public PanException(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
}
