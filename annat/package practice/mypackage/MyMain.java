import mypackage.MyAp;
import mypackage.sub.SubAp;

public class MyMain {
	public static void main(String[] args) {
		MyAp ap = new MyAp();
		SubAp subap = new SubAp();
		ap.print();
		subap.print();
	}
}