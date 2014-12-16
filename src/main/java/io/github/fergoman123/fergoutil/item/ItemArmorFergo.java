package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemArmorFergo extends ItemArmor
{
    public String armorTexture;
    public ArmorMaterial material;
    public ArmorType type;
    public int mod;
    public Item repairItem;
    public String folder;
    public String armorType;
    public String armorFolder;

    /**
     *
     * @param material the armor material
     * @param mod the mod in which this item is connected to.
     * @param type the armor type e.g. helmet, chestplate, leggings, boots
     * @param armorType the type of armor based on a toolmaterial
     * @param folder the folder that the textures are located
     * @param armorTexture the armor texture
     * @param repairItem the item used to repair the armor
     *
     * e.g. ToolMaterial.EMERALD, 0, ArmorType.HELMET, diamond
     */
    public ItemArmorFergo(ArmorMaterial material, int mod, ArmorType type, String folder, String armorType, String armorTexture, Item repairItem)
    {
        super(material, 1, type.ordinal());
        this.mod = mod;
        this.armorTexture = armorTexture;
        this.material = material;
        this.type = type;
        this.repairItem = repairItem;
        this.folder = folder;
        this.armorType = armorType;
    }

    @Override
    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem) {
        return repairItem.isItemEqual(new ItemStack(this.repairItem)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (slot == ArmorType.HELMET.ordinal() || slot == ArmorType.CHEST.ordinal() || slot == ArmorType.BOOTS.ordinal())
        {
            return String.format("%s%s/%s/%s/%s_1", NameHelper.getModString(this.mod), "textures", "armor", this.folder, this.armorTexture);
        }

        if (slot == ArmorType.LEGS.ordinal())
        {
            return String.format("%s%s/%s/%s/%s_2", NameHelper.getModString(this.mod), "textures", "armor", this.folder, this.armorTexture);
        }
        else
        {
            return null;
        }
    }

    public void registerIcons(IIconRegister register)
    {
        if (this.type == ArmorType.HELMET)
        {
            itemIcon = register.registerIcon(String.format("%s%s/%s/%sHelmet", NameHelper.getModString(this.mod), "armor", this.folder, this.armorType));
        }

        if (this.type == ArmorType.CHEST)
        {
            itemIcon = register.registerIcon(String.format("%s%s/%s/%sChestplate", NameHelper.getModString(this.mod), "armor", this.folder, this.armorType));
        }

        if (this.type == ArmorType.LEGS)
        {
            itemIcon = register.registerIcon(String.format("%s%s/%s/%sLeggings", NameHelper.getModString(this.mod), "armor", this.folder, this.armorType));
        }

        if (this.type == ArmorType.BOOTS)
        {
            itemIcon = register.registerIcon(String.format("%s%s/%s/%sBoots", NameHelper.getModString(this.mod), "armor", this.folder, this.armorType));
        }
    }
    @SuppressWarnings("unchecked")
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        if (this.type == ArmorType.HELMET)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(0));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
        }
        else if (this.type == ArmorType.CHEST)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(1));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
        }
        else if (this.type == ArmorType.LEGS)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(2));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
        }
        else if (this.type == ArmorType.BOOTS)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(3));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
        }
    }
}
