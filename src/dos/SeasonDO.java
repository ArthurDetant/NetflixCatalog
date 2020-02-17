package dos;

public class SeasonDO {
	private int id;
	private int fk_serie;
	private int num_saison;
	private int nb_episodes;
	
	public SeasonDO(int id, int fk_serie, int num_saison, int nb_episodes) {
		this.id= id;
		this.fk_serie= fk_serie;
		this.num_saison= num_saison;
		this.nb_episodes= nb_episodes;
	}	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFk_serie() {
		return fk_serie;
	}
	public void setFk_serie(int fk_serie) {
		this.fk_serie = fk_serie;
	}
	public int getNum_saison() {
		return num_saison;
	}
	public void setNum_saison(int num_saison) {
		this.num_saison = num_saison;
	}
	public int getNb_episodes() {
		return nb_episodes;
	}
	public void setNb_episodes(int nb_episodes) {
		this.nb_episodes = nb_episodes;
	}

	
	
}
