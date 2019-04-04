package project.UserPackage;

public class User {

	private String pseudo ;
	private String mdp ;
	private String status ;
	//"uti", "edi", "admin"
	
	public User(String pseudo, String mdp, String status) {
		
		this.pseudo = pseudo;
		this.mdp = mdp;
		this.status = status;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
