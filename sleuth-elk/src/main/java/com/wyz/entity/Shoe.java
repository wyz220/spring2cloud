package com.wyz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

/**
* <p>
    * 
    * </p>
*
* @author wuyanzhong
* @since 2020-03-10
*/
    public class Shoe implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "shoe_id", type = IdType.AUTO)
    private Long shoeId;

            /**
            * 图片路径
            */
    private Long fileId;

            /**
            * 名称
            */
    private String name;

            /**
            * 发售年份
            */
    private Integer year;

            /**
            * 发售价格
            */
    private Double releasePrice;

            /**
            * 货号
            */
    private String sn;

            /**
            * 1启用  0封停
            */
    private Boolean state;

            /**
            * 更新时间
            */
    private Date modifyDate;

            /**
            * 创建时间
            */
    private Date createDate;

            /**
            * 1跑鞋  2篮球鞋
            */
    private Boolean shoeType;

    private Boolean isCheck;

            /**
            * 作者标识
            */
    private Long authorId;

            /**
            * 测评数量
            */
    private Integer evaluationNum;

            /**
            * 粉丝数量
            */
    private Integer userNum;

            /**
            * 配色数量
            */
    private Integer colorNum;

            /**
            * 热度值，通过某种算法获得
            */
    private Integer hotNum;

        public Long getShoeId() {
        return shoeId;
        }

            public void setShoeId(Long shoeId) {
        this.shoeId = shoeId;
        }
        public Long getFileId() {
        return fileId;
        }

            public void setFileId(Long fileId) {
        this.fileId = fileId;
        }
        public String getName() {
        return name;
        }

            public void setName(String name) {
        this.name = name;
        }
        public Integer getYear() {
        return year;
        }

            public void setYear(Integer year) {
        this.year = year;
        }
        public Double getReleasePrice() {
        return releasePrice;
        }

            public void setReleasePrice(Double releasePrice) {
        this.releasePrice = releasePrice;
        }
        public String getSn() {
        return sn;
        }

            public void setSn(String sn) {
        this.sn = sn;
        }
        public Boolean getState() {
        return state;
        }

            public void setState(Boolean state) {
        this.state = state;
        }
        public Date getModifyDate() {
        return modifyDate;
        }

            public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
        }
        public Date getCreateDate() {
        return createDate;
        }

            public void setCreateDate(Date createDate) {
        this.createDate = createDate;
        }
        public Boolean getShoeType() {
        return shoeType;
        }

            public void setShoeType(Boolean shoeType) {
        this.shoeType = shoeType;
        }
        public Boolean getCheck() {
        return isCheck;
        }

            public void setCheck(Boolean isCheck) {
        this.isCheck = isCheck;
        }
        public Long getAuthorId() {
        return authorId;
        }

            public void setAuthorId(Long authorId) {
        this.authorId = authorId;
        }
        public Integer getEvaluationNum() {
        return evaluationNum;
        }

            public void setEvaluationNum(Integer evaluationNum) {
        this.evaluationNum = evaluationNum;
        }
        public Integer getUserNum() {
        return userNum;
        }

            public void setUserNum(Integer userNum) {
        this.userNum = userNum;
        }
        public Integer getColorNum() {
        return colorNum;
        }

            public void setColorNum(Integer colorNum) {
        this.colorNum = colorNum;
        }
        public Integer getHotNum() {
        return hotNum;
        }

            public void setHotNum(Integer hotNum) {
        this.hotNum = hotNum;
        }

    @Override
    public String toString() {
    return "Shoe{" +
            "shoeId=" + shoeId +
            ", fileId=" + fileId +
            ", name=" + name +
            ", year=" + year +
            ", releasePrice=" + releasePrice +
            ", sn=" + sn +
            ", state=" + state +
            ", modifyDate=" + modifyDate +
            ", createDate=" + createDate +
            ", shoeType=" + shoeType +
            ", isCheck=" + isCheck +
            ", authorId=" + authorId +
            ", evaluationNum=" + evaluationNum +
            ", userNum=" + userNum +
            ", colorNum=" + colorNum +
            ", hotNum=" + hotNum +
    "}";
    }
}
