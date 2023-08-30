package Project2;

public class Mobile implements Comparable{

	String name;
	double price;
	int ram;
	
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", ram=" + ram + "]";
	}

	public Mobile(String name, double price, int ram) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
	}

	@Override
	public int compareTo(Object o) {
		
		return (int) (this.price-((Mobile)o).price);
	}
}
