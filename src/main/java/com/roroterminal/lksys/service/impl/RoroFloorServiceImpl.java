package com.roroterminal.lksys.service.impl;

import com.roroterminal.lksys.dao.RoroFloorDao;
import com.roroterminal.lksys.params.YardVO;
import com.roroterminal.lksys.service.RoroFloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kimha on 2017-03-28.
 */
@Service
public class RoroFloorServiceImpl implements RoroFloorService{
    @Autowired
    private RoroFloorDao roroFloorDao;

    @Override
    public YardVO getRoroFloorInfo() {
        return roroFloorDao.getRoroFloorInfo();
    }
}
