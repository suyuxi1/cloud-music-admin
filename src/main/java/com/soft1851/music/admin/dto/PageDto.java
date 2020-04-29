package com.soft1851.music.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author su
 * @className PageDto
 * @Description TODO
 * @Date 2020/4/25 0:05
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageDto {

    private Integer currentPage;
    private Integer pageSize;
}
