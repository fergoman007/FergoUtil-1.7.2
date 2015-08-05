package io.github.fergoman123.fergoutil.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public abstract class GuiFurnaceFergo extends GuiContainer{
	
	public InventoryPlayer invPlayer;
	public IInventory furnace;
	public ResourceLocation texture;
	
	public GuiFurnaceFergo(Container container, ResourceLocation texture, InventoryPlayer invPlayer, IInventory furnace) {
		super(container);
		this.invPlayer = invPlayer;
		this.texture = texture;
		this.invPlayer = invPlayer;
		this.furnace = furnace;
	}
	
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
		String s = this.furnace.getDisplayName().getUnformattedText();
		this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
		this.fontRendererObj.drawString(this.invPlayer.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
	}
	
	public int getCookProgressScaled(int pixels){
		int cookTime = this.furnace.getField(2);
		int totalCookTime = this.furnace.getField(3);
		return totalCookTime != 0 && cookTime != 0 ? cookTime * pixels / totalCookTime : 0;
	}
	
	public int getBurnLeftScaled(int pixels){
		int currentItemBurnTime = this.furnace.getField(1);
		int burnTime = this.furnace.getField(0);
		
		if(currentItemBurnTime == 0){
			currentItemBurnTime = 200;
		}
		
		return burnTime * pixels / currentItemBurnTime;
	}
}
