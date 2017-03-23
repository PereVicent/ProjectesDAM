package examen_perevicent;
import java.text.*;
import java.util.*;
public class Moble {

	DecimalFormat df=new DecimalFormat("#.##");
	static int auto=0;
	private int ident=++auto;
	private String nom;
	private double preu;
	private double[] dimensions=new double[3];
	private String tipusFusta;
	
	//CONSTRUCTORS
	public Moble (String nom,double preu,double llarg,double ample,double alt,String tipusFusta){
		this.nom=nom;
		this.preu=preu;
		dimensions[0]=llarg;
		dimensions[1]=ample;
		dimensions[2]=alt;
		this.tipusFusta=tipusFusta;
	}
	//SETTERS I GETTERS

	public int getIdent() {
		return ident;
	}

	public void setIdent(int ident) {
		this.ident = ident;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public double[] getDimensions() {
		return dimensions;
	}

	public void setDimensions(double[] dimensions) {
		this.dimensions = dimensions;
	}

	public String getTipusFusta() {
		return tipusFusta;
	}

	public void setTipusFusta(String tipusFusta) {
		this.tipusFusta = tipusFusta;
	}
	//TOSTRING
	public String toString(){
		return "\n=====MOBLE==========="+
				"\nIdent:\t"+this.ident+
				"\nNom:\t"+this.nom+
				"\nPreu:\t"+df.format(this.preu)+
				"\nLlarg:\t"+dimensions[0]+
				"\nAmple:\t"+dimensions[1]+
				"\nAlt:\t"+dimensions[2]+
				"\nTipus de fusta:"+this.tipusFusta;
	}
}
