package com.datacompanies.beans ;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryAccount {


	private String siren = "siren";// i* (identite)

	
	private String adresse = "adresse"; // i* 
	
	private String denomination = "denomination"; // i*
	
	private String chiffres_d_affaires_nets = "FJ.0";

	private String resultat_d_exploitation_i_ii = "GG.0";
	
	private String  benefice_ou_perte = "HN.0"; // resultatNet | benefice_ou_perte_total_des_produits_total_des_charges

	private String total_actif  = "CO.0"; // total_general_0_a_v
	
	private String date_cloture_exercice = "date_cloture_exercice"; // Ã  voir si on active le filtrage dessus ex:>,...)



	
	 private String actif = "AAAAAA";

	 private String capital_souscrit_non_appele = "AA";

	 private String frais_d_etablissement = "AB";

	 private String frais_de_developpement_ou_de_recherche_et_developpement = "CX";

	 private String concessions_brevets_et_droits_similaires = "AF";

	 private String fonds_commercial = "AH";

	 private String autres_immobilisations_incorporelles = "AJ";

	 private String avances_et_acomptes_sur_immobilisations_incorporelles = "AL";

	 private String terrains = "AN";

	 private String constructions = "AP";

	 private String installations_techniques_materiel_et_outillage_industriels = "AR";

	 private String autres_immobilisations_corporelles = "AT";

	 private String immobilisations_en_cours = "AV";

	 private String avances_et_acomptes = "AX";

	 private String participations_evaluees_mise_en_equivalence = "CS";

	 private String autres_participations = "CU";

	 private String creances_rattachees_a_des_participations = "BB";

	 private String autres_titres_immobilises = "BD";

	 private String prets = "BF";

	 private String autres_immobilisations_financieres = "BH";

	 private String total_i = "BJ";

	 private String matieres_premieres_approvisionnements = "BL";

	 private String en_cours_de_production_de_biens = "BN";

	 private String en_cours_de_production_de_services = "BP";

	 private String produits_intermediaires_et_finis = "BR";

	 private String marchandises = "BT";

	 private String avances_et_acomptes_verses_sur_commandes = "BV";

	 private String clients_et_comptes_rattaches = "BX";

	 private String autres_creances = "BZ";

	 private String capital_souscrit_et_appele_non_verse = "CB";

	 private String valeurs_mobilieres_de_placement = "CD";

	 private String disponibilites = "CF";

	 private String charges_constatees_d_avance = "CH";

	 private String total_ii = "CJ";

	 private String charges_a_repartir_ou_frais_d_emission_d_emprunt = "CW";

	 private String primes_de_remboursement_des_obligations_iv = "CM";

	 private String ecarts_de_conversion_actif_v = "CN";

	 private String parts_a_moins_d_un_an = "CP";

	 private String parts_a_plus_d_un_an = "CR";

	 private String passif = "PPPPPP";

	 private String capital_social_ou_individuel = "DA";

	 private String primes_d_emission_de_fusion_d_apport = "DB";

	 private String dont_ecart_d_equivalence = "EK";

	 private String ecarts_de_reevaluation = "DC";

	 private String reserve_legale_1 = "DD";

	 private String reserves_statutaires_ou_contractuelles = "DE";

	 private String dont_reserve_speciale_des_provisions_pour_fluctuation_des_cours = "B1";

	 private String reserves_reglementees_1 = "DF";

	 private String dont_reserve_relative_a_l_achat_d_oeuvres_originales_d_artistes_vivants = "EJ";

	 private String autres_reserves = "DG";

	 private String report_a_nouveau = "DH";

	 private String resultat_de_l_exercice_benefice_ou_perte = "DI";

	 private String subventions_d_investissement = "DJ";

	 private String provisions_reglementees = "DK";

	 private String produit_des_emissions_de_titres_participatifs = "DM";

	 private String avances_conditionnees = "DN";
	 
	 private String provisions_pour_risques = "DP";

	 private String provisions_pour_charges = "DQ";

	 private String total_iii = "DR";

	 private String emprunts_obligataires_convertibles = "DS";

	 private String autres_emprunts_obligataires = "DT";

	 private String emprunts_et_dettes_aupres_des_etablissements_de_credit_3 = "DU";

	 private String emprunts_et_dettes_financieres_divers_4 = "DV";

	 private String avances_et_acomptes_recus_sur_commandes_en_cours = "DW";

	 private String dettes_fournisseurs_et_comptes_rattaches = "DX";

	 private String dettes_fiscales_et_sociales = "DY";

	 private String dettes_sur_immobilisations_et_comptes_rattaches = "DZ";

	 private String autres_dettes = "EA";

	 private String produits_constates_d_avance_2 = "EB";

	 private String total_iv = "EC";

	 private String v = "ED";

	 private String total_passif = "EE"; // total_general_i_a_v

	 private String dont_reserve_reglementee_des_plusvalues_a_long_terme = "EF";

	 private String dettes_et_produits_constates_d_avance_a_moins_d_un_an = "EG";

	 private String dont_concours_bancaires_courants_et_soldes_crediteurs_de_banques_et_ccp = "EH";

	 private String dont_emprunts_participatifs = "EI";

	 private String compte_de_resultat_a = "CCCCCC";

	 private String ventes_de_marchandises = "FA";

	 private String production_vendue_biens = "FD";

	 private String production_vendue_services = "FG";

	 private String production_stockee = "FM";

	 private String production_immobilisee = "FN";

	 private String subventions_d_exploitation = "FO";

	 private String reprises_sur_amortissements_et_provisions_transfert_de_charges = "FP";

	 private String autres_produits = "FQ";

	 private String total_des_produits_d_exploitation_i = "FR";

	 private String achats_de_marchandises_y_compris_droits_de_douane = "FS";

	 private String variation_de_stock_marchandises = "FT";

	 private String achats_de_matieres_premieres_et_autres_approvisionnements = "FU";

	 private String variation_de_stock_matieres_premieres_et_approvisionnements = "FV";

	 private String autres_achats_et_charges_externes = "FW";

	 private String impots_taxes_et_versements_assimiles = "FX";

	 private String salaires_et_traitements = "FY";

	 private String charges_sociales = "FZ";

	 private String dot_d_exploit_dotations_aux_amortissements = "GA";

	 private String dot_d_exploit_dotations_aux_provisions = "GB";

	 private String dot_d_exploit_sur_actif_circulant_dotations_aux_provisions = "GC";

	 private String dot_d_exploit_pour_risques_et_charges_dotations_aux_provisions = "GD";

	 private String autres_charges = "GE";

	 private String total_des_charges_d_exploitation_ii = "GF";

	 private String benefice_attribue_ou_perte_transferee_iii = "GH";

	 private String perte_supportee_ou_benefice_transfere_iv = "GI";

	 private String produits_financiers_de_participations = "GJ";

	 private String produits_des_autres_valeurs_mobilieres_et_creances_de_l_actif_immobilise = "GK";

	 private String autres_interets_et_produits_assimiles = "GL";

	 private String reprises_sur_provisions_et_transferts_de_charges = "GM";

	 private String differences_positives_de_change = "GN";

	 private String produits_nets_sur_cessions_de_valeurs_mobilieres_de_placement = "GO";

	 private String total_des_produits_financiers_v = "GP";

	 private String dotations_financieres_sur_amortissements_et_provisions = "GQ";

	 private String interets_et_charges_assimilees = "GR";

	 private String differences_negatives_de_change = "GS";

	 private String charges_nettes_sur_cessions_de_valeurs_mobilieres_de_placement = "GT";

	 private String total_des_charges_financieres_vi = "GU";

	 private String resultat_financier_v_vi = "GV";

	 private String resultat_courant_avant_impots_i_ii_iii_iv_v_vi = "GW";

	 private String compte_de_resultat_b = "CCCBBB";

	 private String produits_exceptionnels_sur_operations_de_gestion = "HA";

	 private String produits_exceptionnels_sur_operations_en_capital = "HB";

	 private String total_des_produits_exceptionnels_vii = "HD";

	 private String charges_exceptionnelles_sur_operations_de_gestion = "HE";

	 private String charges_exceptionnelles_sur_operations_en_capital = "HF";

	 private String dotations_exceptionnelles_aux_amortissements_et_provisions = "HG";

	 private String total_des_charges_exceptionnelles_viii = "HH";

	 private String resultat_exceptionnel_vii_viii = "HI";

	 private String participation_des_salaries_aux_resultats_de_l_entreprise = "HJ";

	 private String impots_sur_les_benefices_x = "HK";

	 private String total_des_produits_i_iii_v_vii = "HL";

	 private String total_des_charges_ii_iv_vi_viii_ix_x = "HM";

	 private String renvois_creditbail_mobilier = "HP";

	 private String renvois_creditbail_immobilier = "HQ";

	 private String renvois_transfert_de_charges = "A1";

	 private String renvois_cotisations_personnelles_de_l_exploitant = "A2";

	 private String renvois_redevances_pour_concessions_de_brevets_de_licences_produits = "A3";

	 private String renvois_redevances_pour_concessions_de_brevets_de_licences_charges = "A4";

	 private String immobilisations = "IIIIII";

	 private String acquisitions_frais_d_etablissement_et_de_developpement_ou_de_recherche = "CZ";

	 private String acquisitions_total_dont_autres_postes_d_immobilisations_incorporelles = "KD";

	 private String acquisitions_total_immobilisations_corporelles = "LN";

	 private String acquisitions_total_immobilisations_financieres = "LQ";

	 private String acquisitions_total_general = "0G";

	 private String diminutions_frais_d_etablissement_et_de_developpement_ou_de_recherche = "IN";

	 private String diminutions_total_dont_autres_postes_d_immobilisations_incorporelles = "IO";

	 private String diminutions_virement_postes_immobilisations_corporelles_en_cours = "MY";

	 private String diminutions_virement_postes_avances_et_acomptes = "NC";

	 private String diminutions_total_immobilisations_corporelles = "IY";

	 private String diminutions_prets_et_immobilisations_financieres = "I2";

	 private String diminutions_total_immobilisations_financieres = "I3";

	 private String diminutions_total_general = "I4";

	 private String amortissements = "IIIAAA";

	 private String amortissements_frais_d_etablissement_et_de_developpement_ou_de_recherche = "CY";

	 private String amortissements_total_dont_autres_immobilisations_incorporelles = "PE";

	 private String amortissements_total_immobilisations_corporelles = "QU";

	 private String amortissements_total_general = "0N";
	 
	 private String mvt_sur_charges_rep_primes_de_remboursement_des_obligations = "SP";

	 private String provisions = "PPPBBB";

	 private String amortissements_derogatoires = "3X";

	 private String total_provisions_reglementees = "3Z";

	 private String provisions_pour_litiges = "4A";

	 private String provisions_pour_garanties_donnees_aux_clients = "4E";

	 private String provisions_pour_perte_sur_marches_a_terme = "4J";

	 private String provisions_pour_amendes_et_penalites = "4N";

	 private String provisions_pour_perte_de_change = "4T";

	 private String provisions_pour_pensions_et_obligations_similaires = "4X";

	 private String provisions_pour_impots = "5B";

	 private String provisions_pour_renouvellement_des_immobilisations = "5F";

	 private String provisions_pour_gros_entretien_et_grandes_revisions_ou_grosses_reparations = "EO";

	 private String provisions_pour_charges_sociales_et_fiscales_sur_conges_a_payer = "5R";

	 private String autres_provisions_pour_risques_et_charges = "5V";

	 private String total_provisions_pour_risques_et_charges = "5Z";

	 private String sur_immobilisations_incorporelles = "6A";

	 private String sur_immobilisations_corporelles = "6E";

	 private String sur_immobilisations_titres_mis_en_equivalence = "02";

	 private String sur_immobilisations_titres_de_participation = "9U";

	 private String sur_immobilisations_autres_immobilisations_financieres = "06";

	 private String sur_stocks_et_en_cours = "6N";

	 private String sur_comptes_clients = "6T";

	 private String autres_provisions_pour_depreciation = "6X";

	 private String total_provisions_pour_depreciation = "7B";

	 private String total_general = "7C";

	 private String dont_dotations_et_reprises_d_exploitation = "UE";

	 private String dont_dotations_et_reprises_financieres = "UG";

	 private String dont_dotations_et_reprises_exceptionnelles = "UJ";

	 private String creances_et_dettes = "CCCAAA";
	 
	 private String clients_douteux_ou_litigieux = "VA";

	 private String autres_creances_clients = "UX";

	 private String provision_pour_depreciation_anterieurement_constituee = "UO";

	 private String creances_representatives_de_titres_pretes = "Z1";

	 private String personnel_et_comptes_rattaches = "UY";

	 private String securite_sociale_autres_organismes_sociaux = "UZ";

	 private String impots_sur_les_benefices = "VM";

	 private String t_v_a = "VB";

	 private String autres_impots_taxes_versements_assimiles = "VN";

	 private String divers = "VP";

	 private String groupe_et_associes = "VC";

	 private String debiteurs_divers_dont_creances_relatives_a_des_operations_de_pension_de_titres = "VR";

	 private String total_etat_des_creances = "VT";

	 private String emprunts_obligataires_convertibles_brut_a_un_an_au_plus = "7Y";

	 private String autres_emprunts_obligataires_brut_a_un_an_au_plus = "7Z";

	 private String emprunts_a_1_an_maximum_a_l_origine = "VG";

	 private String emprunts_a_plus_d_1_an_a_l_origine = "VH";

	 private String emprunts_et_dettes_financieres_divers = "8A";

	 private String fournisseurs_et_comptes_rattaches = "8B";

	 private String securite_sociale_et_autres_organismes_sociaux = "8D";

	 private String tva = "VW";

	 private String obligations_cautionnees = "VX";

	 private String autres_impots_taxes_et_assimiles = "VQ";

	 private String autres_dettes_dont_dettes_relatives_a_des_operations_de_pension_de_titre = "8K";

	 private String dette_representative_de_titres_empruntes = "Z2";

	 private String produits_constates_d_avance = "8L";

	 private String total_etat_des_dettes = "VY";

	 private String emprunts_souscrits_en_cours_d_exercice = "VJ";

	 private String emprunts_rembourses_en_cours_d_exercice = "VK";

	 private String affectation_du_resultat_renseignements_divers = "RRRRRR";

	 private String dividendes = "ZE";

	 private String engagement_de_creditbail_mobilier = "YQ";

	 private String engagement_de_creditbail_immobilier = "YR";

	 private String effets_portes_a_l_escompte_et_non_echus = "YS";

	 private String soustraitance = "YT";

	 private String location_charges_locatives_et_de_copropriete = "XQ";

	 private String personnel_exterieur_a_l_entreprise = "YU";

	 private String remuneration_d_intermediaires_et_honoraires_hors_retrocessions = "SS";

	 private String retrocessions_d_honoraires_commissions_et_courtages = "YV";

	 private String autres_comptes = "ST";

	 private String total_du_poste_correspondant_a_la_ligne_fw_du_tableau_numero_2052 = "ZJ";

	 private String taxe_professionnelle = "YW";

	 private String autres_impots_taxes_et_versements_assimiles = "9Z";

	 private String total_du_compte_correspondant_a_la_ligne_fx_du_tableau_numero_2052 = "YX";

	 private String montant_de_la_tva_collectee = "YY";

	 private String total_tva_deductible_sur_biens_et_services = "YZ";

	 private String effectif_moyen_du_personnel = "YP";

	 private String filiales_et_participations = "ZR";
	
	public List<String> getStringAttributsName() throws BeanException
	{
		List<String> stringAttributs = new ArrayList<String>();
		
		stringAttributs.add("siren");
		stringAttributs.add("denomination");
		stringAttributs.add("adresse");
		stringAttributs.add("denomination");
		stringAttributs.add("date_cloture_exercice");
		
		return stringAttributs;
	}
	
	public List<String> getAttributsName() throws BeanException
	{
		List<String> Attributs = new ArrayList<String>();
		Field[] f = this.getClass().getDeclaredFields();
		//System.out.prIntegerln("recherche des noms des attributs : "+f.length);
		for(Integer i = 0 ; i < f.length ; i++)
		{
			//if(o.equals(f[i].get(this))) //Comparaison de deux variable 
			Attributs.add(f[i].getName());
			//System.out.prIntegerln(" simple: "+f[i].getType().getSimpleName());
		}
		return Attributs;
	}
		
	public Map<String, String> getCodeAttributs(){
		Map<String, String> map = new HashMap<>();
		
		Field[] f = this.getClass().getDeclaredFields();
		//System.out.prIntegerln("recherche des noms des attributs : "+f.length);
		for(Integer i = 0 ; i < f.length ; i++)
		{
			try {
				map.put(f[i].getName(), (String) f[i].get(this));
				//System.out.println("content : "+map.get(f[i].getName()));
				
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

			//System.out.prIntegerln(" simple: "+f[i].getType().getSimpleName());
		}
		//Ajouter une clé et une valeur.
		
		//Récupérer la valeur grâce à sa clé.
		System.out.println(); 
		
		return map;
	}

	public Map<String, String> getNameCode(){
		Map<String, String> map = new HashMap<>();
		
		Field[] f = this.getClass().getDeclaredFields();
		//System.out.prIntegerln("recherche des noms des attributs : "+f.length);
		for(Integer i = 0 ; i < f.length ; i++)
		{
			try {
				map.put((String) f[i].get(this),f[i].getName());
				//System.out.println("content : "+map.get(f[i].getName()));
				
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

			//System.out.prIntegerln(" simple: "+f[i].getType().getSimpleName());
		}
		//Ajouter une clé et une valeur.
		
		//Récupérer la valeur grâce à sa clé.
		System.out.println(); 
		
		return map;
	}
	
	
	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getChiffres_d_affaires_nets() {
		return chiffres_d_affaires_nets;
	}

	public void setChiffres_d_affaires_nets(String chiffres_d_affaires_nets) {
		this.chiffres_d_affaires_nets = chiffres_d_affaires_nets;
	}

	public String getResultat_d_exploitation_i_ii() {
		return resultat_d_exploitation_i_ii;
	}

	public void setResultat_d_exploitation_i_ii(String resultat_d_exploitation_i_ii) {
		this.resultat_d_exploitation_i_ii = resultat_d_exploitation_i_ii;
	}

	public String getBenefice_ou_perte() {
		return benefice_ou_perte;
	}

	public void setBenefice_ou_perte(String benefice_ou_perte) {
		this.benefice_ou_perte = benefice_ou_perte;
	}

	public String getTotal_actif() {
		return total_actif;
	}

	public void setTotal_actif(String total_actif) {
		this.total_actif = total_actif;
	}

	public String getDate_cloture_exercice() {
		return date_cloture_exercice;
	}

	public void setDate_cloture_exercice(String date_cloture_exercice) {
		this.date_cloture_exercice = date_cloture_exercice;
	}

	
	
	public String getActif() {
		return actif;
	}

	public void setActif(String actif) {
		this.actif = actif;
	}

	public String getCapital_souscrit_non_appele() {
		return capital_souscrit_non_appele;
	}

	public void setCapital_souscrit_non_appele(String capital_souscrit_non_appele) {
		this.capital_souscrit_non_appele = capital_souscrit_non_appele;
	}

	public String getFrais_d_etablissement() {
		return frais_d_etablissement;
	}

	public void setFrais_d_etablissement(String frais_d_etablissement) {
		this.frais_d_etablissement = frais_d_etablissement;
	}

	public String getFrais_de_developpement_ou_de_recherche_et_developpement() {
		return frais_de_developpement_ou_de_recherche_et_developpement;
	}

	public void setFrais_de_developpement_ou_de_recherche_et_developpement(
			String frais_de_developpement_ou_de_recherche_et_developpement) {
		this.frais_de_developpement_ou_de_recherche_et_developpement = frais_de_developpement_ou_de_recherche_et_developpement;
	}

	public String getConcessions_brevets_et_droits_similaires() {
		return concessions_brevets_et_droits_similaires;
	}

	public void setConcessions_brevets_et_droits_similaires(String concessions_brevets_et_droits_similaires) {
		this.concessions_brevets_et_droits_similaires = concessions_brevets_et_droits_similaires;
	}

	public String getFonds_commercial() {
		return fonds_commercial;
	}

	public void setFonds_commercial(String fonds_commercial) {
		this.fonds_commercial = fonds_commercial;
	}

	public String getAutres_immobilisations_incorporelles() {
		return autres_immobilisations_incorporelles;
	}

	public void setAutres_immobilisations_incorporelles(String autres_immobilisations_incorporelles) {
		this.autres_immobilisations_incorporelles = autres_immobilisations_incorporelles;
	}

	public String getAvances_et_acomptes_sur_immobilisations_incorporelles() {
		return avances_et_acomptes_sur_immobilisations_incorporelles;
	}

	public void setAvances_et_acomptes_sur_immobilisations_incorporelles(
			String avances_et_acomptes_sur_immobilisations_incorporelles) {
		this.avances_et_acomptes_sur_immobilisations_incorporelles = avances_et_acomptes_sur_immobilisations_incorporelles;
	}

	public String getTerrains() {
		return terrains;
	}

	public void setTerrains(String terrains) {
		this.terrains = terrains;
	}

	public String getConstructions() {
		return constructions;
	}

	public void setConstructions(String constructions) {
		this.constructions = constructions;
	}

	public String getInstallations_techniques_materiel_et_outillage_industriels() {
		return installations_techniques_materiel_et_outillage_industriels;
	}

	public void setInstallations_techniques_materiel_et_outillage_industriels(
			String installations_techniques_materiel_et_outillage_industriels) {
		this.installations_techniques_materiel_et_outillage_industriels = installations_techniques_materiel_et_outillage_industriels;
	}

	public String getAutres_immobilisations_corporelles() {
		return autres_immobilisations_corporelles;
	}

	public void setAutres_immobilisations_corporelles(String autres_immobilisations_corporelles) {
		this.autres_immobilisations_corporelles = autres_immobilisations_corporelles;
	}

	public String getImmobilisations_en_cours() {
		return immobilisations_en_cours;
	}

	public void setImmobilisations_en_cours(String immobilisations_en_cours) {
		this.immobilisations_en_cours = immobilisations_en_cours;
	}

	public String getAvances_et_acomptes() {
		return avances_et_acomptes;
	}

	public void setAvances_et_acomptes(String avances_et_acomptes) {
		this.avances_et_acomptes = avances_et_acomptes;
	}

	public String getParticipations_evaluees_mise_en_equivalence() {
		return participations_evaluees_mise_en_equivalence;
	}

	public void setParticipations_evaluees_mise_en_equivalence(String participations_evaluees_mise_en_equivalence) {
		this.participations_evaluees_mise_en_equivalence = participations_evaluees_mise_en_equivalence;
	}

	public String getAutres_participations() {
		return autres_participations;
	}

	public void setAutres_participations(String autres_participations) {
		this.autres_participations = autres_participations;
	}

	public String getCreances_rattachees_a_des_participations() {
		return creances_rattachees_a_des_participations;
	}

	public void setCreances_rattachees_a_des_participations(String creances_rattachees_a_des_participations) {
		this.creances_rattachees_a_des_participations = creances_rattachees_a_des_participations;
	}

	public String getAutres_titres_immobilises() {
		return autres_titres_immobilises;
	}

	public void setAutres_titres_immobilises(String autres_titres_immobilises) {
		this.autres_titres_immobilises = autres_titres_immobilises;
	}

	public String getPrets() {
		return prets;
	}

	public void setPrets(String prets) {
		this.prets = prets;
	}

	public String getAutres_immobilisations_financieres() {
		return autres_immobilisations_financieres;
	}

	public void setAutres_immobilisations_financieres(String autres_immobilisations_financieres) {
		this.autres_immobilisations_financieres = autres_immobilisations_financieres;
	}

	public String getTotal_i() {
		return total_i;
	}

	public void setTotal_i(String total_i) {
		this.total_i = total_i;
	}

	public String getMatieres_premieres_approvisionnements() {
		return matieres_premieres_approvisionnements;
	}

	public void setMatieres_premieres_approvisionnements(String matieres_premieres_approvisionnements) {
		this.matieres_premieres_approvisionnements = matieres_premieres_approvisionnements;
	}

	public String getEn_cours_de_production_de_biens() {
		return en_cours_de_production_de_biens;
	}

	public void setEn_cours_de_production_de_biens(String en_cours_de_production_de_biens) {
		this.en_cours_de_production_de_biens = en_cours_de_production_de_biens;
	}

	public String getEn_cours_de_production_de_services() {
		return en_cours_de_production_de_services;
	}

	public void setEn_cours_de_production_de_services(String en_cours_de_production_de_services) {
		this.en_cours_de_production_de_services = en_cours_de_production_de_services;
	}

	public String getProduits_intermediaires_et_finis() {
		return produits_intermediaires_et_finis;
	}

	public void setProduits_intermediaires_et_finis(String produits_intermediaires_et_finis) {
		this.produits_intermediaires_et_finis = produits_intermediaires_et_finis;
	}

	public String getMarchandises() {
		return marchandises;
	}

	public void setMarchandises(String marchandises) {
		this.marchandises = marchandises;
	}

	public String getAvances_et_acomptes_verses_sur_commandes() {
		return avances_et_acomptes_verses_sur_commandes;
	}

	public void setAvances_et_acomptes_verses_sur_commandes(String avances_et_acomptes_verses_sur_commandes) {
		this.avances_et_acomptes_verses_sur_commandes = avances_et_acomptes_verses_sur_commandes;
	}

	public String getClients_et_comptes_rattaches() {
		return clients_et_comptes_rattaches;
	}

	public void setClients_et_comptes_rattaches(String clients_et_comptes_rattaches) {
		this.clients_et_comptes_rattaches = clients_et_comptes_rattaches;
	}

	public String getAutres_creances() {
		return autres_creances;
	}

	public void setAutres_creances(String autres_creances) {
		this.autres_creances = autres_creances;
	}

	public String getCapital_souscrit_et_appele_non_verse() {
		return capital_souscrit_et_appele_non_verse;
	}

	public void setCapital_souscrit_et_appele_non_verse(String capital_souscrit_et_appele_non_verse) {
		this.capital_souscrit_et_appele_non_verse = capital_souscrit_et_appele_non_verse;
	}

	public String getValeurs_mobilieres_de_placement() {
		return valeurs_mobilieres_de_placement;
	}

	public void setValeurs_mobilieres_de_placement(String valeurs_mobilieres_de_placement) {
		this.valeurs_mobilieres_de_placement = valeurs_mobilieres_de_placement;
	}

	public String getDisponibilites() {
		return disponibilites;
	}

	public void setDisponibilites(String disponibilites) {
		this.disponibilites = disponibilites;
	}

	public String getCharges_constatees_d_avance() {
		return charges_constatees_d_avance;
	}

	public void setCharges_constatees_d_avance(String charges_constatees_d_avance) {
		this.charges_constatees_d_avance = charges_constatees_d_avance;
	}

	public String getTotal_ii() {
		return total_ii;
	}

	public void setTotal_ii(String total_ii) {
		this.total_ii = total_ii;
	}

	public String getCharges_a_repartir_ou_frais_d_emission_d_emprunt() {
		return charges_a_repartir_ou_frais_d_emission_d_emprunt;
	}

	public void setCharges_a_repartir_ou_frais_d_emission_d_emprunt(
			String charges_a_repartir_ou_frais_d_emission_d_emprunt) {
		this.charges_a_repartir_ou_frais_d_emission_d_emprunt = charges_a_repartir_ou_frais_d_emission_d_emprunt;
	}

	public String getPrimes_de_remboursement_des_obligations_iv() {
		return primes_de_remboursement_des_obligations_iv;
	}

	public void setPrimes_de_remboursement_des_obligations_iv(String primes_de_remboursement_des_obligations_iv) {
		this.primes_de_remboursement_des_obligations_iv = primes_de_remboursement_des_obligations_iv;
	}

	public String getEcarts_de_conversion_actif_v() {
		return ecarts_de_conversion_actif_v;
	}

	public void setEcarts_de_conversion_actif_v(String ecarts_de_conversion_actif_v) {
		this.ecarts_de_conversion_actif_v = ecarts_de_conversion_actif_v;
	}

	public String getParts_a_moins_d_un_an() {
		return parts_a_moins_d_un_an;
	}

	public void setParts_a_moins_d_un_an(String parts_a_moins_d_un_an) {
		this.parts_a_moins_d_un_an = parts_a_moins_d_un_an;
	}

	public String getParts_a_plus_d_un_an() {
		return parts_a_plus_d_un_an;
	}

	public void setParts_a_plus_d_un_an(String parts_a_plus_d_un_an) {
		this.parts_a_plus_d_un_an = parts_a_plus_d_un_an;
	}

	public String getPassif() {
		return passif;
	}

	public void setPassif(String passif) {
		this.passif = passif;
	}

	public String getCapital_social_ou_individuel() {
		return capital_social_ou_individuel;
	}

	public void setCapital_social_ou_individuel(String capital_social_ou_individuel) {
		this.capital_social_ou_individuel = capital_social_ou_individuel;
	}

	public String getPrimes_d_emission_de_fusion_d_apport() {
		return primes_d_emission_de_fusion_d_apport;
	}

	public void setPrimes_d_emission_de_fusion_d_apport(String primes_d_emission_de_fusion_d_apport) {
		this.primes_d_emission_de_fusion_d_apport = primes_d_emission_de_fusion_d_apport;
	}

	public String getDont_ecart_d_equivalence() {
		return dont_ecart_d_equivalence;
	}

	public void setDont_ecart_d_equivalence(String dont_ecart_d_equivalence) {
		this.dont_ecart_d_equivalence = dont_ecart_d_equivalence;
	}

	public String getEcarts_de_reevaluation() {
		return ecarts_de_reevaluation;
	}

	public void setEcarts_de_reevaluation(String ecarts_de_reevaluation) {
		this.ecarts_de_reevaluation = ecarts_de_reevaluation;
	}

	public String getReserve_legale_1() {
		return reserve_legale_1;
	}

	public void setReserve_legale_1(String reserve_legale_1) {
		this.reserve_legale_1 = reserve_legale_1;
	}

	public String getReserves_statutaires_ou_contractuelles() {
		return reserves_statutaires_ou_contractuelles;
	}

	public void setReserves_statutaires_ou_contractuelles(String reserves_statutaires_ou_contractuelles) {
		this.reserves_statutaires_ou_contractuelles = reserves_statutaires_ou_contractuelles;
	}

	public String getDont_reserve_speciale_des_provisions_pour_fluctuation_des_cours() {
		return dont_reserve_speciale_des_provisions_pour_fluctuation_des_cours;
	}

	public void setDont_reserve_speciale_des_provisions_pour_fluctuation_des_cours(
			String dont_reserve_speciale_des_provisions_pour_fluctuation_des_cours) {
		this.dont_reserve_speciale_des_provisions_pour_fluctuation_des_cours = dont_reserve_speciale_des_provisions_pour_fluctuation_des_cours;
	}

	public String getReserves_reglementees_1() {
		return reserves_reglementees_1;
	}

	public void setReserves_reglementees_1(String reserves_reglementees_1) {
		this.reserves_reglementees_1 = reserves_reglementees_1;
	}

	public String getDont_reserve_relative_a_l_achat_d_oeuvres_originales_d_artistes_vivants() {
		return dont_reserve_relative_a_l_achat_d_oeuvres_originales_d_artistes_vivants;
	}

	public void setDont_reserve_relative_a_l_achat_d_oeuvres_originales_d_artistes_vivants(
			String dont_reserve_relative_a_l_achat_d_oeuvres_originales_d_artistes_vivants) {
		this.dont_reserve_relative_a_l_achat_d_oeuvres_originales_d_artistes_vivants = dont_reserve_relative_a_l_achat_d_oeuvres_originales_d_artistes_vivants;
	}

	public String getAutres_reserves() {
		return autres_reserves;
	}

	public void setAutres_reserves(String autres_reserves) {
		this.autres_reserves = autres_reserves;
	}

	public String getReport_a_nouveau() {
		return report_a_nouveau;
	}

	public void setReport_a_nouveau(String report_a_nouveau) {
		this.report_a_nouveau = report_a_nouveau;
	}

	public String getResultat_de_l_exercice_benefice_ou_perte() {
		return resultat_de_l_exercice_benefice_ou_perte;
	}

	public void setResultat_de_l_exercice_benefice_ou_perte(String resultat_de_l_exercice_benefice_ou_perte) {
		this.resultat_de_l_exercice_benefice_ou_perte = resultat_de_l_exercice_benefice_ou_perte;
	}

	public String getSubventions_d_investissement() {
		return subventions_d_investissement;
	}

	public void setSubventions_d_investissement(String subventions_d_investissement) {
		this.subventions_d_investissement = subventions_d_investissement;
	}

	public String getProvisions_reglementees() {
		return provisions_reglementees;
	}

	public void setProvisions_reglementees(String provisions_reglementees) {
		this.provisions_reglementees = provisions_reglementees;
	}

	public String getProduit_des_emissions_de_titres_participatifs() {
		return produit_des_emissions_de_titres_participatifs;
	}

	public void setProduit_des_emissions_de_titres_participatifs(String produit_des_emissions_de_titres_participatifs) {
		this.produit_des_emissions_de_titres_participatifs = produit_des_emissions_de_titres_participatifs;
	}

	public String getAvances_conditionnees() {
		return avances_conditionnees;
	}

	public void setAvances_conditionnees(String avances_conditionnees) {
		this.avances_conditionnees = avances_conditionnees;
	}

	public String getProvisions_pour_risques() {
		return provisions_pour_risques;
	}

	public void setProvisions_pour_risques(String provisions_pour_risques) {
		this.provisions_pour_risques = provisions_pour_risques;
	}

	public String getProvisions_pour_charges() {
		return provisions_pour_charges;
	}

	public void setProvisions_pour_charges(String provisions_pour_charges) {
		this.provisions_pour_charges = provisions_pour_charges;
	}

	public String getTotal_iii() {
		return total_iii;
	}

	public void setTotal_iii(String total_iii) {
		this.total_iii = total_iii;
	}

	public String getEmprunts_obligataires_convertibles() {
		return emprunts_obligataires_convertibles;
	}

	public void setEmprunts_obligataires_convertibles(String emprunts_obligataires_convertibles) {
		this.emprunts_obligataires_convertibles = emprunts_obligataires_convertibles;
	}

	public String getAutres_emprunts_obligataires() {
		return autres_emprunts_obligataires;
	}

	public void setAutres_emprunts_obligataires(String autres_emprunts_obligataires) {
		this.autres_emprunts_obligataires = autres_emprunts_obligataires;
	}

	public String getEmprunts_et_dettes_aupres_des_etablissements_de_credit_3() {
		return emprunts_et_dettes_aupres_des_etablissements_de_credit_3;
	}

	public void setEmprunts_et_dettes_aupres_des_etablissements_de_credit_3(
			String emprunts_et_dettes_aupres_des_etablissements_de_credit_3) {
		this.emprunts_et_dettes_aupres_des_etablissements_de_credit_3 = emprunts_et_dettes_aupres_des_etablissements_de_credit_3;
	}

	public String getEmprunts_et_dettes_financieres_divers_4() {
		return emprunts_et_dettes_financieres_divers_4;
	}

	public void setEmprunts_et_dettes_financieres_divers_4(String emprunts_et_dettes_financieres_divers_4) {
		this.emprunts_et_dettes_financieres_divers_4 = emprunts_et_dettes_financieres_divers_4;
	}

	public String getAvances_et_acomptes_recus_sur_commandes_en_cours() {
		return avances_et_acomptes_recus_sur_commandes_en_cours;
	}

	public void setAvances_et_acomptes_recus_sur_commandes_en_cours(
			String avances_et_acomptes_recus_sur_commandes_en_cours) {
		this.avances_et_acomptes_recus_sur_commandes_en_cours = avances_et_acomptes_recus_sur_commandes_en_cours;
	}

	public String getDettes_fournisseurs_et_comptes_rattaches() {
		return dettes_fournisseurs_et_comptes_rattaches;
	}

	public void setDettes_fournisseurs_et_comptes_rattaches(String dettes_fournisseurs_et_comptes_rattaches) {
		this.dettes_fournisseurs_et_comptes_rattaches = dettes_fournisseurs_et_comptes_rattaches;
	}

	public String getDettes_fiscales_et_sociales() {
		return dettes_fiscales_et_sociales;
	}

	public void setDettes_fiscales_et_sociales(String dettes_fiscales_et_sociales) {
		this.dettes_fiscales_et_sociales = dettes_fiscales_et_sociales;
	}

	public String getDettes_sur_immobilisations_et_comptes_rattaches() {
		return dettes_sur_immobilisations_et_comptes_rattaches;
	}

	public void setDettes_sur_immobilisations_et_comptes_rattaches(String dettes_sur_immobilisations_et_comptes_rattaches) {
		this.dettes_sur_immobilisations_et_comptes_rattaches = dettes_sur_immobilisations_et_comptes_rattaches;
	}

	public String getAutres_dettes() {
		return autres_dettes;
	}

	public void setAutres_dettes(String autres_dettes) {
		this.autres_dettes = autres_dettes;
	}

	public String getProduits_constates_d_avance_2() {
		return produits_constates_d_avance_2;
	}

	public void setProduits_constates_d_avance_2(String produits_constates_d_avance_2) {
		this.produits_constates_d_avance_2 = produits_constates_d_avance_2;
	}

	public String getTotal_iv() {
		return total_iv;
	}

	public void setTotal_iv(String total_iv) {
		this.total_iv = total_iv;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}


	public String getTotal_passif() {
		return total_passif;
	}

	public void setTotal_passif(String total_passif) {
		this.total_passif = total_passif;
	}

	public String getDont_reserve_reglementee_des_plusvalues_a_long_terme() {
		return dont_reserve_reglementee_des_plusvalues_a_long_terme;
	}

	public void setDont_reserve_reglementee_des_plusvalues_a_long_terme(
			String dont_reserve_reglementee_des_plusvalues_a_long_terme) {
		this.dont_reserve_reglementee_des_plusvalues_a_long_terme = dont_reserve_reglementee_des_plusvalues_a_long_terme;
	}

	public String getDettes_et_produits_constates_d_avance_a_moins_d_un_an() {
		return dettes_et_produits_constates_d_avance_a_moins_d_un_an;
	}

	public void setDettes_et_produits_constates_d_avance_a_moins_d_un_an(
			String dettes_et_produits_constates_d_avance_a_moins_d_un_an) {
		this.dettes_et_produits_constates_d_avance_a_moins_d_un_an = dettes_et_produits_constates_d_avance_a_moins_d_un_an;
	}

	public String getDont_concours_bancaires_courants_et_soldes_crediteurs_de_banques_et_ccp() {
		return dont_concours_bancaires_courants_et_soldes_crediteurs_de_banques_et_ccp;
	}

	public void setDont_concours_bancaires_courants_et_soldes_crediteurs_de_banques_et_ccp(
			String dont_concours_bancaires_courants_et_soldes_crediteurs_de_banques_et_ccp) {
		this.dont_concours_bancaires_courants_et_soldes_crediteurs_de_banques_et_ccp = dont_concours_bancaires_courants_et_soldes_crediteurs_de_banques_et_ccp;
	}

	public String getDont_emprunts_participatifs() {
		return dont_emprunts_participatifs;
	}

	public void setDont_emprunts_participatifs(String dont_emprunts_participatifs) {
		this.dont_emprunts_participatifs = dont_emprunts_participatifs;
	}

	public String getCompte_de_resultat_a() {
		return compte_de_resultat_a;
	}

	public void setCompte_de_resultat_a(String compte_de_resultat_a) {
		this.compte_de_resultat_a = compte_de_resultat_a;
	}

	public String getVentes_de_marchandises() {
		return ventes_de_marchandises;
	}

	public void setVentes_de_marchandises(String ventes_de_marchandises) {
		this.ventes_de_marchandises = ventes_de_marchandises;
	}

	public String getProduction_vendue_biens() {
		return production_vendue_biens;
	}

	public void setProduction_vendue_biens(String production_vendue_biens) {
		this.production_vendue_biens = production_vendue_biens;
	}

	public String getProduction_vendue_services() {
		return production_vendue_services;
	}

	public void setProduction_vendue_services(String production_vendue_services) {
		this.production_vendue_services = production_vendue_services;
	}

	public String getProduction_stockee() {
		return production_stockee;
	}

	public void setProduction_stockee(String production_stockee) {
		this.production_stockee = production_stockee;
	}

	public String getProduction_immobilisee() {
		return production_immobilisee;
	}

	public void setProduction_immobilisee(String production_immobilisee) {
		this.production_immobilisee = production_immobilisee;
	}

	public String getSubventions_d_exploitation() {
		return subventions_d_exploitation;
	}

	public void setSubventions_d_exploitation(String subventions_d_exploitation) {
		this.subventions_d_exploitation = subventions_d_exploitation;
	}

	public String getReprises_sur_amortissements_et_provisions_transfert_de_charges() {
		return reprises_sur_amortissements_et_provisions_transfert_de_charges;
	}

	public void setReprises_sur_amortissements_et_provisions_transfert_de_charges(
			String reprises_sur_amortissements_et_provisions_transfert_de_charges) {
		this.reprises_sur_amortissements_et_provisions_transfert_de_charges = reprises_sur_amortissements_et_provisions_transfert_de_charges;
	}

	public String getAutres_produits() {
		return autres_produits;
	}

	public void setAutres_produits(String autres_produits) {
		this.autres_produits = autres_produits;
	}

	public String getTotal_des_produits_d_exploitation_i() {
		return total_des_produits_d_exploitation_i;
	}

	public void setTotal_des_produits_d_exploitation_i(String total_des_produits_d_exploitation_i) {
		this.total_des_produits_d_exploitation_i = total_des_produits_d_exploitation_i;
	}

	public String getAchats_de_marchandises_y_compris_droits_de_douane() {
		return achats_de_marchandises_y_compris_droits_de_douane;
	}

	public void setAchats_de_marchandises_y_compris_droits_de_douane(
			String achats_de_marchandises_y_compris_droits_de_douane) {
		this.achats_de_marchandises_y_compris_droits_de_douane = achats_de_marchandises_y_compris_droits_de_douane;
	}

	public String getVariation_de_stock_marchandises() {
		return variation_de_stock_marchandises;
	}

	public void setVariation_de_stock_marchandises(String variation_de_stock_marchandises) {
		this.variation_de_stock_marchandises = variation_de_stock_marchandises;
	}

	public String getAchats_de_matieres_premieres_et_autres_approvisionnements() {
		return achats_de_matieres_premieres_et_autres_approvisionnements;
	}

	public void setAchats_de_matieres_premieres_et_autres_approvisionnements(
			String achats_de_matieres_premieres_et_autres_approvisionnements) {
		this.achats_de_matieres_premieres_et_autres_approvisionnements = achats_de_matieres_premieres_et_autres_approvisionnements;
	}

	public String getVariation_de_stock_matieres_premieres_et_approvisionnements() {
		return variation_de_stock_matieres_premieres_et_approvisionnements;
	}

	public void setVariation_de_stock_matieres_premieres_et_approvisionnements(
			String variation_de_stock_matieres_premieres_et_approvisionnements) {
		this.variation_de_stock_matieres_premieres_et_approvisionnements = variation_de_stock_matieres_premieres_et_approvisionnements;
	}

	public String getAutres_achats_et_charges_externes() {
		return autres_achats_et_charges_externes;
	}

	public void setAutres_achats_et_charges_externes(String autres_achats_et_charges_externes) {
		this.autres_achats_et_charges_externes = autres_achats_et_charges_externes;
	}

	public String getImpots_taxes_et_versements_assimiles() {
		return impots_taxes_et_versements_assimiles;
	}

	public void setImpots_taxes_et_versements_assimiles(String impots_taxes_et_versements_assimiles) {
		this.impots_taxes_et_versements_assimiles = impots_taxes_et_versements_assimiles;
	}

	public String getSalaires_et_traitements() {
		return salaires_et_traitements;
	}

	public void setSalaires_et_traitements(String salaires_et_traitements) {
		this.salaires_et_traitements = salaires_et_traitements;
	}

	public String getCharges_sociales() {
		return charges_sociales;
	}

	public void setCharges_sociales(String charges_sociales) {
		this.charges_sociales = charges_sociales;
	}

	public String getDot_d_exploit_dotations_aux_amortissements() {
		return dot_d_exploit_dotations_aux_amortissements;
	}

	public void setDot_d_exploit_dotations_aux_amortissements(String dot_d_exploit_dotations_aux_amortissements) {
		this.dot_d_exploit_dotations_aux_amortissements = dot_d_exploit_dotations_aux_amortissements;
	}

	public String getDot_d_exploit_dotations_aux_provisions() {
		return dot_d_exploit_dotations_aux_provisions;
	}

	public void setDot_d_exploit_dotations_aux_provisions(String dot_d_exploit_dotations_aux_provisions) {
		this.dot_d_exploit_dotations_aux_provisions = dot_d_exploit_dotations_aux_provisions;
	}

	public String getDot_d_exploit_sur_actif_circulant_dotations_aux_provisions() {
		return dot_d_exploit_sur_actif_circulant_dotations_aux_provisions;
	}

	public void setDot_d_exploit_sur_actif_circulant_dotations_aux_provisions(
			String dot_d_exploit_sur_actif_circulant_dotations_aux_provisions) {
		this.dot_d_exploit_sur_actif_circulant_dotations_aux_provisions = dot_d_exploit_sur_actif_circulant_dotations_aux_provisions;
	}

	public String getDot_d_exploit_pour_risques_et_charges_dotations_aux_provisions() {
		return dot_d_exploit_pour_risques_et_charges_dotations_aux_provisions;
	}

	public void setDot_d_exploit_pour_risques_et_charges_dotations_aux_provisions(
			String dot_d_exploit_pour_risques_et_charges_dotations_aux_provisions) {
		this.dot_d_exploit_pour_risques_et_charges_dotations_aux_provisions = dot_d_exploit_pour_risques_et_charges_dotations_aux_provisions;
	}

	public String getAutres_charges() {
		return autres_charges;
	}

	public void setAutres_charges(String autres_charges) {
		this.autres_charges = autres_charges;
	}

	public String getTotal_des_charges_d_exploitation_ii() {
		return total_des_charges_d_exploitation_ii;
	}

	public void setTotal_des_charges_d_exploitation_ii(String total_des_charges_d_exploitation_ii) {
		this.total_des_charges_d_exploitation_ii = total_des_charges_d_exploitation_ii;
	}

	public String getBenefice_attribue_ou_perte_transferee_iii() {
		return benefice_attribue_ou_perte_transferee_iii;
	}

	public void setBenefice_attribue_ou_perte_transferee_iii(String benefice_attribue_ou_perte_transferee_iii) {
		this.benefice_attribue_ou_perte_transferee_iii = benefice_attribue_ou_perte_transferee_iii;
	}

	public String getPerte_supportee_ou_benefice_transfere_iv() {
		return perte_supportee_ou_benefice_transfere_iv;
	}

	public void setPerte_supportee_ou_benefice_transfere_iv(String perte_supportee_ou_benefice_transfere_iv) {
		this.perte_supportee_ou_benefice_transfere_iv = perte_supportee_ou_benefice_transfere_iv;
	}

	public String getProduits_financiers_de_participations() {
		return produits_financiers_de_participations;
	}

	public void setProduits_financiers_de_participations(String produits_financiers_de_participations) {
		this.produits_financiers_de_participations = produits_financiers_de_participations;
	}

	public String getProduits_des_autres_valeurs_mobilieres_et_creances_de_l_actif_immobilise() {
		return produits_des_autres_valeurs_mobilieres_et_creances_de_l_actif_immobilise;
	}

	public void setProduits_des_autres_valeurs_mobilieres_et_creances_de_l_actif_immobilise(
			String produits_des_autres_valeurs_mobilieres_et_creances_de_l_actif_immobilise) {
		this.produits_des_autres_valeurs_mobilieres_et_creances_de_l_actif_immobilise = produits_des_autres_valeurs_mobilieres_et_creances_de_l_actif_immobilise;
	}

	public String getAutres_interets_et_produits_assimiles() {
		return autres_interets_et_produits_assimiles;
	}

	public void setAutres_interets_et_produits_assimiles(String autres_interets_et_produits_assimiles) {
		this.autres_interets_et_produits_assimiles = autres_interets_et_produits_assimiles;
	}

	public String getReprises_sur_provisions_et_transferts_de_charges() {
		return reprises_sur_provisions_et_transferts_de_charges;
	}

	public void setReprises_sur_provisions_et_transferts_de_charges(
			String reprises_sur_provisions_et_transferts_de_charges) {
		this.reprises_sur_provisions_et_transferts_de_charges = reprises_sur_provisions_et_transferts_de_charges;
	}

	public String getDifferences_positives_de_change() {
		return differences_positives_de_change;
	}

	public void setDifferences_positives_de_change(String differences_positives_de_change) {
		this.differences_positives_de_change = differences_positives_de_change;
	}

	public String getProduits_nets_sur_cessions_de_valeurs_mobilieres_de_placement() {
		return produits_nets_sur_cessions_de_valeurs_mobilieres_de_placement;
	}

	public void setProduits_nets_sur_cessions_de_valeurs_mobilieres_de_placement(
			String produits_nets_sur_cessions_de_valeurs_mobilieres_de_placement) {
		this.produits_nets_sur_cessions_de_valeurs_mobilieres_de_placement = produits_nets_sur_cessions_de_valeurs_mobilieres_de_placement;
	}

	public String getTotal_des_produits_financiers_v() {
		return total_des_produits_financiers_v;
	}

	public void setTotal_des_produits_financiers_v(String total_des_produits_financiers_v) {
		this.total_des_produits_financiers_v = total_des_produits_financiers_v;
	}

	public String getDotations_financieres_sur_amortissements_et_provisions() {
		return dotations_financieres_sur_amortissements_et_provisions;
	}

	public void setDotations_financieres_sur_amortissements_et_provisions(
			String dotations_financieres_sur_amortissements_et_provisions) {
		this.dotations_financieres_sur_amortissements_et_provisions = dotations_financieres_sur_amortissements_et_provisions;
	}

	public String getInterets_et_charges_assimilees() {
		return interets_et_charges_assimilees;
	}

	public void setInterets_et_charges_assimilees(String interets_et_charges_assimilees) {
		this.interets_et_charges_assimilees = interets_et_charges_assimilees;
	}

	public String getDifferences_negatives_de_change() {
		return differences_negatives_de_change;
	}

	public void setDifferences_negatives_de_change(String differences_negatives_de_change) {
		this.differences_negatives_de_change = differences_negatives_de_change;
	}

	public String getCharges_nettes_sur_cessions_de_valeurs_mobilieres_de_placement() {
		return charges_nettes_sur_cessions_de_valeurs_mobilieres_de_placement;
	}

	public void setCharges_nettes_sur_cessions_de_valeurs_mobilieres_de_placement(
			String charges_nettes_sur_cessions_de_valeurs_mobilieres_de_placement) {
		this.charges_nettes_sur_cessions_de_valeurs_mobilieres_de_placement = charges_nettes_sur_cessions_de_valeurs_mobilieres_de_placement;
	}

	public String getTotal_des_charges_financieres_vi() {
		return total_des_charges_financieres_vi;
	}

	public void setTotal_des_charges_financieres_vi(String total_des_charges_financieres_vi) {
		this.total_des_charges_financieres_vi = total_des_charges_financieres_vi;
	}

	public String getResultat_financier_v_vi() {
		return resultat_financier_v_vi;
	}

	public void setResultat_financier_v_vi(String resultat_financier_v_vi) {
		this.resultat_financier_v_vi = resultat_financier_v_vi;
	}

	public String getResultat_courant_avant_impots_i_ii_iii_iv_v_vi() {
		return resultat_courant_avant_impots_i_ii_iii_iv_v_vi;
	}

	public void setResultat_courant_avant_impots_i_ii_iii_iv_v_vi(String resultat_courant_avant_impots_i_ii_iii_iv_v_vi) {
		this.resultat_courant_avant_impots_i_ii_iii_iv_v_vi = resultat_courant_avant_impots_i_ii_iii_iv_v_vi;
	}

	public String getCompte_de_resultat_b() {
		return compte_de_resultat_b;
	}

	public void setCompte_de_resultat_b(String compte_de_resultat_b) {
		this.compte_de_resultat_b = compte_de_resultat_b;
	}

	public String getProduits_exceptionnels_sur_operations_de_gestion() {
		return produits_exceptionnels_sur_operations_de_gestion;
	}

	public void setProduits_exceptionnels_sur_operations_de_gestion(
			String produits_exceptionnels_sur_operations_de_gestion) {
		this.produits_exceptionnels_sur_operations_de_gestion = produits_exceptionnels_sur_operations_de_gestion;
	}

	public String getProduits_exceptionnels_sur_operations_en_capital() {
		return produits_exceptionnels_sur_operations_en_capital;
	}

	public void setProduits_exceptionnels_sur_operations_en_capital(
			String produits_exceptionnels_sur_operations_en_capital) {
		this.produits_exceptionnels_sur_operations_en_capital = produits_exceptionnels_sur_operations_en_capital;
	}

	public String getTotal_des_produits_exceptionnels_vii() {
		return total_des_produits_exceptionnels_vii;
	}

	public void setTotal_des_produits_exceptionnels_vii(String total_des_produits_exceptionnels_vii) {
		this.total_des_produits_exceptionnels_vii = total_des_produits_exceptionnels_vii;
	}

	public String getCharges_exceptionnelles_sur_operations_de_gestion() {
		return charges_exceptionnelles_sur_operations_de_gestion;
	}

	public void setCharges_exceptionnelles_sur_operations_de_gestion(
			String charges_exceptionnelles_sur_operations_de_gestion) {
		this.charges_exceptionnelles_sur_operations_de_gestion = charges_exceptionnelles_sur_operations_de_gestion;
	}

	public String getCharges_exceptionnelles_sur_operations_en_capital() {
		return charges_exceptionnelles_sur_operations_en_capital;
	}

	public void setCharges_exceptionnelles_sur_operations_en_capital(
			String charges_exceptionnelles_sur_operations_en_capital) {
		this.charges_exceptionnelles_sur_operations_en_capital = charges_exceptionnelles_sur_operations_en_capital;
	}

	public String getDotations_exceptionnelles_aux_amortissements_et_provisions() {
		return dotations_exceptionnelles_aux_amortissements_et_provisions;
	}

	public void setDotations_exceptionnelles_aux_amortissements_et_provisions(
			String dotations_exceptionnelles_aux_amortissements_et_provisions) {
		this.dotations_exceptionnelles_aux_amortissements_et_provisions = dotations_exceptionnelles_aux_amortissements_et_provisions;
	}

	public String getTotal_des_charges_exceptionnelles_viii() {
		return total_des_charges_exceptionnelles_viii;
	}

	public void setTotal_des_charges_exceptionnelles_viii(String total_des_charges_exceptionnelles_viii) {
		this.total_des_charges_exceptionnelles_viii = total_des_charges_exceptionnelles_viii;
	}

	public String getResultat_exceptionnel_vii_viii() {
		return resultat_exceptionnel_vii_viii;
	}

	public void setResultat_exceptionnel_vii_viii(String resultat_exceptionnel_vii_viii) {
		this.resultat_exceptionnel_vii_viii = resultat_exceptionnel_vii_viii;
	}

	public String getParticipation_des_salaries_aux_resultats_de_l_entreprise() {
		return participation_des_salaries_aux_resultats_de_l_entreprise;
	}

	public void setParticipation_des_salaries_aux_resultats_de_l_entreprise(
			String participation_des_salaries_aux_resultats_de_l_entreprise) {
		this.participation_des_salaries_aux_resultats_de_l_entreprise = participation_des_salaries_aux_resultats_de_l_entreprise;
	}

	public String getImpots_sur_les_benefices_x() {
		return impots_sur_les_benefices_x;
	}

	public void setImpots_sur_les_benefices_x(String impots_sur_les_benefices_x) {
		this.impots_sur_les_benefices_x = impots_sur_les_benefices_x;
	}

	public String getTotal_des_produits_i_iii_v_vii() {
		return total_des_produits_i_iii_v_vii;
	}

	public void setTotal_des_produits_i_iii_v_vii(String total_des_produits_i_iii_v_vii) {
		this.total_des_produits_i_iii_v_vii = total_des_produits_i_iii_v_vii;
	}

	public String getTotal_des_charges_ii_iv_vi_viii_ix_x() {
		return total_des_charges_ii_iv_vi_viii_ix_x;
	}

	public void setTotal_des_charges_ii_iv_vi_viii_ix_x(String total_des_charges_ii_iv_vi_viii_ix_x) {
		this.total_des_charges_ii_iv_vi_viii_ix_x = total_des_charges_ii_iv_vi_viii_ix_x;
	}

	public String getRenvois_creditbail_mobilier() {
		return renvois_creditbail_mobilier;
	}

	public void setRenvois_creditbail_mobilier(String renvois_creditbail_mobilier) {
		this.renvois_creditbail_mobilier = renvois_creditbail_mobilier;
	}

	public String getRenvois_creditbail_immobilier() {
		return renvois_creditbail_immobilier;
	}

	public void setRenvois_creditbail_immobilier(String renvois_creditbail_immobilier) {
		this.renvois_creditbail_immobilier = renvois_creditbail_immobilier;
	}

	public String getRenvois_transfert_de_charges() {
		return renvois_transfert_de_charges;
	}

	public void setRenvois_transfert_de_charges(String renvois_transfert_de_charges) {
		this.renvois_transfert_de_charges = renvois_transfert_de_charges;
	}

	public String getRenvois_cotisations_personnelles_de_l_exploitant() {
		return renvois_cotisations_personnelles_de_l_exploitant;
	}

	public void setRenvois_cotisations_personnelles_de_l_exploitant(
			String renvois_cotisations_personnelles_de_l_exploitant) {
		this.renvois_cotisations_personnelles_de_l_exploitant = renvois_cotisations_personnelles_de_l_exploitant;
	}

	public String getRenvois_redevances_pour_concessions_de_brevets_de_licences_produits() {
		return renvois_redevances_pour_concessions_de_brevets_de_licences_produits;
	}

	public void setRenvois_redevances_pour_concessions_de_brevets_de_licences_produits(
			String renvois_redevances_pour_concessions_de_brevets_de_licences_produits) {
		this.renvois_redevances_pour_concessions_de_brevets_de_licences_produits = renvois_redevances_pour_concessions_de_brevets_de_licences_produits;
	}

	public String getRenvois_redevances_pour_concessions_de_brevets_de_licences_charges() {
		return renvois_redevances_pour_concessions_de_brevets_de_licences_charges;
	}

	public void setRenvois_redevances_pour_concessions_de_brevets_de_licences_charges(
			String renvois_redevances_pour_concessions_de_brevets_de_licences_charges) {
		this.renvois_redevances_pour_concessions_de_brevets_de_licences_charges = renvois_redevances_pour_concessions_de_brevets_de_licences_charges;
	}

	public String getImmobilisations() {
		return immobilisations;
	}

	public void setImmobilisations(String immobilisations) {
		this.immobilisations = immobilisations;
	}

	public String getAcquisitions_frais_d_etablissement_et_de_developpement_ou_de_recherche() {
		return acquisitions_frais_d_etablissement_et_de_developpement_ou_de_recherche;
	}

	public void setAcquisitions_frais_d_etablissement_et_de_developpement_ou_de_recherche(
			String acquisitions_frais_d_etablissement_et_de_developpement_ou_de_recherche) {
		this.acquisitions_frais_d_etablissement_et_de_developpement_ou_de_recherche = acquisitions_frais_d_etablissement_et_de_developpement_ou_de_recherche;
	}

	public String getAcquisitions_total_dont_autres_postes_d_immobilisations_incorporelles() {
		return acquisitions_total_dont_autres_postes_d_immobilisations_incorporelles;
	}

	public void setAcquisitions_total_dont_autres_postes_d_immobilisations_incorporelles(
			String acquisitions_total_dont_autres_postes_d_immobilisations_incorporelles) {
		this.acquisitions_total_dont_autres_postes_d_immobilisations_incorporelles = acquisitions_total_dont_autres_postes_d_immobilisations_incorporelles;
	}

	public String getAcquisitions_total_immobilisations_corporelles() {
		return acquisitions_total_immobilisations_corporelles;
	}

	public void setAcquisitions_total_immobilisations_corporelles(String acquisitions_total_immobilisations_corporelles) {
		this.acquisitions_total_immobilisations_corporelles = acquisitions_total_immobilisations_corporelles;
	}

	public String getAcquisitions_total_immobilisations_financieres() {
		return acquisitions_total_immobilisations_financieres;
	}

	public void setAcquisitions_total_immobilisations_financieres(String acquisitions_total_immobilisations_financieres) {
		this.acquisitions_total_immobilisations_financieres = acquisitions_total_immobilisations_financieres;
	}

	public String getAcquisitions_total_general() {
		return acquisitions_total_general;
	}

	public void setAcquisitions_total_general(String acquisitions_total_general) {
		this.acquisitions_total_general = acquisitions_total_general;
	}

	public String getDiminutions_frais_d_etablissement_et_de_developpement_ou_de_recherche() {
		return diminutions_frais_d_etablissement_et_de_developpement_ou_de_recherche;
	}

	public void setDiminutions_frais_d_etablissement_et_de_developpement_ou_de_recherche(
			String diminutions_frais_d_etablissement_et_de_developpement_ou_de_recherche) {
		this.diminutions_frais_d_etablissement_et_de_developpement_ou_de_recherche = diminutions_frais_d_etablissement_et_de_developpement_ou_de_recherche;
	}

	public String getDiminutions_total_dont_autres_postes_d_immobilisations_incorporelles() {
		return diminutions_total_dont_autres_postes_d_immobilisations_incorporelles;
	}

	public void setDiminutions_total_dont_autres_postes_d_immobilisations_incorporelles(
			String diminutions_total_dont_autres_postes_d_immobilisations_incorporelles) {
		this.diminutions_total_dont_autres_postes_d_immobilisations_incorporelles = diminutions_total_dont_autres_postes_d_immobilisations_incorporelles;
	}

	public String getDiminutions_virement_postes_immobilisations_corporelles_en_cours() {
		return diminutions_virement_postes_immobilisations_corporelles_en_cours;
	}

	public void setDiminutions_virement_postes_immobilisations_corporelles_en_cours(
			String diminutions_virement_postes_immobilisations_corporelles_en_cours) {
		this.diminutions_virement_postes_immobilisations_corporelles_en_cours = diminutions_virement_postes_immobilisations_corporelles_en_cours;
	}

	public String getDiminutions_virement_postes_avances_et_acomptes() {
		return diminutions_virement_postes_avances_et_acomptes;
	}

	public void setDiminutions_virement_postes_avances_et_acomptes(String diminutions_virement_postes_avances_et_acomptes) {
		this.diminutions_virement_postes_avances_et_acomptes = diminutions_virement_postes_avances_et_acomptes;
	}

	public String getDiminutions_total_immobilisations_corporelles() {
		return diminutions_total_immobilisations_corporelles;
	}

	public void setDiminutions_total_immobilisations_corporelles(String diminutions_total_immobilisations_corporelles) {
		this.diminutions_total_immobilisations_corporelles = diminutions_total_immobilisations_corporelles;
	}

	public String getDiminutions_prets_et_immobilisations_financieres() {
		return diminutions_prets_et_immobilisations_financieres;
	}

	public void setDiminutions_prets_et_immobilisations_financieres(
			String diminutions_prets_et_immobilisations_financieres) {
		this.diminutions_prets_et_immobilisations_financieres = diminutions_prets_et_immobilisations_financieres;
	}

	public String getDiminutions_total_immobilisations_financieres() {
		return diminutions_total_immobilisations_financieres;
	}

	public void setDiminutions_total_immobilisations_financieres(String diminutions_total_immobilisations_financieres) {
		this.diminutions_total_immobilisations_financieres = diminutions_total_immobilisations_financieres;
	}

	public String getDiminutions_total_general() {
		return diminutions_total_general;
	}

	public void setDiminutions_total_general(String diminutions_total_general) {
		this.diminutions_total_general = diminutions_total_general;
	}

	public String getAmortissements() {
		return amortissements;
	}

	public void setAmortissements(String amortissements) {
		this.amortissements = amortissements;
	}

	public String getAmortissements_frais_d_etablissement_et_de_developpement_ou_de_recherche() {
		return amortissements_frais_d_etablissement_et_de_developpement_ou_de_recherche;
	}

	public void setAmortissements_frais_d_etablissement_et_de_developpement_ou_de_recherche(
			String amortissements_frais_d_etablissement_et_de_developpement_ou_de_recherche) {
		this.amortissements_frais_d_etablissement_et_de_developpement_ou_de_recherche = amortissements_frais_d_etablissement_et_de_developpement_ou_de_recherche;
	}

	public String getAmortissements_total_dont_autres_immobilisations_incorporelles() {
		return amortissements_total_dont_autres_immobilisations_incorporelles;
	}

	public void setAmortissements_total_dont_autres_immobilisations_incorporelles(
			String amortissements_total_dont_autres_immobilisations_incorporelles) {
		this.amortissements_total_dont_autres_immobilisations_incorporelles = amortissements_total_dont_autres_immobilisations_incorporelles;
	}

	public String getAmortissements_total_immobilisations_corporelles() {
		return amortissements_total_immobilisations_corporelles;
	}

	public void setAmortissements_total_immobilisations_corporelles(
			String amortissements_total_immobilisations_corporelles) {
		this.amortissements_total_immobilisations_corporelles = amortissements_total_immobilisations_corporelles;
	}

	public String getAmortissements_total_general() {
		return amortissements_total_general;
	}

	public void setAmortissements_total_general(String amortissements_total_general) {
		this.amortissements_total_general = amortissements_total_general;
	}

	public String getMvt_sur_charges_rep_primes_de_remboursement_des_obligations() {
		return mvt_sur_charges_rep_primes_de_remboursement_des_obligations;
	}

	public void setMvt_sur_charges_rep_primes_de_remboursement_des_obligations(
			String mvt_sur_charges_rep_primes_de_remboursement_des_obligations) {
		this.mvt_sur_charges_rep_primes_de_remboursement_des_obligations = mvt_sur_charges_rep_primes_de_remboursement_des_obligations;
	}

	public String getProvisions() {
		return provisions;
	}

	public void setProvisions(String provisions) {
		this.provisions = provisions;
	}

	public String getAmortissements_derogatoires() {
		return amortissements_derogatoires;
	}

	public void setAmortissements_derogatoires(String amortissements_derogatoires) {
		this.amortissements_derogatoires = amortissements_derogatoires;
	}

	public String getTotal_provisions_reglementees() {
		return total_provisions_reglementees;
	}

	public void setTotal_provisions_reglementees(String total_provisions_reglementees) {
		this.total_provisions_reglementees = total_provisions_reglementees;
	}

	public String getProvisions_pour_litiges() {
		return provisions_pour_litiges;
	}

	public void setProvisions_pour_litiges(String provisions_pour_litiges) {
		this.provisions_pour_litiges = provisions_pour_litiges;
	}

	public String getProvisions_pour_garanties_donnees_aux_clients() {
		return provisions_pour_garanties_donnees_aux_clients;
	}

	public void setProvisions_pour_garanties_donnees_aux_clients(String provisions_pour_garanties_donnees_aux_clients) {
		this.provisions_pour_garanties_donnees_aux_clients = provisions_pour_garanties_donnees_aux_clients;
	}

	public String getProvisions_pour_perte_sur_marches_a_terme() {
		return provisions_pour_perte_sur_marches_a_terme;
	}

	public void setProvisions_pour_perte_sur_marches_a_terme(String provisions_pour_perte_sur_marches_a_terme) {
		this.provisions_pour_perte_sur_marches_a_terme = provisions_pour_perte_sur_marches_a_terme;
	}

	public String getProvisions_pour_amendes_et_penalites() {
		return provisions_pour_amendes_et_penalites;
	}

	public void setProvisions_pour_amendes_et_penalites(String provisions_pour_amendes_et_penalites) {
		this.provisions_pour_amendes_et_penalites = provisions_pour_amendes_et_penalites;
	}

	public String getProvisions_pour_perte_de_change() {
		return provisions_pour_perte_de_change;
	}

	public void setProvisions_pour_perte_de_change(String provisions_pour_perte_de_change) {
		this.provisions_pour_perte_de_change = provisions_pour_perte_de_change;
	}

	public String getProvisions_pour_pensions_et_obligations_similaires() {
		return provisions_pour_pensions_et_obligations_similaires;
	}

	public void setProvisions_pour_pensions_et_obligations_similaires(
			String provisions_pour_pensions_et_obligations_similaires) {
		this.provisions_pour_pensions_et_obligations_similaires = provisions_pour_pensions_et_obligations_similaires;
	}

	public String getProvisions_pour_impots() {
		return provisions_pour_impots;
	}

	public void setProvisions_pour_impots(String provisions_pour_impots) {
		this.provisions_pour_impots = provisions_pour_impots;
	}

	public String getProvisions_pour_renouvellement_des_immobilisations() {
		return provisions_pour_renouvellement_des_immobilisations;
	}

	public void setProvisions_pour_renouvellement_des_immobilisations(
			String provisions_pour_renouvellement_des_immobilisations) {
		this.provisions_pour_renouvellement_des_immobilisations = provisions_pour_renouvellement_des_immobilisations;
	}

	public String getProvisions_pour_gros_entretien_et_grandes_revisions_ou_grosses_reparations() {
		return provisions_pour_gros_entretien_et_grandes_revisions_ou_grosses_reparations;
	}

	public void setProvisions_pour_gros_entretien_et_grandes_revisions_ou_grosses_reparations(
			String provisions_pour_gros_entretien_et_grandes_revisions_ou_grosses_reparations) {
		this.provisions_pour_gros_entretien_et_grandes_revisions_ou_grosses_reparations = provisions_pour_gros_entretien_et_grandes_revisions_ou_grosses_reparations;
	}

	public String getProvisions_pour_charges_sociales_et_fiscales_sur_conges_a_payer() {
		return provisions_pour_charges_sociales_et_fiscales_sur_conges_a_payer;
	}

	public void setProvisions_pour_charges_sociales_et_fiscales_sur_conges_a_payer(
			String provisions_pour_charges_sociales_et_fiscales_sur_conges_a_payer) {
		this.provisions_pour_charges_sociales_et_fiscales_sur_conges_a_payer = provisions_pour_charges_sociales_et_fiscales_sur_conges_a_payer;
	}

	public String getAutres_provisions_pour_risques_et_charges() {
		return autres_provisions_pour_risques_et_charges;
	}

	public void setAutres_provisions_pour_risques_et_charges(String autres_provisions_pour_risques_et_charges) {
		this.autres_provisions_pour_risques_et_charges = autres_provisions_pour_risques_et_charges;
	}

	public String getTotal_provisions_pour_risques_et_charges() {
		return total_provisions_pour_risques_et_charges;
	}

	public void setTotal_provisions_pour_risques_et_charges(String total_provisions_pour_risques_et_charges) {
		this.total_provisions_pour_risques_et_charges = total_provisions_pour_risques_et_charges;
	}

	public String getSur_immobilisations_incorporelles() {
		return sur_immobilisations_incorporelles;
	}

	public void setSur_immobilisations_incorporelles(String sur_immobilisations_incorporelles) {
		this.sur_immobilisations_incorporelles = sur_immobilisations_incorporelles;
	}

	public String getSur_immobilisations_corporelles() {
		return sur_immobilisations_corporelles;
	}

	public void setSur_immobilisations_corporelles(String sur_immobilisations_corporelles) {
		this.sur_immobilisations_corporelles = sur_immobilisations_corporelles;
	}

	public String getSur_immobilisations_titres_mis_en_equivalence() {
		return sur_immobilisations_titres_mis_en_equivalence;
	}

	public void setSur_immobilisations_titres_mis_en_equivalence(String sur_immobilisations_titres_mis_en_equivalence) {
		this.sur_immobilisations_titres_mis_en_equivalence = sur_immobilisations_titres_mis_en_equivalence;
	}

	public String getSur_immobilisations_titres_de_participation() {
		return sur_immobilisations_titres_de_participation;
	}

	public void setSur_immobilisations_titres_de_participation(String sur_immobilisations_titres_de_participation) {
		this.sur_immobilisations_titres_de_participation = sur_immobilisations_titres_de_participation;
	}

	public String getSur_immobilisations_autres_immobilisations_financieres() {
		return sur_immobilisations_autres_immobilisations_financieres;
	}

	public void setSur_immobilisations_autres_immobilisations_financieres(
			String sur_immobilisations_autres_immobilisations_financieres) {
		this.sur_immobilisations_autres_immobilisations_financieres = sur_immobilisations_autres_immobilisations_financieres;
	}

	public String getSur_stocks_et_en_cours() {
		return sur_stocks_et_en_cours;
	}

	public void setSur_stocks_et_en_cours(String sur_stocks_et_en_cours) {
		this.sur_stocks_et_en_cours = sur_stocks_et_en_cours;
	}

	public String getSur_comptes_clients() {
		return sur_comptes_clients;
	}

	public void setSur_comptes_clients(String sur_comptes_clients) {
		this.sur_comptes_clients = sur_comptes_clients;
	}

	public String getAutres_provisions_pour_depreciation() {
		return autres_provisions_pour_depreciation;
	}

	public void setAutres_provisions_pour_depreciation(String autres_provisions_pour_depreciation) {
		this.autres_provisions_pour_depreciation = autres_provisions_pour_depreciation;
	}

	public String getTotal_provisions_pour_depreciation() {
		return total_provisions_pour_depreciation;
	}

	public void setTotal_provisions_pour_depreciation(String total_provisions_pour_depreciation) {
		this.total_provisions_pour_depreciation = total_provisions_pour_depreciation;
	}

	public String getTotal_general() {
		return total_general;
	}

	public void setTotal_general(String total_general) {
		this.total_general = total_general;
	}

	public String getDont_dotations_et_reprises_d_exploitation() {
		return dont_dotations_et_reprises_d_exploitation;
	}

	public void setDont_dotations_et_reprises_d_exploitation(String dont_dotations_et_reprises_d_exploitation) {
		this.dont_dotations_et_reprises_d_exploitation = dont_dotations_et_reprises_d_exploitation;
	}

	public String getDont_dotations_et_reprises_financieres() {
		return dont_dotations_et_reprises_financieres;
	}

	public void setDont_dotations_et_reprises_financieres(String dont_dotations_et_reprises_financieres) {
		this.dont_dotations_et_reprises_financieres = dont_dotations_et_reprises_financieres;
	}

	public String getDont_dotations_et_reprises_exceptionnelles() {
		return dont_dotations_et_reprises_exceptionnelles;
	}

	public void setDont_dotations_et_reprises_exceptionnelles(String dont_dotations_et_reprises_exceptionnelles) {
		this.dont_dotations_et_reprises_exceptionnelles = dont_dotations_et_reprises_exceptionnelles;
	}

	public String getCreances_et_dettes() {
		return creances_et_dettes;
	}

	public void setCreances_et_dettes(String creances_et_dettes) {
		this.creances_et_dettes = creances_et_dettes;
	}

	public String getClients_douteux_ou_litigieux() {
		return clients_douteux_ou_litigieux;
	}

	public void setClients_douteux_ou_litigieux(String clients_douteux_ou_litigieux) {
		this.clients_douteux_ou_litigieux = clients_douteux_ou_litigieux;
	}

	public String getAutres_creances_clients() {
		return autres_creances_clients;
	}

	public void setAutres_creances_clients(String autres_creances_clients) {
		this.autres_creances_clients = autres_creances_clients;
	}

	public String getProvision_pour_depreciation_anterieurement_constituee() {
		return provision_pour_depreciation_anterieurement_constituee;
	}

	public void setProvision_pour_depreciation_anterieurement_constituee(
			String provision_pour_depreciation_anterieurement_constituee) {
		this.provision_pour_depreciation_anterieurement_constituee = provision_pour_depreciation_anterieurement_constituee;
	}

	public String getCreances_representatives_de_titres_pretes() {
		return creances_representatives_de_titres_pretes;
	}

	public void setCreances_representatives_de_titres_pretes(String creances_representatives_de_titres_pretes) {
		this.creances_representatives_de_titres_pretes = creances_representatives_de_titres_pretes;
	}

	public String getPersonnel_et_comptes_rattaches() {
		return personnel_et_comptes_rattaches;
	}

	public void setPersonnel_et_comptes_rattaches(String personnel_et_comptes_rattaches) {
		this.personnel_et_comptes_rattaches = personnel_et_comptes_rattaches;
	}

	public String getSecurite_sociale_autres_organismes_sociaux() {
		return securite_sociale_autres_organismes_sociaux;
	}

	public void setSecurite_sociale_autres_organismes_sociaux(String securite_sociale_autres_organismes_sociaux) {
		this.securite_sociale_autres_organismes_sociaux = securite_sociale_autres_organismes_sociaux;
	}

	public String getImpots_sur_les_benefices() {
		return impots_sur_les_benefices;
	}

	public void setImpots_sur_les_benefices(String impots_sur_les_benefices) {
		this.impots_sur_les_benefices = impots_sur_les_benefices;
	}

	public String getT_v_a() {
		return t_v_a;
	}

	public void setT_v_a(String t_v_a) {
		this.t_v_a = t_v_a;
	}

	public String getAutres_impots_taxes_versements_assimiles() {
		return autres_impots_taxes_versements_assimiles;
	}

	public void setAutres_impots_taxes_versements_assimiles(String autres_impots_taxes_versements_assimiles) {
		this.autres_impots_taxes_versements_assimiles = autres_impots_taxes_versements_assimiles;
	}

	public String getDivers() {
		return divers;
	}

	public void setDivers(String divers) {
		this.divers = divers;
	}

	public String getGroupe_et_associes() {
		return groupe_et_associes;
	}

	public void setGroupe_et_associes(String groupe_et_associes) {
		this.groupe_et_associes = groupe_et_associes;
	}

	public String getDebiteurs_divers_dont_creances_relatives_a_des_operations_de_pension_de_titres() {
		return debiteurs_divers_dont_creances_relatives_a_des_operations_de_pension_de_titres;
	}

	public void setDebiteurs_divers_dont_creances_relatives_a_des_operations_de_pension_de_titres(
			String debiteurs_divers_dont_creances_relatives_a_des_operations_de_pension_de_titres) {
		this.debiteurs_divers_dont_creances_relatives_a_des_operations_de_pension_de_titres = debiteurs_divers_dont_creances_relatives_a_des_operations_de_pension_de_titres;
	}

	public String getTotal_etat_des_creances() {
		return total_etat_des_creances;
	}

	public void setTotal_etat_des_creances(String total_etat_des_creances) {
		this.total_etat_des_creances = total_etat_des_creances;
	}

	public String getEmprunts_obligataires_convertibles_brut_a_un_an_au_plus() {
		return emprunts_obligataires_convertibles_brut_a_un_an_au_plus;
	}

	public void setEmprunts_obligataires_convertibles_brut_a_un_an_au_plus(
			String emprunts_obligataires_convertibles_brut_a_un_an_au_plus) {
		this.emprunts_obligataires_convertibles_brut_a_un_an_au_plus = emprunts_obligataires_convertibles_brut_a_un_an_au_plus;
	}

	public String getAutres_emprunts_obligataires_brut_a_un_an_au_plus() {
		return autres_emprunts_obligataires_brut_a_un_an_au_plus;
	}

	public void setAutres_emprunts_obligataires_brut_a_un_an_au_plus(
			String autres_emprunts_obligataires_brut_a_un_an_au_plus) {
		this.autres_emprunts_obligataires_brut_a_un_an_au_plus = autres_emprunts_obligataires_brut_a_un_an_au_plus;
	}

	public String getEmprunts_a_1_an_maximum_a_l_origine() {
		return emprunts_a_1_an_maximum_a_l_origine;
	}

	public void setEmprunts_a_1_an_maximum_a_l_origine(String emprunts_a_1_an_maximum_a_l_origine) {
		this.emprunts_a_1_an_maximum_a_l_origine = emprunts_a_1_an_maximum_a_l_origine;
	}

	public String getEmprunts_a_plus_d_1_an_a_l_origine() {
		return emprunts_a_plus_d_1_an_a_l_origine;
	}

	public void setEmprunts_a_plus_d_1_an_a_l_origine(String emprunts_a_plus_d_1_an_a_l_origine) {
		this.emprunts_a_plus_d_1_an_a_l_origine = emprunts_a_plus_d_1_an_a_l_origine;
	}

	public String getEmprunts_et_dettes_financieres_divers() {
		return emprunts_et_dettes_financieres_divers;
	}

	public void setEmprunts_et_dettes_financieres_divers(String emprunts_et_dettes_financieres_divers) {
		this.emprunts_et_dettes_financieres_divers = emprunts_et_dettes_financieres_divers;
	}

	public String getFournisseurs_et_comptes_rattaches() {
		return fournisseurs_et_comptes_rattaches;
	}

	public void setFournisseurs_et_comptes_rattaches(String fournisseurs_et_comptes_rattaches) {
		this.fournisseurs_et_comptes_rattaches = fournisseurs_et_comptes_rattaches;
	}

	public String getSecurite_sociale_et_autres_organismes_sociaux() {
		return securite_sociale_et_autres_organismes_sociaux;
	}

	public void setSecurite_sociale_et_autres_organismes_sociaux(String securite_sociale_et_autres_organismes_sociaux) {
		this.securite_sociale_et_autres_organismes_sociaux = securite_sociale_et_autres_organismes_sociaux;
	}

	public String getTva() {
		return tva;
	}

	public void setTva(String tva) {
		this.tva = tva;
	}

	public String getObligations_cautionnees() {
		return obligations_cautionnees;
	}

	public void setObligations_cautionnees(String obligations_cautionnees) {
		this.obligations_cautionnees = obligations_cautionnees;
	}

	public String getAutres_impots_taxes_et_assimiles() {
		return autres_impots_taxes_et_assimiles;
	}

	public void setAutres_impots_taxes_et_assimiles(String autres_impots_taxes_et_assimiles) {
		this.autres_impots_taxes_et_assimiles = autres_impots_taxes_et_assimiles;
	}

	public String getAutres_dettes_dont_dettes_relatives_a_des_operations_de_pension_de_titre() {
		return autres_dettes_dont_dettes_relatives_a_des_operations_de_pension_de_titre;
	}

	public void setAutres_dettes_dont_dettes_relatives_a_des_operations_de_pension_de_titre(
			String autres_dettes_dont_dettes_relatives_a_des_operations_de_pension_de_titre) {
		this.autres_dettes_dont_dettes_relatives_a_des_operations_de_pension_de_titre = autres_dettes_dont_dettes_relatives_a_des_operations_de_pension_de_titre;
	}

	public String getDette_representative_de_titres_empruntes() {
		return dette_representative_de_titres_empruntes;
	}

	public void setDette_representative_de_titres_empruntes(String dette_representative_de_titres_empruntes) {
		this.dette_representative_de_titres_empruntes = dette_representative_de_titres_empruntes;
	}

	public String getProduits_constates_d_avance() {
		return produits_constates_d_avance;
	}

	public void setProduits_constates_d_avance(String produits_constates_d_avance) {
		this.produits_constates_d_avance = produits_constates_d_avance;
	}

	public String getTotal_etat_des_dettes() {
		return total_etat_des_dettes;
	}

	public void setTotal_etat_des_dettes(String total_etat_des_dettes) {
		this.total_etat_des_dettes = total_etat_des_dettes;
	}

	public String getEmprunts_souscrits_en_cours_d_exercice() {
		return emprunts_souscrits_en_cours_d_exercice;
	}

	public void setEmprunts_souscrits_en_cours_d_exercice(String emprunts_souscrits_en_cours_d_exercice) {
		this.emprunts_souscrits_en_cours_d_exercice = emprunts_souscrits_en_cours_d_exercice;
	}

	public String getEmprunts_rembourses_en_cours_d_exercice() {
		return emprunts_rembourses_en_cours_d_exercice;
	}

	public void setEmprunts_rembourses_en_cours_d_exercice(String emprunts_rembourses_en_cours_d_exercice) {
		this.emprunts_rembourses_en_cours_d_exercice = emprunts_rembourses_en_cours_d_exercice;
	}

	public String getAffectation_du_resultat_renseignements_divers() {
		return affectation_du_resultat_renseignements_divers;
	}

	public void setAffectation_du_resultat_renseignements_divers(String affectation_du_resultat_renseignements_divers) {
		this.affectation_du_resultat_renseignements_divers = affectation_du_resultat_renseignements_divers;
	}

	public String getDividendes() {
		return dividendes;
	}

	public void setDividendes(String dividendes) {
		this.dividendes = dividendes;
	}

	public String getEngagement_de_creditbail_mobilier() {
		return engagement_de_creditbail_mobilier;
	}

	public void setEngagement_de_creditbail_mobilier(String engagement_de_creditbail_mobilier) {
		this.engagement_de_creditbail_mobilier = engagement_de_creditbail_mobilier;
	}

	public String getEngagement_de_creditbail_immobilier() {
		return engagement_de_creditbail_immobilier;
	}

	public void setEngagement_de_creditbail_immobilier(String engagement_de_creditbail_immobilier) {
		this.engagement_de_creditbail_immobilier = engagement_de_creditbail_immobilier;
	}

	public String getEffets_portes_a_l_escompte_et_non_echus() {
		return effets_portes_a_l_escompte_et_non_echus;
	}

	public void setEffets_portes_a_l_escompte_et_non_echus(String effets_portes_a_l_escompte_et_non_echus) {
		this.effets_portes_a_l_escompte_et_non_echus = effets_portes_a_l_escompte_et_non_echus;
	}

	public String getSoustraitance() {
		return soustraitance;
	}

	public void setSoustraitance(String soustraitance) {
		this.soustraitance = soustraitance;
	}

	public String getLocation_charges_locatives_et_de_copropriete() {
		return location_charges_locatives_et_de_copropriete;
	}

	public void setLocation_charges_locatives_et_de_copropriete(String location_charges_locatives_et_de_copropriete) {
		this.location_charges_locatives_et_de_copropriete = location_charges_locatives_et_de_copropriete;
	}

	public String getPersonnel_exterieur_a_l_entreprise() {
		return personnel_exterieur_a_l_entreprise;
	}

	public void setPersonnel_exterieur_a_l_entreprise(String personnel_exterieur_a_l_entreprise) {
		this.personnel_exterieur_a_l_entreprise = personnel_exterieur_a_l_entreprise;
	}

	public String getRemuneration_d_intermediaires_et_honoraires_hors_retrocessions() {
		return remuneration_d_intermediaires_et_honoraires_hors_retrocessions;
	}

	public void setRemuneration_d_intermediaires_et_honoraires_hors_retrocessions(
			String remuneration_d_intermediaires_et_honoraires_hors_retrocessions) {
		this.remuneration_d_intermediaires_et_honoraires_hors_retrocessions = remuneration_d_intermediaires_et_honoraires_hors_retrocessions;
	}

	public String getRetrocessions_d_honoraires_commissions_et_courtages() {
		return retrocessions_d_honoraires_commissions_et_courtages;
	}

	public void setRetrocessions_d_honoraires_commissions_et_courtages(
			String retrocessions_d_honoraires_commissions_et_courtages) {
		this.retrocessions_d_honoraires_commissions_et_courtages = retrocessions_d_honoraires_commissions_et_courtages;
	}

	public String getAutres_comptes() {
		return autres_comptes;
	}

	public void setAutres_comptes(String autres_comptes) {
		this.autres_comptes = autres_comptes;
	}

	public String getTotal_du_poste_correspondant_a_la_ligne_fw_du_tableau_numero_2052() {
		return total_du_poste_correspondant_a_la_ligne_fw_du_tableau_numero_2052;
	}

	public void setTotal_du_poste_correspondant_a_la_ligne_fw_du_tableau_numero_2052(
			String total_du_poste_correspondant_a_la_ligne_fw_du_tableau_numero_2052) {
		this.total_du_poste_correspondant_a_la_ligne_fw_du_tableau_numero_2052 = total_du_poste_correspondant_a_la_ligne_fw_du_tableau_numero_2052;
	}

	public String getTaxe_professionnelle() {
		return taxe_professionnelle;
	}

	public void setTaxe_professionnelle(String taxe_professionnelle) {
		this.taxe_professionnelle = taxe_professionnelle;
	}

	public String getAutres_impots_taxes_et_versements_assimiles() {
		return autres_impots_taxes_et_versements_assimiles;
	}

	public void setAutres_impots_taxes_et_versements_assimiles(String autres_impots_taxes_et_versements_assimiles) {
		this.autres_impots_taxes_et_versements_assimiles = autres_impots_taxes_et_versements_assimiles;
	}

	public String getTotal_du_compte_correspondant_a_la_ligne_fx_du_tableau_numero_2052() {
		return total_du_compte_correspondant_a_la_ligne_fx_du_tableau_numero_2052;
	}

	public void setTotal_du_compte_correspondant_a_la_ligne_fx_du_tableau_numero_2052(
			String total_du_compte_correspondant_a_la_ligne_fx_du_tableau_numero_2052) {
		this.total_du_compte_correspondant_a_la_ligne_fx_du_tableau_numero_2052 = total_du_compte_correspondant_a_la_ligne_fx_du_tableau_numero_2052;
	}

	public String getMontant_de_la_tva_collectee() {
		return montant_de_la_tva_collectee;
	}

	public void setMontant_de_la_tva_collectee(String montant_de_la_tva_collectee) {
		this.montant_de_la_tva_collectee = montant_de_la_tva_collectee;
	}

	public String getTotal_tva_deductible_sur_biens_et_services() {
		return total_tva_deductible_sur_biens_et_services;
	}

	public void setTotal_tva_deductible_sur_biens_et_services(String total_tva_deductible_sur_biens_et_services) {
		this.total_tva_deductible_sur_biens_et_services = total_tva_deductible_sur_biens_et_services;
	}

	public String getEffectif_moyen_du_personnel() {
		return effectif_moyen_du_personnel;
	}

	public void setEffectif_moyen_du_personnel(String effectif_moyen_du_personnel) {
		this.effectif_moyen_du_personnel = effectif_moyen_du_personnel;
	}

	public String getFiliales_et_participations() {
		return filiales_et_participations;
	}

	public void setFiliales_et_participations(String filiales_et_participations) {
		this.filiales_et_participations = filiales_et_participations;
	}

	

}
