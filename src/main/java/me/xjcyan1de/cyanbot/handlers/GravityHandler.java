package me.xjcyan1de.cyanbot.handlers;

import me.xjcyan1de.cyanbot.Bot;
import me.xjcyan1de.cyanbot.world.Vector;

public class GravityHandler implements Handler {

    final double A = 0.08;
    private Bot bot;
    private Vector speed;

    public GravityHandler(Bot bot) {
        this.bot = bot;
        this.speed = bot.getSpeed();
    }


    @Override
    public void onUpdate() {
        if (bot.isOnGround()) {
            speed.setY(0);
        } else {
            if (speed.getY() > -3.3) {
                speed.add(0, -A, 0);
                if (speed.getY() < -3.3) {
                    speed.setY(-3.3);
                }
            }
        }
    }

}
