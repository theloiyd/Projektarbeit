package de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten;

import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.Medium;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Geldbetrag;

import java.util.concurrent.LinkedBlockingQueue;

public class VormerkkarteTest
{

    private LinkedBlockingQueue<Kunde> _vormerker;
    private final Medium _medium;
    private final Kunde _kunde;

    public VormerkkarteTest()
    {
        _vormerker = new
        _medium = new Medium();
}
