package com.roroterminal.lksys.service.impl;

import com.roroterminal.lksys.dao.RoroCarDAO;
import com.roroterminal.lksys.params.CarVO;
import com.roroterminal.lksys.service.RoroCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kimha on 2017-04-03.
 */
@Service
public class RoroCarServiceImpl implements RoroCarService {
    @Autowired
    private RoroCarDAO roroCarDAO;

    @Override
    public List<CarVO> getCarList() {
        return roroCarDAO.getCarList();
    }
}
