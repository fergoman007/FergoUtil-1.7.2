package io.github.fergoman123.fergoutil.item.recipe;

import net.minecraft.item.ItemStack;

public class RecipeFergo
{
    private ItemStack output;
    private String topRow;
    private String middleRow;
    private String bottomRow;
    private char id;
    private ItemStack input;

    public RecipeFergo(ItemStack output, String topRow, String middleRow, String bottomRow, char id, ItemStack input) {
        this.output = output;
        this.topRow = topRow;
        this.middleRow = middleRow;
        this.bottomRow = bottomRow;
        this.id = id;
        this.input = input;
    }

    public ItemStack getOutput() {
        return output;
    }

    public String getTopRow() {
        return topRow;
    }

    public String getMiddleRow() {
        return middleRow;
    }

    public String getBottomRow() {
        return bottomRow;
    }

    public char getId() {
        return id;
    }

    public ItemStack getInput() {
        return input;
    }
}