package hk.edu.polyu.comp.comp2021.jungle.model.square;

import hk.edu.polyu.comp.comp2021.jungle.model.Player;
import hk.edu.polyu.comp.comp2021.jungle.model.piece.AnimalPieces;

public class TrapSquare extends Square {

    public TrapSquare(AnimalPieces animal, int rowPosition, char columnPosition)
    {
        super(animal, rowPosition , columnPosition , '#');

    }

}
