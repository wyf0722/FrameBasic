package com.fan.service;

import com.fan.dao.ResourceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface ResourceService {
    public boolean openURL(String url, String password);
}
