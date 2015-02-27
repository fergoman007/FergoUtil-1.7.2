package io.github.fergoman123.fergoutil.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class FergoConfig extends Configuration
{
    public FergoConfig(File file) {
        super(file);
    }

    public String getGeneral()
    {
        return Configuration.CATEGORY_GENERAL;
    }
}
