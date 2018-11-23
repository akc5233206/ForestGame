package hk.edu.polyu.comp.comp2021.jungle.model.piece;

import hk.edu.polyu.comp.comp2021.jungle.model.Capture;
import hk.edu.polyu.comp.comp2021.jungle.model.Movement;
import hk.edu.polyu.comp.comp2021.jungle.model.Player;

/**
 * The type Animal pieces.
 */
public abstract class AnimalPieces implements Movement, Capture {

    private int rank;
    private String piecesName;
    private Player player;
    private boolean inTrap;
    private String abbreviation;

    /**
     * Instantiates a new Animal pieces.
     *
     * @param rank         the rank
     * @param piecesName   the pieces name
     * @param player       the player
     * @param abbreviation the abbreviation
     */
    AnimalPieces(int rank, String piecesName, Player player, String abbreviation)
    {
        this.rank = rank;
        this.piecesName = piecesName;
        this.player = player;
        this.inTrap = false;
        this.abbreviation = abbreviation;
    }


    /**
     * Gets rank.
     *
     * @return the rank
     */
    public int getRank()
    {
        return this.rank;
    }

    /**
     * Get abbreviation string.
     *
     * @return the string
     */
    public String getAbbreviation(){
        return this.abbreviation;
    }


    /**
     * Gets pieces name.
     *
     * @return the pieces name
     */
    public String getPiecesName()
    {
        return this.piecesName;
    }


    /**
     * Gets player.
     *
     * @return the player
     */
    public Player getPlayer()
    {
        return this.player;
    }


    /**
     * Gets in trap.
     *
     * @return the in trap
     */
    public boolean getInTrap() {return this.inTrap;}


    /**
     * Sets in trap.
     *
     * @param inTrap the in trap
     */
    public void setInTrap(boolean inTrap)
    {
        this.inTrap = inTrap;
    }
}
