package io.github.fergoman123.fergoutil.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

public abstract class FergoGuiContainer extends GuiContainer
{

    public FergoGuiContainer(Container container) {
        super(container);
    }

    public abstract void drawGuiContainerForegroundLayer(int par1, int par2);

    public abstract void drawGuiContainerBackgroundLayer(float par1, int par2, int par3);
}
