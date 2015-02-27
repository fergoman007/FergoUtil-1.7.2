package io.github.fergoman123.fergoutil.packet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.relauncher.Side;

import java.nio.ByteBuffer;

public abstract class AbstractPacket
{
    protected EntityPlayer playerClient;
    protected EntityPlayer playerServer;

    public abstract void writeTo(ByteBuffer buffer, Side side);

    public abstract void readFrom(ByteBuffer buffer, Side side);

    public abstract void execute(Side side, EntityPlayer player);

    public boolean requiresMainThread(){
        return true;
    }
}
