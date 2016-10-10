public abstract class Component {
	
	protected String name;
	protected int weight;
	
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract String getName(); 
	public abstract int getWeight();
	public abstract String getAll();
	
}
