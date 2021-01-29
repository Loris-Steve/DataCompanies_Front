package com.datacompanies.beans;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AnnualAccount_old {

//}

//public class AnnualAccount {

	private Integer siren; // i* (identite)
	private String adresse; // i* 
	private String dénomination; // i*
	private Integer chiffreAffaire;
	private Integer resultatExploitation;
	private Integer resultatNet;
	private Integer totalActif;
	private String date_cloture_exercice ; // à voir si on active le filtrage dessus ex:>,...)
	
	private Integer code_type_bilan ; // i* (à voir si on autorise le filtrage)
	private Integer code_activite ; // i*
	private Integer code_confidentialite ; // i*
	private Integer duree_exercice_n ; 
	private Integer anneeClotureExercice;
	private Integer totalPassif;
	private Integer salaires;
	private Integer immobilisation ;
	private Integer actifCirculant;
	private Integer capitauxPropres;
	private Integer capitauxPropres2;
	private Integer capitauxPropres3;
	private Integer dettes;
	private Integer totalChargesExploitation;
	private Integer totalProduitsFinanciers;
	private Integer resultatCouranAvImpot;
	private Integer resultatExceptionnel;
	private Integer totalProduits;
	private Integer totalCharges;
	

	public List<String> getStringAttributsName() throws BeanException
	{
		List<String> stringAttributs = new ArrayList<String>();
		Field[] f = this.getClass().getDeclaredFields();
		//System.out.println("recherche des noms des attributs : "+f.length);
		for(int i = 0 ; i < 8 ; i++)
		{
			if(f[i].getType().getSimpleName().equals("String")) {
				stringAttributs.add(f[i].getName());
			}
			//System.out.println(" simple: "+f[i].getType().getSimpleName());
		}
		return stringAttributs;
	}
	
	public List<String> getAttributsName() throws BeanException
	{
		List<String> Attributs = new ArrayList<String>();
		Field[] f = this.getClass().getDeclaredFields();
		//System.out.println("recherche des noms des attributs : "+f.length);
		for(int i = 0 ; i < f.length ; i++)
		{
			//if(o.equals(f[i].get(this))) //Comparaison de deux variable 
			Attributs.add(f[i].getName());
			//System.out.println(" simple: "+f[i].getType().getSimpleName());
		}
		return Attributs;
	}
  
	
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDate_cloture_exercice() {
		return date_cloture_exercice;
	}

	public void setDate_cloture_exercice(String date_cloture_exercice) {
		this.date_cloture_exercice = date_cloture_exercice;
	}


	
	
	
	public Integer getSalaires() {
		return salaires;
	}



	public void setSalaires(Integer salaires) {
		this.salaires = salaires;
	}



	public Integer getImmobilisation() {
		return immobilisation;
	}



	public void setImmobilisation(Integer immobilisation) {
		this.immobilisation = immobilisation;
	}



	public Integer getActifCirculant() {
		return actifCirculant;
	}



	public void setActifCirculant(Integer actifCirculant) {
		this.actifCirculant = actifCirculant;
	}

	


	public Integer getCode_type_bilan() {
		return code_type_bilan;
	}



	public void setCode_type_bilan(Integer code_type_bilan) {
		this.code_type_bilan = code_type_bilan;
	}



	public Integer getDuree_exercice_n() {
		return duree_exercice_n;
	}



	public void setDuree_exercice_n(Integer duree_exercice_n) {
		this.duree_exercice_n = duree_exercice_n;
	}



	public Integer getCode_activite() {
		return code_activite;
	}



	public void setCode_activite(Integer code_activite) {
		this.code_activite = code_activite;
	}



	public Integer getCode_confidentialite() {
		return code_confidentialite;
	}



	public void setCode_confidentialite(Integer code_confidentialite) {
		this.code_confidentialite = code_confidentialite;
	}



	public Integer getSiren() {
		return siren;
	}
	public void setSiren(Integer siren) {
		this.siren = siren;
	}
	public String getDénomination() {
		return dénomination;
	}
	public void setDénomination(String dénomination) {
		this.dénomination = dénomination;
	}
	public Integer getAnneeClotureExercice() {
		return anneeClotureExercice;
	}
	public void setAnneeClotureExercice(Integer anneeClotureExercice) {
		this.anneeClotureExercice = anneeClotureExercice;
	}
	public Integer getChiffreAffaire() {
		return chiffreAffaire;
	}
	public void setChiffreAffaire(Integer chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	public Integer getResultatExploitation() {
		return resultatExploitation;
	}
	public void setResultatExploitation(Integer resultatExploitation) {
		this.resultatExploitation = resultatExploitation;
	}
	public Integer getResultatNet() {
		return resultatNet;
	}
	public void setResultatNet(Integer resultatNet) {
		this.resultatNet = resultatNet;
	}
	public Integer getTotalActif() {
		return totalActif;
	}
	public void setTotalActif(Integer totalActif) {
		this.totalActif = totalActif;
	}
	public Integer getTotalPassif() {
		return totalPassif;
	}
	public void setTotalPassif(Integer totalPassif) {
		this.totalPassif = totalPassif;
	}
	public Integer getsalaires() {
		return salaires;
	}

	public Integer getimmobilisation() {
		return immobilisation;
	}

	public Integer getactifCirculant() {
		return actifCirculant;
	}

	public Integer getCapitauxPropres() {
		return capitauxPropres;
	}
	public void setCapitauxPropres(Integer capitauxPropres) {
		this.capitauxPropres = capitauxPropres;
	}
	public Integer getCapitauxPropres2() {
		return capitauxPropres2;
	}
	public void setCapitauxPropres2(Integer capitauxPropres2) {
		this.capitauxPropres2 = capitauxPropres2;
	}
	public Integer getCapitauxPropres3() {
		return capitauxPropres3;
	}
	public void setCapitauxPropres3(Integer capitauxPropres3) {
		this.capitauxPropres3 = capitauxPropres3;
	}
	public Integer getDettes() {
		return dettes;
	}
	public void setDettes(Integer dettes) {
		this.dettes = dettes;
	}
	public Integer getTotalChargesExploitation() {
		return totalChargesExploitation;
	}
	public void setTotalChargesExploitation(Integer totalChargesExploitation) {
		this.totalChargesExploitation = totalChargesExploitation;
	}
	public Integer getTotalProduitsFinanciers() {
		return totalProduitsFinanciers;
	}
	public void setTotalProduitsFinanciers(Integer totalProduitsFinanciers) {
		this.totalProduitsFinanciers = totalProduitsFinanciers;
	}
	public Integer getResultatCouranAvImpot() {
		return resultatCouranAvImpot;
	}
	public void setResultatCouranAvImpot(Integer resultatCouranAvImpot) {
		this.resultatCouranAvImpot = resultatCouranAvImpot;
	}
	public Integer getResultatExceptionnel() {
		return resultatExceptionnel;
	}
	public void setResultatExceptionnel(Integer resultatExceptionnel) {
		this.resultatExceptionnel = resultatExceptionnel;
	}
	public Integer getTotalProduits() {
		return totalProduits;
	}
	public void setTotalProduits(Integer totalProduits) {
		this.totalProduits = totalProduits;
	}
	public Integer getTotalCharges() {
		return totalCharges;
	}
	public void setTotalCharges(Integer totalCharges) {
		this.totalCharges = totalCharges;
	}
	
	
}
