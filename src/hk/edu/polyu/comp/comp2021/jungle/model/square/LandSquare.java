package hk.edu.polyu.comp.comp2021.jungle.model.square;

import hk.edu.polyu.comp.comp2021.jungle.model.piece.AnimalPieces;

public class LandSquare extends Square {

    public LandSquare(AnimalPieces animal, int rowPosition, char columnPosition)
    {
        super(animal, rowPosition , columnPosition, ' ');
    }

}
