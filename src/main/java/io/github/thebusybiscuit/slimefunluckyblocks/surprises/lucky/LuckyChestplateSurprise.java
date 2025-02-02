package io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;

public final class LuckyChestplateSurprise implements Surprise {

    private final ItemStack chestplate;

    public LuckyChestplateSurprise() {
        chestplate = new CustomItemStack(Material.DIAMOND_CHESTPLATE, "&e&l幸运胸甲");
        chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
        chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 10);
        chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
        chestplate.addUnsafeEnchantment(Enchantment.THORNS, 10);
        chestplate.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
    }

    @Override
    public String getName() {
        return "幸运胸甲";
    }

    @Override
    public void activate(Random random, Player p, Location l) {
        l.getWorld().dropItemNaturally(l, chestplate.clone());
    }

    @Override
    public LuckLevel getLuckLevel() {
        return LuckLevel.LUCKY;
    }

}
