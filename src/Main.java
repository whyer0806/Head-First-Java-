import java.util.Scanner;
public class Main {

    public static void main(String[] agrs)
    {
        GameRoom gameRoom = new GameRoom(2);
        gameRoom.startGame();
        gameRoom.playerGuessNumber();
    }
}