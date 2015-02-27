package io.github.fergoman123.fergoutil.event;

import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraftforge.fml.common.eventhandler.Event;

public class BlockModelRegisterEvent extends Event
{
    public final BlockModelShapes modelShapes;

    public BlockModelRegisterEvent(BlockModelShapes modelShapes)
    {
        this.modelShapes = modelShapes;
    }
}
