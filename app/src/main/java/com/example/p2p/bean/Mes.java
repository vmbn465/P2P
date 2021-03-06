package com.example.p2p.bean;

import androidx.annotation.NonNull;

/**
 * 聊天内容
 * Created by 陈健宇 at 2019/6/10
 */
public class Mes<T>{

    public ItemType itemType;//Mes的Item类型
    public MesType mesType;//Mes的类型
    public String userIp;//发送Mes的用户的ip
    public T data;//具体消息

    public Mes(MesType mesType){
        this(ItemType.ERROR, mesType, "0.0.0.0", null);
    }

    public Mes(ItemType itemType, MesType mesType, String userIp, T data) {
        this.itemType = itemType;
        this.mesType = mesType;
        this.userIp = userIp;
        this.data = data;
    }

    public Mes<T> clone(){
        return new Mes<T>(itemType, mesType, userIp, data);
    }

    @NonNull
    @Override
    public String toString() {
        return "Mes[itemType = " + itemType
                + ", type = " + mesType
                + ", userIp = " + userIp
                +  ", data = " + data
                + "]";
    }
}
