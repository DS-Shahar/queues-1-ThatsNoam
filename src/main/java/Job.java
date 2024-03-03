
public class Job {
	private int seconds;
	private String code;
	public Job(int seconds, String code){
		this.seconds = seconds;
		this.code = code;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
