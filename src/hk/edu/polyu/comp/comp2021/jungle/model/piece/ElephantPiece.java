package hk.edu.polyu.comp.comp2021.jungle.model.piece;

import hk.edu.polyu.comp.comp2021.jungle.model.Capture;
import hk.edu.polyu.comp.comp2021.jungle.model.Movement;
import hk.edu.polyu.comp.comp2021.jungle.model.Player;
import hk.edu.polyu.comp.comp2021.jungle.model.square.DenSquare;
import hk.edu.polyu.comp.comp2021.jungle.model.square.LandSquare;
import hk.edu.polyu.comp.comp2021.jungle.model.square.Square;
import hk.edu.polyu.comp.comp2021.jungle.model.square.TrapSquare;

/**
 * The type Elephant piece.
 */
public class ElephantPiece extends AnimalPieces {

    /**
     * Instantiates a new Elephant piece.
     *
     * @param player the player
     */
    public ElephantPiece(Player player)
    {
        super(8, "ELEPHANT" , player, "E");
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
        return movementSuccess;
    }

    @Override
    public boolean captureAnimal(Square sourceSquare, Square destSquare)
    {
        boolean captureSuccess = false;
        if((sourceSquare.getAnimal().getRank() >= destSquare.getAnimal().getRank() && !(RatPiece.class.isInstance(destSquare.getAnimal())) &&
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
