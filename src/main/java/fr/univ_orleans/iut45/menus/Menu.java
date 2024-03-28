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
}
