package com.garbagemule.MobArena.steps;

import com.garbagemule.MobArena.framework.Arena;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;

class ClearInventory extends PlayerStep {
    private final File inventories;
    private final Arena arena;

    private ItemStack[] contents;
    private File backup;

    private ClearInventory(Player player, Arena arena) {
        super(player);
        this.arena = arena;
    }

    @Override
    public void run() {
    }

    @Override
    public void undo() {
    }

    private void createBackup() {
    }

    private void deleteBackup() {
    }

    static StepFactory create(Arena arena) {
        return player -> new ClearInventory(player, arena);
    }
}
