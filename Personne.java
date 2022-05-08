
public class Personne {
	
	private int id;
	private String Nom;
	
	public Personne(int id , String Nom) {
		this.id=id;
		this.Nom=Nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", Nom=" + Nom + "]";
	}
}
