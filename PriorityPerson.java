package day22_collection;
import java.util.*;
//all collection uses comparable or comparator interface to sort data 
 
class PersonComparator implements Comparator <Person>
{

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.id> o2.id)
		{
			return 1;
		}
		else if(o1.id< o2.id)
		{
			return -1;
		}
		return 0;
	}
	
}
public class PriorityPerson {

	public static void main(String[] args) {
		PriorityQueue <Person> p= new PriorityQueue<Person>(new PersonComparator());
		p.add(new Person(12,"ajay"));
		p.add(new Person(22,"nisha"));
		p.add(new Person(13,"om"));
		p.add(new Person(54,"rajan"));
		p.add(new Person(15,"kamal"));
		System.out.println(p.remove());
		System.out.println(p.remove());
	}

}
