package io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;

public final class WalshrusSurprise implements Surprise {

    private final ItemStack sword;

    public WalshrusSurprise() {
        sword = new CustomItemStack(Material.GOLDEN_SWORD, "&e&l幸运剑");
        sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
        sword.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 10);
        sword.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        sword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
    }

    @Override
    public String getName() {
        return "沃尔什鲁斯";
    }

    @Override
    public void activate(Random random, Player p, Location l) {
        Zombie zombie = (Zombie) l.getWorld().spawnEntity(l, EntityType.ZOMBIE);
        zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(40D);
        zombie.setHealth(40D);

        zombie.getEquipment().setHelmet(PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzk2NmYwZWJkNzdmMWJjZDY1NmZhMmRjM2VmMDMwM2UyNmE2YTNkZTQ5OGMzOTk5ZDM5ZmRjYWNjNWY1YWQifX19")));
        zombie.getEquipment().setHelmetDropChance(0F);

        zombie.getEquipment().setItemInMainHand(sword.clone());
        zombie.getEquipment().setItemInMainHandDropChance(0F);
        zombie.setCanPickupItems(false);
        zombie.setCustomName(ChatColor.translateAlternateColorCodes('&', "&4沃尔什鲁斯"));
        zombie.setCustomNameVisible(true);
    }

    @Override
    public LuckLevel getLuckLevel() {
        return LuckLevel.UNLUCKY;
    }

}
