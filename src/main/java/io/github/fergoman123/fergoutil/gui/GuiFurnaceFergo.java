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
    public InventoryPlayer invPlayer;
    public IInventory furnace;

    public GuiFurnaceFergo(Container container, InventoryPlayer invPlayer, IInventory furnace)
    {
        super(container);
        this.furnace = furnace;
        this.invPlayer = invPlayer;
    }

    public abstract void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY);

    public int getCookProgressScaled(int speed)
    {
        int j = this.furnace.getField(2);
        int k = this.furnace.getField(3);
        return k != 0 && j != 0 ? j * speed / k : 0;
    }

    public int getBurnTimeRemainingScaled(int speed)
    {
        int j = this.furnace.getField(1);

        if (j == 0)
        {
            j = 200;
        }

        return this.furnace.getField(0) * speed / j;
    }
}
