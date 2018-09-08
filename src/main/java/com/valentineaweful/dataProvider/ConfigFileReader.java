package com.valentineaweful.dataProvider;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private FileInputStream fileInputStream;
    private Properties properties;
    private static final String PROP_LOCATION = System.getProperty("user.dir") + "/data.properties";

    public ConfigFileReader() {
        properties = new Properties();
        try (BufferedInputStream buf = new BufferedInputStream(new FileInputStream(PROP_LOCATION))) {
            properties.load(buf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getApplicationURL() {
        String url = properties.getProperty("url");
        if (url != null) {
            return url;
        } else throw new RuntimeException("URL set to Null !");
    }

    public String getBrowser() {
        String browser = properties.getProperty("browser");
        if (browser != null) {
            return browser;
        } else throw new RuntimeException("Browser set to Null !");
    }

}
