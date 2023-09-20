package tk.gabrielsilvera.gaming;

import tk.gabrielsilvera.gaming.game.GameRunner;
import tk.gabrielsilvera.gaming.game.MarioGame;
import tk.gabrielsilvera.gaming.game.PacmanGame;
import tk.gabrielsilvera.gaming.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
        var game = new PacmanGame();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
