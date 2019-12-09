package com.ftf.ftfProject.service;

import com.ftf.ftfProject.entity.Collections;

import java.util.List;

public interface CollectionsService {

    List<Collections> getCollections();

    /**
     * 保存收藏
     * @return
     */
    String saveCollection(Collections collections);
}
