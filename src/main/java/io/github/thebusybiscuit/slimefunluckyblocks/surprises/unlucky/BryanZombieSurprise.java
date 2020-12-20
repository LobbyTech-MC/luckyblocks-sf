package io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;

import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public final class BryanZombieSurprise implements Surprise {
	
	@Override
	public String getName() {
		return "哥布林";
	}

	@Override
	public void activate(Random random, Player p, Location l) {
		Zombie zombie = (Zombie) l.getWorld().spawnEntity(l, EntityType.ZOMBIE);
		zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(60D);
		zombie.setHealth(60D);
		zombie.getEquipment().setItemInMainHand(new CustomItem(Material.GOLDEN_AXE, "&e&l幸运斧头", new String[] {"DAMAGE_ALL-10", "DIG_SPEED-10", "LOOT_BONUS_BLOCKS-10", "DURABILITY-10"}));
		zombie.getEquipment().setItemInMainHandDropChance(0F);
		zombie.setCanPickupItems(false);
		zombie.setCustomName(ChatColor.translateAlternateColorCodes('&', "&e哥布林"));
		zombie.setCustomNameVisible(true);
	}

	@Override
	public LuckLevel getLuckLevel() {
		return LuckLevel.UNLUCKY;
	}

}
