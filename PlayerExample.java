import java.util.*;
/**
 * Each player or team will create their own Player, this is only an example....
 * <p>
 * Your code MUST INCLUDE a move method with the following signature. To insure that, you must implement
 * the Player interface
 * <p>
 * You can create additional methods but must have the move method
 * 
 */
public class PlayerExample implements Player
{
    private static String name = "PlayerExample";
    /**
     * An example of a method - replace this comment with your own
     * You must create some kind of logic of what to play against your opponent...start thinking!
     * 
     * @return      the move you want to play against opponent<br>
     *              "r" - rock<br>
     *              "p" - paper<br>
     *              "s" - scissors<br>
     *              anything else - forfeit the turn
     */
    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
        
        return " ";
    }
    /**
     * Returns the name of the player
     * 
     * @return      the name of the player              
     */
    public String getName()
    {
        return name;
    }
}

