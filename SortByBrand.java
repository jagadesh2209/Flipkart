package Project2;

import java.util.Comparator;

public class SortByBrand implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Mobile m1=(Mobile) o1;
		Mobile m2=(Mobile) o2;
		return m1.name.compareTo(m2.name);
	}

	
	

}
