package com.hjrz.entity;

import java.util.Date;

public class Fu_resource {
    private Long fu_resource_id;

    private Long fu_parent_id;

    private String fu_resource_name;

    private String fu_resource_desc;

    private String fu_resource_url;

    private Date create_time;

    public Long getFu_resource_id() {
        return fu_resource_id;
    }

    public void setFu_resource_id(Long fu_resource_id) {
        this.fu_resource_id = fu_resource_id;
    }

    public Long getFu_parent_id() {
        return fu_parent_id;
    }

    public void setFu_parent_id(Long fu_parent_id) {
        this.fu_parent_id = fu_parent_id;
    }

    public String getFu_resource_name() {
        return fu_resource_name;
    }

    public void setFu_resource_name(String fu_resource_name) {
        this.fu_resource_name = fu_resource_name == null ? null : fu_resource_name.trim();
    }

    public String getFu_resource_desc() {
        return fu_resource_desc;
    }

    public void setFu_resource_desc(String fu_resource_desc) {
        this.fu_resource_desc = fu_resource_desc == null ? null : fu_resource_desc.trim();
    }

    public String getFu_resource_url() {
        return fu_resource_url;
    }

    public void setFu_resource_url(String fu_resource_url) {
        this.fu_resource_url = fu_resource_url == null ? null : fu_resource_url.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Fu_resource other = (Fu_resource) that;
        return (this.getFu_resource_id() == null ? other.getFu_resource_id() == null : this.getFu_resource_id().equals(other.getFu_resource_id()))
            && (this.getFu_parent_id() == null ? other.getFu_parent_id() == null : this.getFu_parent_id().equals(other.getFu_parent_id()))
            && (this.getFu_resource_name() == null ? other.getFu_resource_name() == null : this.getFu_resource_name().equals(other.getFu_resource_name()))
            && (this.getFu_resource_desc() == null ? other.getFu_resource_desc() == null : this.getFu_resource_desc().equals(other.getFu_resource_desc()))
            && (this.getFu_resource_url() == null ? other.getFu_resource_url() == null : this.getFu_resource_url().equals(other.getFu_resource_url()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFu_resource_id() == null) ? 0 : getFu_resource_id().hashCode());
        result = prime * result + ((getFu_parent_id() == null) ? 0 : getFu_parent_id().hashCode());
        result = prime * result + ((getFu_resource_name() == null) ? 0 : getFu_resource_name().hashCode());
        result = prime * result + ((getFu_resource_desc() == null) ? 0 : getFu_resource_desc().hashCode());
        result = prime * result + ((getFu_resource_url() == null) ? 0 : getFu_resource_url().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}