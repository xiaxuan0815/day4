package com.lihaiyang.service.impl;

import com.lihaiyang.client.ArtificerClient;
import com.lihaiyang.entity.Artificer;
import com.lihaiyang.service.ArtificerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lihaiyang
 * @since 2020-11-12
 */
@Service
public class ArtificerServiceImpl implements ArtificerService {
    @Autowired
    private ArtificerClient artificerClient;

    @Override
    public List<Artificer> list() {
        return artificerClient.list();
    }

    @Override
    public Artificer getById(Long id) {
        return artificerClient.getById(id);
    }
}
