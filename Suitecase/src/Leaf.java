public class Leaf extends Component {

	public Leaf(String name, int weight) {
		
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getAll() {
		return name + " / " + weight;
	}
	
	public void add(Component component) {
		
	}
	
	public void remove(Component component) {
		
	}
}
