package com.valentineaweful.managers;

import com.valentineaweful.dataProvider.ConfigFileReader;

public class ConfigFileManager {
    private static ConfigFileReader configFileReader;
    private static final ConfigFileManager configFileManager = new ConfigFileManager();

    private ConfigFileManager() {
    }

    public static ConfigFileManager getInstance() {
        return configFileManager;
    }

    public ConfigFileReader getConfiguration() {
        return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
    }
}
