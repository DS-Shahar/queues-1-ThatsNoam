
public class Ball {
	private String color;
	private boolean isBig;
	public Ball(String color, boolean isBig) {
		this.color = color;
		this.isBig = isBig;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isBig() {
		return isBig;
	}
	public void setBig(boolean isBig) {
		this.isBig = isBig;
	}
	@Override
	public String toString() {
		if (isBig) {
			char ch = color.charAt(0);
			ch = (char) (ch - ('a' - 'A'));
			return "" + ch;
		}
		return "" + color.charAt(0);
	}
}
