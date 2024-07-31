public class Player
{
    public void setGuessedNumber() {
        this.guessedNumber = (int)(Math.random() * 10);
    }

    public int getGuessedNumber()
    {
        return guessedNumber;
    }

    private int guessedNumber;
}
