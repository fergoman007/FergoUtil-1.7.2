package io.github.fergoman123.fergoutil.gui;

import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiWorkbenchFergo extends GuiContainer
{
    private ResourceLocation texture;
    private String invName;

    public GuiWorkbenchFergo(Container container, ResourceLocation texture, String invName)
    {
        super(container);
        this.texture = texture;
        this.invName = invName;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        fontRendererObj.drawString(I18n.format(this.invName), 28, 6, 4210752);
        fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GuiHelper.bindTexture(this.texture);
        int startX = (this.width - this.xSize) / 2;
        int startY = (this.height - this.ySize) / 2;
        int tex = 0;
        drawTexturedModalRect(startX, startY, tex, tex, this.xSize, this.ySize);
    }
}
