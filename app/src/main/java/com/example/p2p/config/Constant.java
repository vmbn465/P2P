package com.example.p2p.config;

import com.example.p2p.app.App;
import com.example.p2p.utils.FileUtil;
import com.example.utils.FileUtils;

/**
 * 常量
 * Created by 陈健宇 at 2019/6/9
 */
public class Constant {

    public static final String EXTRA_TARGET_USER = "targetUser";

    public static final String FILE_NAME_USER = "user";
    public static final String FILE_PATH_USER = FileUtils.getFilePath(App.getContext(), "user/");
    public static final String FILE_USER_IMAGE = FILE_PATH_USER + "userImage.png";
    public static final String FILE_PATH_ONLINE_USER = FileUtils.getFilePath(App.getContext(),  "/P2P/onlineUser/");

    public static final int MAX_SELECTED_PHOTO = 9;
    public static final String KEY_CLICK_POSITION = "clickPos";
    public static final String KEY_MODE = "mode";
    public static final int REQUEST_UPDATA_SELECT_PHOTOS = 0;

    public static final int WAITING_TIME = 3000;

}
