package io.github.fergoman123.fergoutil.util;

import net.minecraft.entity.player.EntityPlayer;

public class FlightUtil
{
    public static void setPlayerFlight(EntityPlayer playerFlight, boolean flying)
    {
        playerFlight.capabilities.allowFlying = flying;
    }

    public static void enableFlying(EntityPlayer player)
    {
        setPlayerFlight(player, true);
    }

    public static void disableFlying(EntityPlayer player)
    {
        setPlayerFlight(player, false);
        player.capabilities.isFlying = false;
    }
}
