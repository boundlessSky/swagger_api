package com.clare.domain;

import java.util.Date;

public class Pr_user {

    private Long user_id;
    private String nick_name;
    private String login_account;
    private String login_password;
    private String reg_nbr;
    private String reg_typr;
    private String link_phone;
    private Date create_date;
    private String user_type;
    private String cust_id;
    private String cust_identifier_id;
    private Long login_cnt;
    private Date last_login_date;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getLogin_account() {
        return login_account;
    }

    public void setLogin_account(String login_account) {
        this.login_account = login_account;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }

    public String getReg_nbr() {
        return reg_nbr;
    }

    public void setReg_nbr(String reg_nbr) {
        this.reg_nbr = reg_nbr;
    }

    public String getReg_typr() {
        return reg_typr;
    }

    public void setReg_typr(String reg_typr) {
        this.reg_typr = reg_typr;
    }

    public String getLink_phone() {
        return link_phone;
    }

    public void setLink_phone(String link_phone) {
        this.link_phone = link_phone;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_identifier_id() {
        return cust_identifier_id;
    }

    public void setCust_identifier_id(String cust_identifier_id) {
        this.cust_identifier_id = cust_identifier_id;
    }

    public Long getLogin_cnt() {
        return login_cnt;
    }

    public void setLogin_cnt(Long login_cnt) {
        this.login_cnt = login_cnt;
    }

    public Date getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(Date last_login_date) {
        this.last_login_date = last_login_date;
    }
}
