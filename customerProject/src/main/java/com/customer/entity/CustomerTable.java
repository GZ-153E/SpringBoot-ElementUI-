package com.customer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (CustomerTable)表实体类
 *
 * @author makejava
 * @since 2019-11-23 11:04:30
 */
@Data
@NoArgsConstructor
@SuppressWarnings("serial")
public class CustomerTable extends Model<CustomerTable> {

    @TableId(type = IdType.AUTO)
    private Integer id;
    
    private String name;
    
    private String sex;
    
    private String tell;
    
    private String addr;
}