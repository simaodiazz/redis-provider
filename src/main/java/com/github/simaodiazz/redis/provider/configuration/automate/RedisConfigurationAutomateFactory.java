package com.github.simaodiazz.redis.provider.configuration.automate;

import com.github.simaodiazz.redis.provider.configuration.RedisConfiguration;

public interface RedisConfigurationAutomateFactory {

    RedisConfiguration build(Object... args);

}
