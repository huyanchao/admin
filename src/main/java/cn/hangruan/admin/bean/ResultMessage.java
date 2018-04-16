package cn.hangruan.admin.bean;

public class ResultMessage {

	public static final Integer ERROR = 100;

	public static final Integer SUCCESS = 200;

	private Integer code; // 100异常200成功

	private String msg;

	private Object data;

	public ResultMessage() {
		super();
	}

	public ResultMessage(Integer code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public ResultMessage(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
