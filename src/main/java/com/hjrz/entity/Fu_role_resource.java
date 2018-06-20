package com.hjrz.entity;

public class Fu_role_resource {
    private Long fu_role_resource_id;

    private Long fu_role_id;

    private Long fu_resource_id;

    public Long getFu_role_resource_id() {
        return fu_role_resource_id;
    }

    public void setFu_role_resource_id(Long fu_role_resource_id) {
        this.fu_role_resource_id = fu_role_resource_id;
    }

    public Long getFu_role_id() {
        return fu_role_id;
    }

    public void setFu_role_id(Long fu_role_id) {
        this.fu_role_id = fu_role_id;
    }

    public Long getFu_resource_id() {
        return fu_resource_id;
    }

    public void setFu_resource_id(Long fu_resource_id) {
        this.fu_resource_id = fu_resource_id;
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
        Fu_role_resource other = (Fu_role_resource) that;
        return (this.getFu_role_resource_id() == null ? other.getFu_role_resource_id() == null : this.getFu_role_resource_id().equals(other.getFu_role_resource_id()))
            && (this.getFu_role_id() == null ? other.getFu_role_id() == null : this.getFu_role_id().equals(other.getFu_role_id()))
            && (this.getFu_resource_id() == null ? other.getFu_resource_id() == null : this.getFu_resource_id().equals(other.getFu_resource_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFu_role_resource_id() == null) ? 0 : getFu_role_resource_id().hashCode());
        result = prime * result + ((getFu_role_id() == null) ? 0 : getFu_role_id().hashCode());
        result = prime * result + ((getFu_resource_id() == null) ? 0 : getFu_resource_id().hashCode());
        return result;
    }
}