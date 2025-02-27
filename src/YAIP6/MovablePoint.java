package YAIP6;

public class MovablePoint implements Movable {

	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	public void moveUp() {
		this.y = this.y - ySpeed;
	}
	public void moveDown() {
		this.y = this.y + ySpeed;
	}
	public void moveLeft() {
		this.x = this.x - xSpeed;
	}
	public void moveRight() {
		this.x = this.x + xSpeed;
	}
	}
