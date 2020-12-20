package io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public final class LuckyChestplateSurprise implements Surprise {
	
	@Override
	public String getName() {
		return "幸运胸甲";
	}

	@Override
	public void activate(Random random, Player p, Location l) {
		l.getWorld().dropItemNaturally(l, new CustomItem(Material.DIAMOND_CHESTPLATE, "&e&l幸运胸甲", new String[] {"PROTECTION_ENVIRONMENTAL-10", "PROTECTION_PROJECTILE-10", "PROTECTION_EXPLOSIONS-10", "THORNS-10", "DURABILITY-10"}));
	}

	@Override
	public LuckLevel getLuckLevel() {
		return LuckLevel.LUCKY;
	}

}
