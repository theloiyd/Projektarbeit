package de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten;

import de.uni_hamburg.informatik.swt.se2.mediathek.entitaeten.medien.Medium;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Datum;
import de.uni_hamburg.informatik.swt.se2.mediathek.wertobjekte.Geldbetrag;

import java.util.List;
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
     * @return ersten Vormerker.
     *
     */
    public Kunde getVormerker1()
    {
        if (_vormerker.isEmpty()) {
            return null;
        }
        else return _vormerker.peek();
    }
    /**
     * Gibt den zweiten Vormerker zurück.
     *
     * @return zweiten Vormerker.
     *
     */
    public Kunde getVormerker2() {
        if (_vormerker.size() < 2)
            return null;
        return _vormerker.toArray(new Kunde [0])[1];
    }

    /**
     * Gibt den dritten Vormerker zurück.
     *
     * @return dritten Vormerker.
     *
     */
    public Kunde getVormerker3()
    {
        if (_vormerker.size() < 3)
            return null;
        return _vormerker.toArray(new Kunde [0])[2];
    }

    /**
     * Fügt einen Vormerker hinzu
     *
     * @param vormerker nimmt den neuen Vormerker entgegen.
     * @require vormerker != null
     */
    public void addVormerker(Kunde vormerker)
    {
        assert vormerker != null : "Vorbedingung verletzt: vormerker != null";
        _vormerker.add(vormerker);
    }
    {

    }

    /**
     * Entfernt einen Vormerker
     *
     * @param vormerker nimmt den Vormerker entgegen, der entfernt werden soll.
     * @require vormerker != null
     */
    public void removeVormerker(Kunde vormerker)
    {
        assert vormerker != null : "Vorbedingung verletzt: vormerker != null";
        _vormerker.remove(vormerker);
    }

    /**
     * Gibt alle Vormerker zurück.
     *
     * @return alle Vormerker.
     *
     */
    public List<Kunde> alleVormerker()
    {
        return List.copyOf(_vormerker);
    }

    /**
     * Gibt die Warteschlange der Vormerker zurück.
     *
     * @return Warteschlange der Vormerker.
     *
     */
    public LinkedBlockingQueue<Kunde> getQueue()
    {
        return _vormerker;
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
