package project.GroupPackage;

import java.util.Date;

public class Group {

	private String nomG ;
	private String nomP ;
	private Date dateCreation ;
	
	public Group(String nomG, String nomP, Date dateCreation) {
		this.nomG = nomG;
		this.nomP = nomP;
		this.dateCreation = dateCreation;
	}

	public String getNomG() {
		return nomG;
	}

	public void setNomG(String nomG) {
		this.nomG = nomG;
	}

	public String getNomP() {
		return nomP;
	}

	public void setNomP(String nomP) {
		this.nomP = nomP;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
