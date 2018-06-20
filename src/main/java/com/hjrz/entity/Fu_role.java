package com.hjrz.entity;

import java.util.Date;

public class Fu_role {
    private Long fu_role_id;

    private Long fu_parent_id;

    private String fu_role_name;

    private String fu_role_desc;

    private Date create_time;

    public Long getFu_role_id() {
        return fu_role_id;
    }

    public void setFu_role_id(Long fu_role_id) {
        this.fu_role_id = fu_role_id;
    }

    public Long getFu_parent_id() {
        return fu_parent_id;
    }

    public void setFu_parent_id(Long fu_parent_id) {
        this.fu_parent_id = fu_parent_id;
    }

    public String getFu_role_name() {
        return fu_role_name;
    }

    public void setFu_role_name(String fu_role_name) {
        this.fu_role_name = fu_role_name == null ? null : fu_role_name.trim();
    }

    public String getFu_role_desc() {
        return fu_role_desc;
    }

    public void setFu_role_desc(String fu_role_desc) {
        this.fu_role_desc = fu_role_desc == null ? null : fu_role_desc.trim();
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
        Fu_role other = (Fu_role) that;
        return (this.getFu_role_id() == null ? other.getFu_role_id() == null : this.getFu_role_id().equals(other.getFu_role_id()))
            && (this.getFu_parent_id() == null ? other.getFu_parent_id() == null : this.getFu_parent_id().equals(other.getFu_parent_id()))
            && (this.getFu_role_name() == null ? other.getFu_role_name() == null : this.getFu_role_name().equals(other.getFu_role_name()))
            && (this.getFu_role_desc() == null ? other.getFu_role_desc() == null : this.getFu_role_desc().equals(other.getFu_role_desc()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFu_role_id() == null) ? 0 : getFu_role_id().hashCode());
        result = prime * result + ((getFu_parent_id() == null) ? 0 : getFu_parent_id().hashCode());
        result = prime * result + ((getFu_role_name() == null) ? 0 : getFu_role_name().hashCode());
        result = prime * result + ((getFu_role_desc() == null) ? 0 : getFu_role_desc().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}