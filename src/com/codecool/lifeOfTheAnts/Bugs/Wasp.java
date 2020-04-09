package com.codecool.lifeOfTheAnts.Bugs;

import com.codecool.lifeOfTheAnts.Main;
import com.codecool.lifeOfTheAnts.RandomGenerate;

public class Wasp extends Bug{
    private boolean live;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public void waspWokenUp(){
        live = true;
        setX(RandomGenerate.randomGenerate(Main.getxSize(), 0));
        setY(RandomGenerate.randomGenerate(Main.getySize(), 0));
    }
}