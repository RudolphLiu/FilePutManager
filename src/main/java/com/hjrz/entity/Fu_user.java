package com.hjrz.entity;

import com.hjrz.constants.Gender;
import com.hjrz.constants.UserStateEnum;

import java.io.Serializable;
import java.util.Date;

public class Fu_user implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long fu_user_id;

    private String fu_username;

    private String fu_password;

    private String fu_realname;

    private Gender fu_gender;

    private String fu_phonenum;

    private UserStateEnum fu_state;

    private Date create_time;

    public Long getFu_user_id() {
        return fu_user_id;
    }

    public void setFu_user_id(Long fu_user_id) {
        this.fu_user_id = fu_user_id;
    }

    public String getFu_username() {
        return fu_username;
    }

    public void setFu_username(String fu_username) {
        this.fu_username = fu_username == null ? null : fu_username.trim();
    }

    public String getFu_password() {
        return fu_password;
    }

    public void setFu_password(String fu_password) {
        this.fu_password = fu_password == null ? null : fu_password.trim();
    }

    public String getFu_realname() {
        return fu_realname;
    }

    public void setFu_realname(String fu_realname) {
        this.fu_realname = fu_realname == null ? null : fu_realname.trim();
    }

    public Gender getFu_gender() {
        return fu_gender;
    }

    public void setFu_gender(Gender fu_gender) {
        this.fu_gender = fu_gender;
    }

    public String getFu_phonenum() {
        return fu_phonenum;
    }

    public void setFu_phonenum(String fu_phonenum) {
        this.fu_phonenum = fu_phonenum == null ? null : fu_phonenum.trim();
    }

    public UserStateEnum getFu_state() {
        return fu_state;
    }

    public void setFu_state(UserStateEnum fu_state) {
        this.fu_state = fu_state;
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
        Fu_user other = (Fu_user) that;
        return (this.getFu_user_id() == null ? other.getFu_user_id() == null : this.getFu_user_id().equals(other.getFu_user_id()))
            && (this.getFu_username() == null ? other.getFu_username() == null : this.getFu_username().equals(other.getFu_username()))
            && (this.getFu_password() == null ? other.getFu_password() == null : this.getFu_password().equals(other.getFu_password()))
            && (this.getFu_realname() == null ? other.getFu_realname() == null : this.getFu_realname().equals(other.getFu_realname()))
            && (this.getFu_gender() == null ? other.getFu_gender() == null : this.getFu_gender().equals(other.getFu_gender()))
            && (this.getFu_phonenum() == null ? other.getFu_phonenum() == null : this.getFu_phonenum().equals(other.getFu_phonenum()))
            && (this.getFu_state() == null ? other.getFu_state() == null : this.getFu_state().equals(other.getFu_state()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFu_user_id() == null) ? 0 : getFu_user_id().hashCode());
        result = prime * result + ((getFu_username() == null) ? 0 : getFu_username().hashCode());
        result = prime * result + ((getFu_password() == null) ? 0 : getFu_password().hashCode());
        result = prime * result + ((getFu_realname() == null) ? 0 : getFu_realname().hashCode());
        result = prime * result + ((getFu_gender() == null) ? 0 : getFu_gender().hashCode());
        result = prime * result + ((getFu_phonenum() == null) ? 0 : getFu_phonenum().hashCode());
        result = prime * result + ((getFu_state() == null) ? 0 : getFu_state().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}