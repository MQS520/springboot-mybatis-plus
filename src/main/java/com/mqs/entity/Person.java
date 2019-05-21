package com.mqs.entity;

    import com.baomidou.mybatisplus.extension.activerecord.Model;
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
    public class Person extends Model<Person> {

    private static final long serialVersionUID = 1L;

    private Integer age;

    private String name;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
