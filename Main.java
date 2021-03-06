package com.maxrenner;

import com.maxrenner.frame.FrameBuilder;
import com.maxrenner.gamefiles.Game;

public class Main {
    public static void main(String[] args){
        FrameBuilder frameBuilder = new FrameBuilder();
        Game game = new Game();
        frameBuilder.build(game);
        Thread thread = new Thread(game);
        thread.start();
    }
}
