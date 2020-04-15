package com.wyz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* <p>
    * 
    * </p>
*
* @author wuyanzhong
* @since 2020-03-29
*/
    public class WxUser implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 帐户金额
            */
    private BigDecimal balance;

            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            /**
            * 生日
            */
    private Date birthday;

            /**
            * 性别 0女 1男
            */
    private Boolean sex;

            /**
            * 用户状态 1有效 0无效
            */
    private Boolean status;

            /**
            * 地址
            */
    private String address;

            /**
            * 昵称
            */
    private String name;

            /**
            * 注册来源  1小程序  2android
            */
    private Boolean source;

            /**
            * 昵称
            */
    private String nickname;

            /**
            * 密码
            */
    private String password;

            /**
            * 图片路径
            */
    private String icon;

            /**
            * 简介
            */
    private String introduction;

            /**
            * 电话
            */
    private String phone;

            /**
            * 邮件
            */
    private String email;

            /**
            * 微信用户标识
            */
    private String openid;

            /**
            * 微信用户标识
            */
    private String unionid;

            /**
            * 微信用户标识
            */
    private String wxappid;

            /**
            * 省id
            */
    private String provinceId;

            /**
            * 城市id
            */
    private String cityId;

            /**
            * 区域id
            */
    private String areaId;

            /**
            * 创建时间
            */
    private Date createTime;

            /**
            * 更新时间
            */
    private Date updateTime;

        public BigDecimal getBalance() {
        return balance;
        }

            public void setBalance(BigDecimal balance) {
        this.balance = balance;
        }
        public Long getId() {
        return id;
        }

            public void setId(Long id) {
        this.id = id;
        }
        public Date getBirthday() {
        return birthday;
        }

            public void setBirthday(Date birthday) {
        this.birthday = birthday;
        }
        public Boolean getSex() {
        return sex;
        }

            public void setSex(Boolean sex) {
        this.sex = sex;
        }
        public Boolean getStatus() {
        return status;
        }

            public void setStatus(Boolean status) {
        this.status = status;
        }
        public String getAddress() {
        return address;
        }

            public void setAddress(String address) {
        this.address = address;
        }
        public String getName() {
        return name;
        }

            public void setName(String name) {
        this.name = name;
        }
        public Boolean getSource() {
        return source;
        }

            public void setSource(Boolean source) {
        this.source = source;
        }
        public String getNickname() {
        return nickname;
        }

            public void setNickname(String nickname) {
        this.nickname = nickname;
        }
        public String getPassword() {
        return password;
        }

            public void setPassword(String password) {
        this.password = password;
        }
        public String getIcon() {
        return icon;
        }

            public void setIcon(String icon) {
        this.icon = icon;
        }
        public String getIntroduction() {
        return introduction;
        }

            public void setIntroduction(String introduction) {
        this.introduction = introduction;
        }
        public String getPhone() {
        return phone;
        }

            public void setPhone(String phone) {
        this.phone = phone;
        }
        public String getEmail() {
        return email;
        }

            public void setEmail(String email) {
        this.email = email;
        }
        public String getOpenid() {
        return openid;
        }

            public void setOpenid(String openid) {
        this.openid = openid;
        }
        public String getUnionid() {
        return unionid;
        }

            public void setUnionid(String unionid) {
        this.unionid = unionid;
        }
        public String getWxappid() {
        return wxappid;
        }

            public void setWxappid(String wxappid) {
        this.wxappid = wxappid;
        }
        public String getProvinceId() {
        return provinceId;
        }

            public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
        }
        public String getCityId() {
        return cityId;
        }

            public void setCityId(String cityId) {
        this.cityId = cityId;
        }
        public String getAreaId() {
        return areaId;
        }

            public void setAreaId(String areaId) {
        this.areaId = areaId;
        }
        public Date getCreateTime() {
        return createTime;
        }

            public void setCreateTime(Date createTime) {
        this.createTime = createTime;
        }
        public Date getUpdateTime() {
        return updateTime;
        }

            public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        }

    @Override
    public String toString() {
    return "WxUser{" +
            "balance=" + balance +
            ", id=" + id +
            ", birthday=" + birthday +
            ", sex=" + sex +
            ", status=" + status +
            ", address=" + address +
            ", name=" + name +
            ", source=" + source +
            ", nickname=" + nickname +
            ", password=" + password +
            ", icon=" + icon +
            ", introduction=" + introduction +
            ", phone=" + phone +
            ", email=" + email +
            ", openid=" + openid +
            ", unionid=" + unionid +
            ", wxappid=" + wxappid +
            ", provinceId=" + provinceId +
            ", cityId=" + cityId +
            ", areaId=" + areaId +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
    "}";
    }
}
