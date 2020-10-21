package com.lemon.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hengtao.wu
 * @Date 2020/10/21 12:37
 **/
@Data
public class UserPO implements Serializable {


    private String name;

    private Integer id;

}
