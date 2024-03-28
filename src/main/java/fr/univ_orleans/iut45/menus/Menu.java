package fr.univ_orleans.iut45.menus;

import java.util.List;

class Menu {
    protected List<Plat> entrees;
    protected List<Plat> plats_principaux;
    protected List<Plat> desserts;

    public Menu(List<Plat> entrees,
                List<Plat> plats_principaux,
                List<Plat> desserts) {
        this.entrees = entrees;
        this.plats_principaux = plats_principaux;
        this.desserts = desserts;
    }

    public List<Plat> getEntrees() {
        return this.entrees;
    }

    public List<Plat> getPlatsPrincipaux() {
        return this.plats_principaux;
    }

    public List<Plat> getDesserts() {
        return this.desserts;
    }

    public boolean estComplet(){
        if(this.entrees.size()==0 || this.plats_principaux.size()==0 || this.desserts.size()==0)
            return false;
        return true;
    }

// Question 8 Prix de revient min et max

    public double prixRevientMin(){
        double prixentree = 999999.0;
        double prixplat = 999999.0;
        double prixdessert = 999999.0;
        if (entrees.size()==0) prixentree = 0;
        else for(Plat entreeL : entrees){
            if (entreeL.prix_de_revient < prixentree)
                prixentree = entreeL.prix_de_revient;
        }
        if (plats_principaux.size()==0) prixplat = 0;
        else for(Plat platL : plats_principaux){
            if (platL.prix_de_revient < prixentree)
                prixentree = platL.prix_de_revient;
        }
        if (desserts.size()==0) prixdessert = 0;
        else for(Plat dessertL : desserts){
            if (dessertL.prix_de_revient < prixentree)
                prixentree = dessertL.prix_de_revient;
        }
        return prixdessert+prixplat+prixentree;
    }

    public double prixRevientMax(){
        double prixentree = 0.0;
        double prixplat = 0.0;
        double prixdessert = 0.0;
        for(Plat entreeL : entrees){
            if (entreeL.prix_de_revient > prixentree)
                prixentree = entreeL.prix_de_revient;
        }
        for(Plat platL : plats_principaux){
            if (platL.prix_de_revient > prixentree)
                prixentree = platL.prix_de_revient;
        }
        for(Plat dessertL : desserts){
            if (dessertL.prix_de_revient > prixentree)
                prixentree = dessertL.prix_de_revient;
        }
        return prixdessert+prixplat+prixentree;
    }
}
