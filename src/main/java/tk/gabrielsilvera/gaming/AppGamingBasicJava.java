package tk.gabrielsilvera.gaming;

import tk.gabrielsilvera.gaming.game.GameRunner;
import tk.gabrielsilvera.gaming.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
