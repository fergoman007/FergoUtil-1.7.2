package io.github.fergoman123.fergoutil.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public abstract class GuiFurnaceFergo extends GuiContainer
{
    public Container container;

    public GuiFurnaceFergo(Container container)
    {
        super(container);
        this.container = container;
    }

    public abstract void drawGuiContainerForegroundLayer(int mouseX, int mouseY);

    public abstract void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY);

    public abstract int getCookProgressScaled(int speed);

    public abstract int getBurnTimeRemainingScaled(int speed, int furnaceSpeed);
}
