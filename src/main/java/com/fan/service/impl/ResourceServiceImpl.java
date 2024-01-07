package com.fan.service.impl;


import com.fan.dao.ResourceDao;
import com.fan.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private ResourceDao resourceDao;
    @Override
    public boolean openURL(String url, String password) {
        return resourceDao.readResources(url, password);
    }
}
