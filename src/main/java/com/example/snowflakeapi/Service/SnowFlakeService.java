package com.example.snowflakeapi.Service;

import com.example.snowflakeapi.Entity.SnowFlakeID;
import org.springframework.stereotype.Service;

@Service
public interface SnowFlakeService {
    public long newIdSequence();
}
