package fergoman123.mods.fergoutil.potion;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;

public abstract class FergoPotion extends Potion
{
    public FergoPotion(int id, boolean isBadEffect, int effectiveness) {
        super(id, isBadEffect, effectiveness);
    }

    public abstract int getId();

    public abstract void peformEffect(EntityLivingBase elb, int id);

    public abstract void affectEntity(EntityLivingBase elb1, EntityLivingBase elb2, int id, double aDouble);

    public abstract boolean isInstant();

    public abstract boolean isReady(int par1, int par2);

    public abstract String getName();

    public abstract boolean isBadEffect();

    public abstract boolean isUsable();
}
