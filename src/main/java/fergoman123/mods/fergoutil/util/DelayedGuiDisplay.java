package fergoman123.mods.fergoutil.util;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class DelayedGuiDisplay
{
    private int delayTicks;
    private Minecraft mcClient;
    private GuiScreen screen;

    public DelayedGuiDisplay(int delayTicks, GuiScreen screen)
    {
        this.delayTicks = delayTicks;
        this.mcClient = FMLClientHandler.instance().getClient();
        this.screen = screen;
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent evt)
    {
        if (evt.phase.equals(TickEvent.Phase.START))
        {
            return;
        }

        if (--delayTicks <= 0)
        {
            mcClient.displayGuiScreen(screen);
            FMLCommonHandler.instance().bus().unregister(this);
        }
    }
}
