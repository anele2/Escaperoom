
/**
 * Der erste Raum.
 * 
 * @Tim Jascheck 
 * @16.02.2020
 */
public class RaumEins extends Raum
{
    /**
     * Konstruktor für Objekte der Klasse RaumEins
     */
    public RaumEins()
    {
        super(new Raum1WandN(), new Raum1WandO(), new Raum1WandS(), new Raum1WandW());
    }

}
