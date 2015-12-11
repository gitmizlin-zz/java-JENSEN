import java.util.ArrayList;

public class Package extends Gift {
	int value;
	ArrayList<Gift> gifts = new ArrayList<>();

	public Package(String name, int value) {
		super(name);
		this.value = value;
	}

	public void add(Gift gift) {
		gifts.add(gift);
	}

	@Override
	public int getValue() {
		int sum = value;
		for(Gift g : gifts) {
			sum += g.getValue();
		}
		return sum;
	}

	public void getAllItems() {
		for (Gift g : gifts) {
			if (g.getClass() == Gift.class || g.getClass() == Thing.class) {
				System.out.println(g);

			} else if (g.getClass() == Package.class) {
				Package innerPackage = (Package) g;
				innerPackage.getAllItems();
			}
		}
	}
	
	// @Override
	// public Iterator interator() {
	// 	Iterator it = new Iterator() {
	// 		@Override
	// 		public boolean hasNext() {
	// 			return true;
	// 		}

	// 		@Override
	// 		public Object next() {
	// 			return gifts[0];
	// 		}
	// 	}
	// }
}