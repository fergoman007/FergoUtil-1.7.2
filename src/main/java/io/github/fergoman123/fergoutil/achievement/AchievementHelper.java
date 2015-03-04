package io.github.fergoman123.fergoutil.achievement;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.StatBase;
import net.minecraftforge.common.AchievementPage;

public class AchievementHelper
{
    public static AchievementPage getAchievementPage(String modid, String name, Achievement... achievements)
    {
        return new AchievementPage(modid + ".page." + name, achievements);
    }
}
