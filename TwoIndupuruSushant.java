public class TwoIndupuruSushant implements Player{
    final String name="TwoIndupuruSushant";
    final String strategy = "Markov chain statistical model";
    /**
     * This strategy uses the markov chain statistical model to calculate the most probable opponent move
     *
     * @return the move played against opponent <br>
     *         "r" - rock <br>
     *         "p" - paper <br>
     *         "s" - scissors <br>
     *         anything else - forfeit the turn
     */
    @Override
    public String move(String[] myMoves, String[] opponentMoves, int myScore, int opponentScore) {
        return "";
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
