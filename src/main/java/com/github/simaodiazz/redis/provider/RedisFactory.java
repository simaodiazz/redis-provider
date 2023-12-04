package com.github.simaodiazz.redis.provider;

import com.github.simaodiazz.redis.provider.configuration.RedisConfiguration;
import redis.clients.jedis.JedisPool;

public class RedisFactory {

    private static RedisFactory instance;

    public JedisPool build(RedisConfiguration configuration) {
        return new JedisPool(configuration.getHost(), configuration.getPort(), configuration.getUsername(), configuration.getPassword());
    }

    public static RedisFactory getInstance() {
        if (instance == null) instance = new RedisFactory();
        return instance;
    }
}