package com.github.simaodiazz.redis.provider;

import com.github.simaodiazz.redis.provider.configuration.RedisConfiguration;
import redis.clients.jedis.JedisPool;

public class Redis {

    private final JedisPool pool;

    public Redis(RedisConfiguration configuration) {
        this.pool = new JedisPool(
                configuration.getHost(),
                configuration.getPort(),
                configuration.getUsername(),
                configuration.getPassword()
        );
    }

    public JedisPool getPool() {
        return pool;
    }
}