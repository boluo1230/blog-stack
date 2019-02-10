package com.mini.blogstack.base.config;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.WxMaInMemoryConfig;

/**
 * Created by Bolun Liu
 * Date:2019/2/10
 **/
public class WxConfiguration {

    public static WxMaInMemoryConfig getWxMaInMemoryConfig(String appId, String appSecret) {
        WxMaInMemoryConfig wxMaInMemoryConfig = new WxMaInMemoryConfig();
        wxMaInMemoryConfig.setAppid(appId);
        wxMaInMemoryConfig.setSecret(appSecret);
        return wxMaInMemoryConfig;
    }

    public static WxMaService getWxMaService(WxMaInMemoryConfig wxMaInMemoryConfig) {
        WxMaService wxMaService = new WxMaServiceImpl();
        wxMaService.setWxMaConfig(wxMaInMemoryConfig);
        return wxMaService;
    }

}
