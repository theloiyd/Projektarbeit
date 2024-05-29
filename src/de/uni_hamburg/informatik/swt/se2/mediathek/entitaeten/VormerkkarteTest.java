//package de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten;
//
//import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.CD;
//import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.Medium;
//import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Datum;
//import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Geldbetrag;
//import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Kundennummer;
//import org.junit.Test;
//
//import java.util.concurrent.LinkedBlockingQueue;
//
//import static org.junit.Assert.*;
//import static org.junit.Assert.assertNotSame;
//
///**
// * Test für Vormerkkarte
// */
//public class VormerkkarteTest
//{
//    private Medium _medium;
//    private Kunde _kunde1;
//    private Kunde _kunde2;
//    private Kunde _kunde3;
//    private Kunde _kunde4;
//    private Vormerkkarte vormerkkarte;
//
//    public VormerkkarteTest()
//    {
//        // Initialisiere ein Medium und Kunden
//        _medium = new CD("bar", "baz", "foo", 123);
//        _kunde1 = new Kunde(new Kundennummer(1234), "Max", "Mustermann");
//        _kunde2 = new Kunde(new Kundennummer(2345), "Leo", "Schmidt");
//        _kunde3 = new Kunde(new Kundennummer(3456), "Emilio", "Boldt");
//        _kunde4 = new Kunde(new Kundennummer(4567), "Lena", "Maier");
//
//        vormerkkarte = new Vormerkkarte(_medium);
//    }
//
//    @Test
//    public  get_vormerker1()
//    {
//
//    }
//    @Test
//    public void testaddVormerker()
//    {
//        vormerkkarte.addVormerker(_kunde1);
//        assertEquals(_kunde1, vormerkkarte.get_vormerker1());
//
//        vormerkkarte.addVormerker(_kunde2);
//        assertEquals(_kunde2, vormerkkarte.get_vormerker2());
//
//        vormerkkarte.addVormerker(_kunde3);
//        assertEquals(_kunde3, vormerkkarte.get_vormerker3());
//    }
//
//
//
//    @Test
//    public String testalleVormerker()
//    {
//
//    }
//
//    @Test
//    public Medium testGetMedium()
//    {
//      assertEquals(_kunde3, vormerkkarte.get_vormerker3());
//        return vormerkkarte.getMedium(medium);
//    }
//}