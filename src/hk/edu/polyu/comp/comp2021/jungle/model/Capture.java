package hk.edu.polyu.comp.comp2021.jungle.model;

import hk.edu.polyu.comp.comp2021.jungle.model.square.LandSquare;
import hk.edu.polyu.comp.comp2021.jungle.model.square.Square;
import hk.edu.polyu.comp.comp2021.jungle.model.square.TrapSquare;

public interface Capture {

    default boolean captureAnimal(Square sourceSquare, Square destSquare)
    {
        boolean captureSuccess = false;
        if((sourceSquare.getAnimal().getRank() >= destSquare.getAnimal().getRank() &&
                (LandSquare.class.isInstance(sourceSquare) && LandSquare.class.isInstance(destSquare))) ||
                TrapSquare.class.isInstance(destSquare) )
        {

            destSquare.getAnimal().getPlayer().removePiece(destSquare.getAnimal().getPiecesName());
            destSquare.setAnimal(sourceSquare.getAnimal());
            sourceSquare.setAnimal(null);
            captureSuccess = true;
        }


        return captureSuccess;

    }


}
