package com.soft1851.music.admin.controller;


import com.alibaba.fastjson.JSONObject;
import com.soft1851.music.admin.common.ResponseResult;
import com.soft1851.music.admin.common.ResultCode;
import com.soft1851.music.admin.dto.AdminDto;
import com.soft1851.music.admin.dto.LoginDto;
import com.soft1851.music.admin.entity.SysAdmin;
import com.soft1851.music.admin.entity.SysRole;
import com.soft1851.music.admin.service.SysAdminService;
import com.soft1851.music.admin.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author su
 * @since 2020-04-21
 */
@RestController
@RequestMapping(value = "/sysAdmin")
@Slf4j
@Validated
public class SysAdminController {
    @Resource
    private SysAdminService sysAdminService;

    /**
     * 管理员登录
     * @param loginDto
     * @return String
     */
    @PostMapping("/login")
    public Map login(@RequestBody @Valid LoginDto loginDto) {
        log.info(loginDto.toString());
        return sysAdminService.login(loginDto);
    }

    @PostMapping("/u")
    public ResponseResult update(@RequestBody AdminDto adminDto) {
        log.info(adminDto.toString());
        return ResponseResult.success(sysAdminService.updateAdmin(adminDto));
    }
}