package me.zephrynis.mkcosmetic.cosmetics;

import org.bukkit.Material;
import org.bukkit.entity.Player;

public class MyFirstCosmetic extends Cosmetic {
    public MyFirstCosmetic(Player player) {
        super(player);
    }

    @Override
    public void start() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Rank getRequiredRank() {
        return null;
    }

    @Override
    public Material getIcon() {
        return null;
    }
}
