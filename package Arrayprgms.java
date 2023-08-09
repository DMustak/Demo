package Arrayprgms;

class circle {
	int radius;

	circle(int r) {
		radius = r;
	}
	
	public String toString() {
		return "radius=" + radius;
	}
}

public class Demo9 {

	public static void main(String[] args) {
		circle[] a = new circle[4];
		a[0] = new circle(50);
		a[1] = new circle(30);
		a[2] = new circle(20);
		a[3] = new circle(60);
		for (circle c : a) {
			System.out.println(c);
		}

	}

}
