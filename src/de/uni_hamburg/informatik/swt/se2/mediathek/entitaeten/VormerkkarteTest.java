package de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten;

import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.CD;
import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.Medium;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Datum;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Geldbetrag;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Kundennummer;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotSame;

/**
 * Test für Vormerkkarte
 */
public class VormerkkarteTest
{
    private Medium _medium;
    private Kunde _kunde1;
    private Kunde _kunde2;
    private Kunde _kunde3;
    private Kunde _kunde4;
    private Vormerkkarte vormerkkarte;

    public VormerkkarteTest()
    {
        // Initialisiere ein Medium und Kunden
        _medium = new CD("bar", "baz", "foo", 123);
        _kunde1 = new Kunde(new Kundennummer(123445), "Max", "Mustermann");
        _kunde2 = new Kunde(new Kundennummer(234545), "Leo", "Schmidt");
        _kunde3 = new Kunde(new Kundennummer(345645), "Emilio", "Boldt");
        _kunde4 = new Kunde(new Kundennummer(456745), "Lena", "Maier");

        vormerkkarte = new Vormerkkarte(_medium);
    }

    @Test
    public void testgetVormerker1()
    {
        vormerkkarte.addVormerker(_kunde1);
        assertEquals(_kunde1, vormerkkarte.getVormerker1());
    }

    @Test
    public void testgetVormerker2()
    {
        vormerkkarte.addVormerker(_kunde1);
        vormerkkarte.addVormerker(_kunde2);
        assertEquals(_kunde2, vormerkkarte.getVormerker2());
    }

    @Test
    public void testgetVormerker3()
    {
        vormerkkarte.addVormerker(_kunde1);
        vormerkkarte.addVormerker(_kunde2);
        vormerkkarte.addVormerker(_kunde3);
        assertEquals(_kunde3, vormerkkarte.getVormerker3());
    }

    @Test
    public void testAddVormerker()
    {
        vormerkkarte.addVormerker(_kunde1);
        assertEquals(_kunde1, vormerkkarte.getVormerker1());

        vormerkkarte.addVormerker(_kunde2);
        assertEquals(_kunde2, vormerkkarte.getVormerker2());

        vormerkkarte.addVormerker(_kunde3);
        assertEquals(_kunde3, vormerkkarte.getVormerker3());
    }

    @Test
    public void testRemoveVormerker()
    {
        vormerkkarte.addVormerker(_kunde1);
        vormerkkarte.removeVormerker(_kunde1);
        assertNull(vormerkkarte.getVormerker1());

    }



    @Test
    public void testAlleVormerker()
    {
        vormerkkarte.addVormerker(_kunde1);
        vormerkkarte.addVormerker(_kunde2);
        vormerkkarte.addVormerker(_kunde3);
        List<Kunde> ergebis = new LinkedList<>();
        ergebis.add(_kunde1);
        ergebis.add(_kunde2);
        ergebis.add(_kunde3);
        assertEquals(ergebis, vormerkkarte.alleVormerker());
    }

    @Test
    public void testGetMedium()
    {
      _medium.equals(vormerkkarte.getMedium());
    }

    @Test
    public void testeEquals()
    {
        assertTrue(vormerkkarte.equals(vormerkkarte));
    }
}