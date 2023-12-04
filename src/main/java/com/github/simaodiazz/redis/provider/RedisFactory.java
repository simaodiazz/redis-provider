package com.github.simaodiazz.redis.provider;

import com.github.simaodiazz.redis.provider.configuration.RedisConfiguration;

public class RedisFactory {

    private static RedisFactory instance;

    public Redis build(RedisConfiguration configuration) {
        return new Redis(configuration);
    }

    public static RedisFactory getInstance() {
        if (instance == null) instance = new RedisFactory();
        return instance;
    }
}