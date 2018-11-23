package hk.edu.polyu.comp.comp2021.jungle.model.piece;

import hk.edu.polyu.comp.comp2021.jungle.model.Capture;
import hk.edu.polyu.comp.comp2021.jungle.model.Movement;
import hk.edu.polyu.comp.comp2021.jungle.model.Player;
import hk.edu.polyu.comp.comp2021.jungle.model.square.DenSquare;
import hk.edu.polyu.comp.comp2021.jungle.model.square.Square;

/**
 * The type Lion piece.
 */
public class LionPiece extends AnimalPieces implements Movement, Capture {

    /**
     * Instantiates a new Lion piece.
     *
     * @param player the player
     */
    public LionPiece(Player player)
    {
        super(7, "LION" , player, "Li");
    }


    @Override
    public boolean isValidMovement(Player currPlayer, Square sourceSquare , Square destSquare)
    {
        boolean isValid = false;
        isValid = Movement.super.isValidMovement(currPlayer, sourceSquare , destSquare);
        if(!isValid)
        {
            if((sourceSquare.getRowPosition() == destSquare.getRowPosition() && sourceSquare.getColumnPosition() + 3 == destSquare.getColumnPosition() )||
                    (sourceSquare.getRowPosition() == destSquare.getRowPosition() && sourceSquare.getColumnPosition() - 3 == destSquare.getColumnPosition()) ||
                    (sourceSquare.getRowPosition() + 4 == destSquare.getRowPosition() && sourceSquare.getColumnPosition() == destSquare.getColumnPosition()) ||
                    (sourceSquare.getRowPosition() - 4 == destSquare.getRowPosition() && sourceSquare.getColumnPosition() == destSquare.getColumnPosition()))
            {
                if(isAroundRiver(sourceSquare.getRowPosition(), sourceSquare.getColumnPosition()))
                {
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    @Override
    public boolean moveToBoardDestination(Player currPlayer, Square sourceSquare, Square destSquare)
    {
        boolean movementSuccess = false;
        // Check any animal is contained by the destination's square or not.
        if(!DenSquare.class.isInstance(destSquare))
        {
            if(destSquare.getAnimal() != null)
            {
                if(destSquare.getAnimal().getPlayer() != currPlayer)
                {
                    movementSuccess = captureAnimal(sourceSquare, destSquare);
                }

            }else
            {
                destSquare.setAnimal(sourceSquare.getAnimal());
                sourceSquare.setAnimal(null);
                movementSuccess = true;
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
}
