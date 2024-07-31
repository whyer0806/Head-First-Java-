public class GameRoom
{
    private Judge judge;
    private Player[] players;
    private int playerNumber;

    public GameRoom(int playernumber)
    {
        this.judge = new Judge();
        this.players = new Player[playernumber];
        this.playerNumber = playernumber;

        for(int i = 0; i < playernumber; i++)
        {
            players[i] = new Player();
        }
    }

    public void startGame()
    {
        System.out.println("Game Started");
        System.out.println("Judge guessed the number is " + judge.getGuessedNumber());
    }

    public void playerGuessNumber()
    {
        boolean gameOn = true;
        while(gameOn)
        {
            for(int i = 0; i < playerNumber; i++)
            {
                int guessedNumber = players[i].getGuessedNumber();
                System.out.println("Player " + (i + 1) + " guessed the number is " + guessedNumber);
                if(judge.IsGuessedNumber(guessedNumber))
                {
                    System.out.println("Player " + (i + 1) + " guessed the number correctly");
                    System.out.println("Game Ended");
                    gameOn = false;
                    break;
                }
            }
        }
    }

}

