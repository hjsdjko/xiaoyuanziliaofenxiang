package com.entity.model;

import com.entity.WenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 文件信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WenjianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 文件名称
     */
    private String wenjianName;


    /**
     * 文件类型
     */
    private Integer wenjianTypes;


    /**
     * 文件图片
     */
    private String wenjianPhoto;


    /**
     * 文件
     */
    private String wenjianFile;


    /**
     * 下载积分
     */
    private Integer wenjianJifenNumber;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 文件状态
     */
    private Integer wenjianStatusTypes;


    /**
     * 文件标识
     */
    private Integer biaoshiStatusTypes;


    /**
     * 文件详情
     */
    private String wenjianContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：文件名称
	 */
    public String getWenjianName() {
        return wenjianName;
    }


    /**
	 * 设置：文件名称
	 */
    public void setWenjianName(String wenjianName) {
        this.wenjianName = wenjianName;
    }
    /**
	 * 获取：文件类型
	 */
    public Integer getWenjianTypes() {
        return wenjianTypes;
    }


    /**
	 * 设置：文件类型
	 */
    public void setWenjianTypes(Integer wenjianTypes) {
        this.wenjianTypes = wenjianTypes;
    }
    /**
	 * 获取：文件图片
	 */
    public String getWenjianPhoto() {
        return wenjianPhoto;
    }


    /**
	 * 设置：文件图片
	 */
    public void setWenjianPhoto(String wenjianPhoto) {
        this.wenjianPhoto = wenjianPhoto;
    }
    /**
	 * 获取：文件
	 */
    public String getWenjianFile() {
        return wenjianFile;
    }


    /**
	 * 设置：文件
	 */
    public void setWenjianFile(String wenjianFile) {
        this.wenjianFile = wenjianFile;
    }
    /**
	 * 获取：下载积分
	 */
    public Integer getWenjianJifenNumber() {
        return wenjianJifenNumber;
    }


    /**
	 * 设置：下载积分
	 */
    public void setWenjianJifenNumber(Integer wenjianJifenNumber) {
        this.wenjianJifenNumber = wenjianJifenNumber;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：文件状态
	 */
    public Integer getWenjianStatusTypes() {
        return wenjianStatusTypes;
    }


    /**
	 * 设置：文件状态
	 */
    public void setWenjianStatusTypes(Integer wenjianStatusTypes) {
        this.wenjianStatusTypes = wenjianStatusTypes;
    }
    /**
	 * 获取：文件标识
	 */
    public Integer getBiaoshiStatusTypes() {
        return biaoshiStatusTypes;
    }


    /**
	 * 设置：文件标识
	 */
    public void setBiaoshiStatusTypes(Integer biaoshiStatusTypes) {
        this.biaoshiStatusTypes = biaoshiStatusTypes;
    }
    /**
	 * 获取：文件详情
	 */
    public String getWenjianContent() {
        return wenjianContent;
    }


    /**
	 * 设置：文件详情
	 */
    public void setWenjianContent(String wenjianContent) {
        this.wenjianContent = wenjianContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
