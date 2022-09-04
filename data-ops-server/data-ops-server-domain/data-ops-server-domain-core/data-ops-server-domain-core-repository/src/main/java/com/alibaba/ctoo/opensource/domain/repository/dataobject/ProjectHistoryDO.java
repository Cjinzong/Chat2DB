package com.alibaba.ctoo.opensource.domain.repository.dataobject;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author liugong
 */
public class ProjectHistoryDO {
    /**
     * Database Column Remarks:
     *   主键
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Long id;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Date gmtCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Date gmtModified;

    /**
     * Database Column Remarks:
     *   创建人
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private String creator;

    /**
     * Database Column Remarks:
     *   修改人
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private String modifier;

    /**
     * Database Column Remarks:
     *   逻辑删除标志 删除的时候 将当前字段设置成id，0 - 有效  其他有效
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Long deletedId;

    /**
     * Database Column Remarks:
     *   租户id
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private String tenantId;

    /**
     * Database Column Remarks:
     *   点赞数量
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Integer starCount;

    /**
     * Database Column Remarks:
     *   分支数量
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Integer forkCount;

    /**
     * Database Column Remarks:
     *   刷新日期
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Date gmtRefresh;

    /**
     * Database Column Remarks:
     *   项目id
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Long projectId;

    /**
     * @return
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", creator=").append(creator);
        sb.append(", modifier=").append(modifier);
        sb.append(", deletedId=").append(deletedId);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", starCount=").append(starCount);
        sb.append(", forkCount=").append(forkCount);
        sb.append(", gmtRefresh=").append(gmtRefresh);
        sb.append(", projectId=").append(projectId);
        sb.append("]");
        return sb.toString();
    }
}