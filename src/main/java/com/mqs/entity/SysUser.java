package com.mqs.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author MQS
* @since 2019-05-06
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

            @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private String userName;

    private String password;

    private String role;

    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
