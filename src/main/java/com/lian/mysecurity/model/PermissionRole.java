package com.lian.mysecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/2 21:22
 */
@Data
@AllArgsConstructor
public class PermissionRole {
    private Long id;
    private Long roleId;
    private Long pId;
    private Long createTime;
}
