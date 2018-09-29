package com.qianfeng.entity;

public class LateleaveKey {
    private Integer id;

    private String lateleave;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLateleave() {
        return lateleave;
    }

    public void setLateleave(String lateleave) {
        this.lateleave = lateleave == null ? null : lateleave.trim();
    }
}