import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Company {
	
	private String name;
	private Map<Integer, Personne> listeOfMpl;
	
	public Company(String name) {
		this.name = name;
		this.listeOfMpl = new HashMap<Integer,Personne>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, Personne> getListeOfMpl() {
		return listeOfMpl;
	}
	public void addEmployee(Integer a,Personne p ) {
		
		listeOfMpl.put(a, p);
		
	}
	public void setListeOfMpl(Map<Integer, Personne> listeOfMpl) {
		this.listeOfMpl = listeOfMpl;
	}
	
	public TreeMap<Integer,Personne> trieEmploiyeeById() {
		TreeMap<Integer, Personne> listeTrie = new TreeMap<Integer,Personne>(listeOfMpl);
		return listeTrie;
	}
	public  void trier() {
		Set<Entry<Integer,Personne>> set =listeOfMpl.entrySet(); 
		List<Entry<Integer,Personne>> List = new ArrayList<Entry<Integer,Personne>>(set);
		Collections.sort(List, new Comparator<Map.Entry<Integer,Personne>>() {

			@Override
			public int compare(Entry<Integer, Personne> o1, Entry<Integer, Personne> o2) {
				
				if( (o1.getValue().getId())<o2.getValue().getId()) {;
				return -1;
				}else {
					return 1;
				}
			}
		});
		
		for(Map.Entry<Integer, Personne>  entry : List) {
			System.out.println(entry.getKey()+"==="+entry.getValue());
		}
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", listeOfMpl=" + listeOfMpl + "]";
	}
}
