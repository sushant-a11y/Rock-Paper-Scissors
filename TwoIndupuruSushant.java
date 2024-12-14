import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoIndupuruSushant implements Player {
    static final String name = "Sushant Indupuru";
    static final String strategy = "Markov chain statistical model";
    private static final int window = 4;
    private static final String[] choices={"r","p","s"};
    Map<String, String> winningMoves = new HashMap<String, String>();
    public TwoIndupuruSushant(){
        winningMoves.put("r","p");
        winningMoves.put("p","s");
        winningMoves.put("s","r");

    }
    /**
     * This strategy uses the markov chain statistical model to calculate the most probable opponent move
     *
     * @return the move played against opponent <br>
     * "r" - rock <br>
     * "p" - paper <br>
     * "s" - scissors <br>
     * anything else - forfeit the turn
     */
    @Override
    public String move(String[] myMoves, String[] opponentMoves, int myScore, int opponentScore) {
        int countR=0;
        int countP=0;
        int countS=0;
        List<String> om = Arrays.asList(opponentMoves);

        int newMoveIndex = 0;

        for (int i = 0; i < om.size(); i++) {
            if (om.get(i) == null) {
                newMoveIndex = i;
                break;
            }
        }

        if (newMoveIndex - window<0){
            return choices[(int) (Math.random() * 3)];
        }
        List<String> prevMoves = om.subList(newMoveIndex-window, newMoveIndex);
        for(int i = window;i<newMoveIndex;i++){
            if (om.subList(i-window,i).equals(prevMoves)){
                switch (om.get(i)) {
                    case "r" -> countR++;
                    case "p" -> countP++;
                    case "s" -> countS++;
                }
            }
        }
        if(countR==0&&countP==0&&countS==0){
            return choices[(int) (Math.random() * 3)];
        }
        Integer[] probArray = {countR,countP,countS};
        int maxAt=0;
        for (int i = 0; i < probArray.length; i++) {
            maxAt = probArray[i] > probArray[maxAt] ? i : maxAt;
        }
        return winningMoves.get(choices[maxAt]);
    }

    /**
     * Returns the name of the player
     *
     * @return the name of the player
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Returns the strategy that the player uses
     *
     * @return the strategy that the player uses
     */
    public String getStrategy() {
        return strategy;
    }


}
