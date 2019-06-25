package com.example.p2p.config;

import com.example.p2p.app.App;
import com.example.p2p.utils.FileUtils;

import java.io.File;

/**
 * 常量
 * Created by 陈健宇 at 2019/6/9
 */
public class Constant {

    public static final String EXTRA_TARGET_USER = "targetUser";

    public static final String FILE_NAME_USER = "user";
    public static final String FILE_PATH_USER = FileUtils.getFilePath(App.getContext(), "user/");
    public static final String FILE_PATH_ONLINE_USER = FileUtils.getFilePath(App.getContext(), "onlineUser/");

}