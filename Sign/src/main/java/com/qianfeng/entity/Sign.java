package com.qianfeng.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Sign {
    private Integer id;

    private String name;

    private Integer did;

    
    @DateTimeFormat(pattern = "yyyy-MM-dd hh：mm：ss")
    @JsonFormat(pattern="yyyy-MM-dd hh：mm：ss")
    private Date starttime;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh：mm：ss")
    @JsonFormat(pattern="yyyy-MM-dd hh：mm：ss")
    private Date endtime;


    private Integer llid;

    private Integer signnumber;

    private Integer latenumber;

    private Integer leavenumber;

    private Integer lacknumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }


    public Integer getLlid() {
        return llid;
    }

    public void setLlid(Integer llid) {
        this.llid = llid;
    }

    public Integer getSignnumber() {
        return signnumber;
    }

    public void setSignnumber(Integer signnumber) {
        this.signnumber = signnumber;
    }

    public Integer getLatenumber() {
        return latenumber;
    }

    public void setLatenumber(Integer latenumber) {
        this.latenumber = latenumber;
    }

    public Integer getLeavenumber() {
        return leavenumber;
    }

    public void setLeavenumber(Integer leavenumber) {
        this.leavenumber = leavenumber;
    }

    public Integer getLacknumber() {
        return lacknumber;
    }

    public void setLacknumber(Integer lacknumber) {
        this.lacknumber = lacknumber;
    }
}