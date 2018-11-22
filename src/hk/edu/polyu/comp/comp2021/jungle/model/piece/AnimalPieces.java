package hk.edu.polyu.comp.comp2021.jungle.model.piece;

import hk.edu.polyu.comp.comp2021.jungle.model.Capture;
import hk.edu.polyu.comp.comp2021.jungle.model.Movement;
import hk.edu.polyu.comp.comp2021.jungle.model.Player;

public abstract class AnimalPieces implements Movement, Capture {

    private int rank;
    private String piecesName;
    private Player player;
    private boolean inTrap;
    private String abbreviation;

    AnimalPieces(int rank, String piecesName, Player player, String abbreviation)
    {
        this.rank = rank;
        this.piecesName = piecesName;
        this.player = player;
        this.inTrap = false;
        this.abbreviation = abbreviation;
    }


    public int getRank()
    {
        return this.rank;
    }

    public String getAbbreviation(){
        return this.abbreviation;
    }


    public String getPiecesName()
    {
        return this.piecesName;
    }


    public Player getPlayer()
    {
        return this.player;
    }


    public boolean getInTrap() {return this.inTrap;}


    public void setInTrap(boolean inTrap)
    {
        this.inTrap = inTrap;
    }
}
