package io.github.fergoman123.fergoutil.achievement;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class AchievementHelper {
	public static AchievementPage getAchievementPage(String modid, String name,
			Achievement... achievements) {
		return new AchievementPage(modid + ".page." + name, achievements);
	}

	public static Achievement createAch(String achName, int col, int row, ItemStack achIcon, Achievement parent){
		return new Achievement("achievement." + achName, achName, col, row, achIcon, parent);
	}

	public static Achievement createAchNoPar(String achName, int col, int row, ItemStack achIcon){
		return createAch(achName, col, row, achIcon, (Achievement)null);
	}

	public static Achievement createAchNoParItem(String achName, int col, int row, Item achIcon){
		return createAchNoPar(achName, col, row, new ItemStack(achIcon));
	}

	public static Achievement createAchNoParBlock(String achName, int col, int row, Block achIcon){
		return createAchNoPar(achName, col, row, new ItemStack(achIcon));
	}

	public static Achievement createAch(String achName, int col, int row, Item achIcon, Achievement parent){
		return createAch(achName, col, row, new ItemStack(achIcon), parent);
	}

	public static Achievement createAch(String achName, int col, int row, Block achIcon, Achievement parent){
		return createAch(achName, col, row, new ItemStack(achIcon), parent);
	}
}
