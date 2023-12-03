package com.github.simaodiazz.redis.provider.configuration.automate;

import com.github.simaodiazz.redis.provider.configuration.automate.impl.PaperRedisConfigurationAutomateFactory;

public class RedisConfigurationAutomateClient {

    private static RedisConfigurationAutomateClient instance;

    private final RedisConfigurationAutomateFactory paperFactory;

    public RedisConfigurationAutomateClient() {
        this.paperFactory = new PaperRedisConfigurationAutomateFactory();
    }

    public RedisConfigurationAutomateFactory getFactory(RedisConfigurationAutomateType type) {
        return paperFactory;
    }

    public static RedisConfigurationAutomateClient getInstance() {
        if (instance == null) instance = new RedisConfigurationAutomateClient();
        return instance;
    }
}
