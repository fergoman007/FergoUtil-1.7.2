package io.github.fergoman123.fergoutil.util;

public class VariantName
{
    private final String modid;
    private final String name;

    public VariantName(String modid, String name)
    {
        this.modid = modid.toLowerCase();
        this.name = name;
    }

    public String getModid() {
        return modid;
    }

    public String getName() {
        return name;
    }

    public String getFullName()
    {
        return this.getModid() + ":" + this.getName();
    }
}
