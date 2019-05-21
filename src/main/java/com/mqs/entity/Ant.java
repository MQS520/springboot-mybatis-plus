package com.mqs.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Ant implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "ant_id", type = IdType.AUTO)
    private Integer antId;

    private String antName;

    private String antCc;


}
