package com.lian.mysecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:12
 */
@Data
@AllArgsConstructor
public class Role {
    private Long id;
    private String roleName;
    private Long createTime;
}
