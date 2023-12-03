package com.github.simaodiazz.redis.provider.configuration.automate.impl;

import com.github.simaodiazz.redis.provider.configuration.RedisConfiguration;
import com.github.simaodiazz.redis.provider.configuration.automate.RedisConfigurationAutomateFactory;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class PaperRedisConfigurationAutomateFactory implements RedisConfigurationAutomateFactory {

    @Override
    public RedisConfiguration build(Object... args) {
        Plugin plugin = (Plugin) args[0];
        if (plugin == null)
            throw new NullPointerException("Plugin cannot be null");

        FileConfiguration configuration = plugin.getConfig();
        if (configuration == null)
            throw new NullPointerException("Configuration cannot be null");

        ConfigurationSection section = configuration.getConfigurationSection("redis");
        if (section == null)
            throw new NullPointerException("Redis section cannot be null");

        String host = section.getString("host");
        int port = section.getInt("port");
        String username = section.getString("username");
        String password = section.getString("password");

        return new RedisConfiguration(host, port, username, password);
    }
}