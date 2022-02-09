package com.techgeeks.instagram.downloader.huawei.listener;

import com.techgeeks.instagram.downloader.huawei.api.model.NodeModel;
import com.techgeeks.instagram.downloader.huawei.api.model.TrayModel;

public interface UserListInterface {
    void FacebookUserListClick(int i, NodeModel nodeModel);

    void FacebookUserListClick(int i, TrayModel trayModel);
}