package com.cf.entity;

/**
 * 环境信息bean
 */
public class EnvInfo {
    /**
     * id
     */
    private Integer id;

    /**
     * 环境名称
     */
    private String envName;

    /**
     * 环境编码
     */
    private String envCode;

    /**
     * 备注
     */
    private String memo;

    /**
     * 应用信息表外键
     */
    private Integer appId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName == null ? null : envName.trim();
    }

    public String getEnvCode() {
        return envCode;
    }

    public void setEnvCode(String envCode) {
        this.envCode = envCode == null ? null : envCode.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}