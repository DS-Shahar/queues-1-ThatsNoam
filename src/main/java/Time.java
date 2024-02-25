
public class Time {
	private int hour;
	private int minute;
	private int second;
    public Time(int hours, int minutes, int seconds) {
        this.hour = hours;
        this.minute = minutes;
        this.second = seconds;
    }
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
	

}
