package hk.edu.polyu.comp.comp2021.jungle.model.piece;

import hk.edu.polyu.comp.comp2021.jungle.model.Capture;
import hk.edu.polyu.comp.comp2021.jungle.model.Movement;
import hk.edu.polyu.comp.comp2021.jungle.model.Player;
import hk.edu.polyu.comp.comp2021.jungle.model.square.*;

public class RatPiece extends AnimalPieces implements Movement, Capture {

    public RatPiece(Player player)
    {
        super(1, "RAT" , player, "R");
    }

    @Override
    public boolean isValidMovement(Player currPlayer, Square sourceSquare , Square destSquare)
    {
        boolean isValid = false;
        if((sourceSquare.getRowPosition()+ 1 == destSquare.getRowPosition() &&  sourceSquare.getColumnPosition() == destSquare.getColumnPosition() )||
                (sourceSquare.getRowPosition() - 1 == destSquare.getRowPosition() &&  sourceSquare.getColumnPosition() == destSquare.getColumnPosition() )||
                (sourceSquare.getRowPosition() == destSquare.getRowPosition() &&  sourceSquare.getColumnPosition() + 1 == destSquare.getColumnPosition() )||
                (sourceSquare.getRowPosition() == destSquare.getRowPosition() &&  sourceSquare.getColumnPosition() - 1 == destSquare.getColumnPosition() ))
        {
            isValid =true;
        }
        return isValid;
    }

    @Override
    public boolean moveToBoardDestination(Player currPlayer, Square sourceSquare, Square destSquare) {
        boolean movementSuccess = false;

        if(!DenSquare.class.isInstance(destSquare))
        {
            if(destSquare.getAnimal() == null)
            {
                destSquare.setAnimal(sourceSquare.getAnimal());
                sourceSquare.setAnimal(null);
                movementSuccess = true;

            }else if(((RiverSquare.class.isInstance(sourceSquare) && RiverSquare.class.isInstance(destSquare)) ||
                    ((LandSquare.class.isInstance(sourceSquare) && LandSquare.class.isInstance(destSquare)))) &&
                    destSquare.getAnimal() != null)
            {
                if(destSquare.getAnimal().getPlayer() != currPlayer)
                {
                    movementSuccess = captureAnimal(sourceSquare, destSquare);
                }
            }
        }else
        {
            if(sourceSquare.getAnimal().getPlayer() != ((DenSquare) destSquare).getPlayerObj())
            {
                destSquare.setAnimal(sourceSquare.getAnimal());
                sourceSquare.setAnimal(null);
                currPlayer.setWinGame(true);
                movementSuccess = true;
            }
        }


        if(movementSuccess)
        {
            getInsideOrOutsideTrap(sourceSquare, destSquare);
        }

        return movementSuccess;
    }

    @Override
    public boolean captureAnimal(Square sourceSquare, Square destSquare)
    {
        boolean captureSuccess = false;
        if(((sourceSquare.getAnimal().getRank() >= destSquare.getAnimal().getRank() || (ElephantPiece.class.isInstance(destSquare.getAnimal())))) ||
                TrapSquare.class.isInstance(destSquare))
        {
            destSquare.getAnimal().getPlayer().removePiece(destSquare.getAnimal().getPiecesName());
            destSquare.setAnimal(sourceSquare.getAnimal());
            sourceSquare.setAnimal(null);
            captureSuccess = true;
        }
        return captureSuccess;
    }
}
