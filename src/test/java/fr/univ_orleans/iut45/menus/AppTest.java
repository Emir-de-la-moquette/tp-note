package fr.univ_orleans.iut45.menus;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class AppTest
{
    @Test
    public void testPrixPlats()
    {
        Plat carottes_rapees = new Plat("Carottes Rapées", false, new ArrayList<String>(), 0.5);
        ArrayList<String> allergenes_pb = new ArrayList<String>();
        allergenes_pb.add("gluten");
        allergenes_pb.add("fruits à coque");
        Plat paris_brest = new Plat ("Paris-Brest", false, allergenes_pb, 2.5);
        assertTrue(carottes_rapees.prixDeRevient() < paris_brest.prixDeRevient());
    }

    @Test
    public void testListeEntrees()
    {
        Plat carottes_rapees = new Plat("Carottes Rapées", false, new ArrayList<String>(), 0.5);
        ArrayList<Plat> les_entrees = new ArrayList<Plat>();
        les_entrees.add(carottes_rapees);
        Menu ce_midi = new Menu(les_entrees, new ArrayList<Plat>(), new ArrayList<Plat>());
        assertEquals(1, ce_midi.getEntrees().size());
    }

    @Test
    public void testMenuComplet()
    {
        Plat carottes_rapees = new Plat("Carottes Rapées", false, new ArrayList<String>(), 0.5);
        ArrayList<Plat> les_entrees = new ArrayList<Plat>();
        les_entrees.add(carottes_rapees);
        Menu ce_midi = new Menu(les_entrees, new ArrayList<Plat>(), new ArrayList<Plat>());
        assertEquals(false, ce_midi.estComplet());

        ArrayList<String> allergenes_pb = new ArrayList<String>();
        allergenes_pb.add("gluten");
        allergenes_pb.add("fruits à coque");
        Plat paris_brest = new Plat ("Paris-Brest", false, allergenes_pb, 2.5);
        ArrayList<Plat> les_desserts = new ArrayList<Plat>();
        les_desserts.add(paris_brest);

        ArrayList<String> allergenes_lasagnes = new ArrayList<String>();
        ArrayList<String> allergenes_tortilla = new ArrayList<String>();
        allergenes_lasagnes.add("gluten");
        allergenes_tortilla.add("oeufs");
        Plat lasagnes = new Plat("Lasagnes", true, allergenes_lasagnes, 2.8);
        Plat tortilla = new Plat("Tortilla", false, allergenes_tortilla, 1.8);
        ArrayList<Plat> les_plats_principaux = new ArrayList<Plat>();
        les_plats_principaux.add(lasagnes);
        les_plats_principaux.add(tortilla);
        Menu ce_soir = new Menu(les_entrees, les_plats_principaux, les_desserts);
        assertTrue(ce_soir.estComplet());

    }


// TEST PRIX DE REVIENT QUESTION 8
@Test
    public void testPrixMinMaxMenu()
    {
        Plat carottes_rapees = new Plat("Carottes Rapées", false, new ArrayList<String>(), 0.5);
        Plat acier = new Plat("acier", false, new ArrayList<String>(), 69.5);
        Plat choux = new Plat("choux", false, new ArrayList<String>(), 1.5);
        Plat charcuterie = new Plat("charcuterie", true, new ArrayList<String>(), 7.5);

        Plat pouletCurry = new Plat("Poulet au Curry", true, new ArrayList<String>(), 12.00);
        Plat saladeNicoise = new Plat("Salade Niçoise", false, new ArrayList<String>(), 10.5);
        Plat risottoFruitsMer = new Plat("Risotto aux Fruits de Mer", false, new ArrayList<String>(), 15.50);
        Plat lasagnesVegetariennes = new Plat("Lasagnes Végétariennes", false, new ArrayList<String>(), 11.25);
        Plat tajineAgneauPruneaux = new Plat("Tajine d'Agneau aux Pruneaux", false, new ArrayList<String>(), 14.00);
        Plat pizzaQuatreFromages = new Plat("Pizza Quatre Fromages", true, new ArrayList<String>(), 9.99);
        Plat sushiAssortis = new Plat("Sushi Assortis", true, new ArrayList<String>(), 18.50);
        Plat soupePoisson = new Plat("Soupe de Poisson", false, new ArrayList<String>(), 8.25);
        Plat gratinPommesTerre = new Plat("Gratin de Pommes de Terre", false, new ArrayList<String>(), 9.5);
        Plat penneArrabiata = new Plat("Penne Arrabiata", false, new ArrayList<String>(), 10.20);

        Plat fondantChocolat = new Plat("Fondant au Chocolat", false, new ArrayList<String>(), 8.00);
        Plat crèmeBrûlée = new Plat("Crème Brûlée", false, new ArrayList<String>(), 7.50);
        Plat tarteFruitsRouges = new Plat("Tarte aux Fruits Rouges", false, new ArrayList<String>(), 10.5);
        Plat mousseMangue = new Plat("Mousse à la Mangue", false, new ArrayList<String>(), 6.5);
        Plat crumblePommes = new Plat("Crumble aux Pommes", false, new ArrayList<String>(), 9.5);



        ArrayList<Plat> les_entrees_midi = new ArrayList<Plat>();
        ArrayList<Plat> les_plats_midi = new ArrayList<Plat>();
        ArrayList<Plat> les_desserts_midi = new ArrayList<Plat>();

        les_entrees_midi.add(carottes_rapees); 
        les_entrees_midi.add(choux); 
        les_plats_midi.add(risottoFruitsMer);
        les_plats_midi.add(tajineAgneauPruneaux);
        les_desserts_midi.add(crumblePommes);
        les_desserts_midi.add(tarteFruitsRouges);
        les_desserts_midi.add(mousseMangue);

        Menu ce_midi = new Menu(les_entrees_midi,  les_plats_midi, les_desserts_midi);

        ArrayList<Plat> les_entrees_soir = new ArrayList<Plat>();
        ArrayList<Plat> les_plats_soir = new ArrayList<Plat>();
        ArrayList<Plat> les_desserts_soir = new ArrayList<Plat>();

        les_entrees_soir.add(acier);
        les_entrees_soir.add(charcuterie);
        les_plats_soir.add(pouletCurry);
        les_plats_soir.add(tajineAgneauPruneaux);
        les_plats_soir.add(gratinPommesTerre);
        les_plats_soir.add(lasagnesVegetariennes);
        les_desserts_soir.add(crumblePommes);
        les_desserts_soir.add(crèmeBrûlée);
        les_desserts_soir.add(fondantChocolat);

        Menu ce_soir = new Menu(les_entrees_soir,  les_plats_soir, les_desserts_soir);


        assertEquals(17.5, ce_midi.prixRevientMin());
        assertEquals(26.0, ce_midi.prixRevientMax());
        assertEquals(24.5, ce_soir.prixRevientMin());
        assertEquals(93.0, ce_midi.prixRevientMax());
    }
}
