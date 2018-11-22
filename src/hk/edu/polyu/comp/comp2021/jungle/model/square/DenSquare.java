package hk.edu.polyu.comp.comp2021.jungle.model.square;

import hk.edu.polyu.comp.comp2021.jungle.model.Player;
import hk.edu.polyu.comp.comp2021.jungle.model.piece.AnimalPieces;

public class DenSquare extends Square {
    private Player playerObj;

    public DenSquare(AnimalPieces animal, Player playerObj, int rowPosition, char columnPosition)
    {
        super(animal, rowPosition , columnPosition, '@');
        this.playerObj = playerObj;
    }

    public Player getPlayerObj (){return this.playerObj;}

    public void setPlayerObj(Player playerObj)
    {
        this.playerObj = playerObj;
    }


}

