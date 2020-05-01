package com.soft1851.music.admin.dto;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author su
 * @className AdminDto
 * @Description TODO
 * @Date 2020/5/1
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {

    private String id;
    private String name;
    private String password;
    private String avatar;
}
