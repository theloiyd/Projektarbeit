package de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten;

import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.CD;
import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.Medium;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Datum;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Geldbetrag;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Kundennummer;
import org.junit.Test;

import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotSame;

/**
 * Test für Vormerkkarte
 */
public class VormerkkarteTest
{
    private LinkedBlockingQueue<Kunde> _vormerker;
    private Medium _medium;

    public VormerkkarteTest()
    {
        _vormerker = new Kunde(new Kundennummer(123456), "ich", "du");

        _medium = new CD("bar", "baz", "foo", 123);
    }

    @Test
        public  get_vormerker1()
    {

    }
    @Test
    public void testaddVormerker()
    {

    }

    @Test
    public String testalleVormerker()
    {

    }

    @Test
    public Medium testgetMedium()
    {

    }
}