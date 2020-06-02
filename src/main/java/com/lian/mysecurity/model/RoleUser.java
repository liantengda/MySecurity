package com.lian.mysecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:14
 */
@Data
@AllArgsConstructor
public class RoleUser {
    private Long id;
    private Long userId;
    private Long roleId;
    private Long createTime;
}
