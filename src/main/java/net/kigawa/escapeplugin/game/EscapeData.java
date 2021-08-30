package net.kigawa.escapeplugin.game;

import net.kigawa.escapeplugin.util.plugin.all.recorder.RecorderData;

public class EscapeData extends RecorderData {
    String world;
    int[] hopper;

    public int[] getHopper() {
        return hopper;
    }

    public void setHopper(int[] hopper) {
        this.hopper = hopper;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}
