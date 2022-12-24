package com.example.mock2db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("user")
public class User implements Serializable {

    @TableId
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private BigDecimal salary;

}
