package com.zjh.utils;

import com.alibaba.fastjson.JSON;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/***/
public class JsonSerializerForRedis  implements RedisSerializer<String> {


    @Override
    public byte[] serialize(String s) throws SerializationException {

        return new byte[0];
    }

    @Override
    public String deserialize(byte[] bytes) throws SerializationException {
        return null;
    }
}
