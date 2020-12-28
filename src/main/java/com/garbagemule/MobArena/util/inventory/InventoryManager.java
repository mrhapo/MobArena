package com.garbagemule.MobArena.util.inventory;

import com.garbagemule.MobArena.MobArena;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class InventoryManager
{
    private Map<Player, ItemStack[]> inventories;

    public InventoryManager() {
        this.inventories = new HashMap<>();
    }

    public void put(Player p, ItemStack[] contents) {
    }

    public void equip(Player p) {
    }

    public void remove(Player p) {
    }

    /**
     * Removed the clearInventory events
     */
    public static void clearInventory(Player p) {
    }

    public static boolean hasEmptyInventory(Player p) {
        ItemStack[] inventory = p.getInventory().getContents();
        ItemStack[] armor     = p.getInventory().getArmorContents();

        // Check for null or id 0, or AIR
        for (ItemStack stack : inventory) {
            if (stack != null && stack.getType() != Material.AIR)
                return false;
        }

        for (ItemStack stack : armor) {
            if (stack != null && stack.getType() != Material.AIR)
                return false;
        }

        return true;
    }

    public static boolean restoreFromFile(MobArena plugin, Player p) {
}
