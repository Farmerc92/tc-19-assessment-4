package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    SCISSOR,
    ROCK,
    PAPER;


    public RockPaperScissorHandSign getWinner() {
        if (this.equals(SCISSOR))
            return ROCK;
        else if (this.equals(ROCK))
            return PAPER;
        return SCISSOR;
    }

    public RockPaperScissorHandSign getLoser() {
        if (this.equals(SCISSOR))
            return PAPER;
        if (this.equals(PAPER))
            return ROCK;
        return SCISSOR;
    }
}
