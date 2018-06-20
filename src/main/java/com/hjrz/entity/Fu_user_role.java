package com.hjrz.entity;

public class Fu_user_role {
    private Long fu_user_role_id;

    private Long fu_user_id;

    private Long fu_role_id;

    public Long getFu_user_role_id() {
        return fu_user_role_id;
    }

    public void setFu_user_role_id(Long fu_user_role_id) {
        this.fu_user_role_id = fu_user_role_id;
    }

    public Long getFu_user_id() {
        return fu_user_id;
    }

    public void setFu_user_id(Long fu_user_id) {
        this.fu_user_id = fu_user_id;
    }

    public Long getFu_role_id() {
        return fu_role_id;
    }

    public void setFu_role_id(Long fu_role_id) {
        this.fu_role_id = fu_role_id;
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
        Fu_user_role other = (Fu_user_role) that;
        return (this.getFu_user_role_id() == null ? other.getFu_user_role_id() == null : this.getFu_user_role_id().equals(other.getFu_user_role_id()))
            && (this.getFu_user_id() == null ? other.getFu_user_id() == null : this.getFu_user_id().equals(other.getFu_user_id()))
            && (this.getFu_role_id() == null ? other.getFu_role_id() == null : this.getFu_role_id().equals(other.getFu_role_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFu_user_role_id() == null) ? 0 : getFu_user_role_id().hashCode());
        result = prime * result + ((getFu_user_id() == null) ? 0 : getFu_user_id().hashCode());
        result = prime * result + ((getFu_role_id() == null) ? 0 : getFu_role_id().hashCode());
        return result;
    }
}