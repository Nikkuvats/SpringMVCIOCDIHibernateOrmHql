package beans;

public class Movies {
	
	private int mid; 
	private String moviesname;
	private Actor actor;
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMoviesname() {
		return moviesname;
	}
	public void setMoviesname(String moviesname) {
		this.moviesname = moviesname;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}	
}