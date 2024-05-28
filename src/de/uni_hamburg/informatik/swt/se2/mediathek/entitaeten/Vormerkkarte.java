package de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten;

import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.Medium;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Datum;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Geldbetrag;

import java.util.concurrent.LinkedBlockingQueue;

/**Verleih
 * Mit Hilfe von Vormerkkarte werden beim Personen vorgermerkt die ein Medium ausleihgen wollen.
 * 
 * Sie beantwortet die folgenden Fragen: Wer kann als nächstes das Medium ausleihen?
 * 
 * Wenn Medien ausgeliehen wurde kann die Person die es ausleiht entfernt werden.
 * 
 * @author GBS-Team
 * @version SoSe 2021
 */
public class Vormerkkarte
{

    // Eigenschaften einer Vormerkkarte
    private LinkedBlockingQueue<Kunde> _vormerker;
    private final Medium _medium;

    /**
     * Initialisert eine neue Vormerkkarte mit den gegebenen Daten.
     *
     * @param medium Ein verliehene Medium.
     *
     * @require vormerker1 != null
     * @require medium != null
     *
     * @ensure #getMedium() == medium
     */
    public Vormerkkarte(Medium medium)
    {
        assert medium != null : "Vorbedingung verletzt: medium != null";

        _medium = medium;
        _vormerker = new LinkedBlockingQueue<>(3);

    }

    /**
     * Gibt den ersten Vormerker zurück.
     * 
     * @return den Kunden, der das Medium entliehen hat.
     *
     */
    public Kunde get_vormerker1()
    {
        return _vormerker.element();
    }
    /**
     * Fügt einen Vormerker hinzu
     *
     */
    public void addVormerker(Kunde vormerker)
    {
        _vormerker.add(vormerker);
    }

    /**
     * Gibt den zweiten Vormerker zurück.
     *
     * @return den Kunden, der das Medium entliehen hat.
     *
     */
    public String alleVormerker()
    {
        String result = "";
        for (Kunde s : _vormerker)
        {
            result += ", " + s.toString();
        }
        return result;
    }

    /**
     * Gibt das Medium, dessen Ausleihe auf der Karte vermerkt ist, zurück.
     * 
     * @return Das Medium, dessen Ausleihe auf dieser Karte vermerkt ist.
     * 
     * @ensure result != null
     */
    public Medium getMedium()
    {
        return _medium;
    }


    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((_medium == null) ? 0 : _medium.hashCode());
        result = prime * result + ((_medium == null) ? 0 : _medium.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean result = false;
        if (obj instanceof Vormerkkarte other)
        {

            if (other.getMedium()
                        .equals(_medium) && other.alleVormerker().equals(this.alleVormerker()))

                result = true;
        }
        return result;
    }

}
