package com.lian.mysecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:08
 */
@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String password;
    private String phone;
    private Long createTime;
}
