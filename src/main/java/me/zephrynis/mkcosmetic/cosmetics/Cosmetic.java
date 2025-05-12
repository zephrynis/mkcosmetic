package me.zephrynis.mkcosmetic.cosmetics;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public abstract class Cosmetic {
    protected Player player;

    public Cosmetic(Player player) {
        this.player = player;
    }

    public abstract void start();

    public abstract void destroy();

    public abstract String getName();

    public abstract Rank getRequiredRank();

    public abstract Material getIcon();

    @Getter
    public enum Rank {
        DEFAULT("default"),
        VIP("vip"),
        PRO("pro"),
        MVP("mvp"),
        ELITE("elite"),
        LEGEND("legend");

        private final String name;

        Rank(String name) {
            this.name = name;
        }
    }
}
