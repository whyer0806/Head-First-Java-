public class Judge
{
    private int guessedNumber;

    public int getGuessedNumber() {
        return guessedNumber;
    }

    public Judge()
    {
        this.guessedNumber = (int) (Math.random() * 10);
        System.out.println("Judge guessed the number is " + guessedNumber);
    }

    public boolean IsGuessedNumber(int number)
    {
        return number == this.guessedNumber;
    }
}
