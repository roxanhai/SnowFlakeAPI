package com.example.snowflakeapi.Service;

import com.example.snowflakeapi.Entity.SnowFlakeID;
import org.springframework.stereotype.Service;

@Service
public class SnowFlakeServiceImpl implements SnowFlakeService{
    @Override
    public synchronized long newIdSequence() {
        SnowFlakeID tempSF = new SnowFlakeID();
        return tempSF.newIdSequence();
    }
}
