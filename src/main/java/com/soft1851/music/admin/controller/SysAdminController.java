package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.common.ResponseResult;
import com.soft1851.music.admin.dto.AdminDto;
import com.soft1851.music.admin.dto.LoginDto;
import com.soft1851.music.admin.service.SysAdminService;
import com.soft1851.music.admin.util.AliOssUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Map;

/**
 * <p>
 * 前端控制器
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
     *
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

    @PostMapping("/a")
    public ResponseResult updateAvatar(@RequestBody AdminDto adminDto) {
        log.info(adminDto.toString());
        return ResponseResult.success(sysAdminService.updateAdminAvatar(adminDto));
    }

    @PostMapping("/upload")
    public ResponseResult uploadFile(@RequestParam("file") MultipartFile multipartFile, @RequestParam("id") String id) {
        String url = AliOssUtil.upload(multipartFile);
        AdminDto adminDto = AdminDto.builder().id(id).avatar(url).build();
        sysAdminService.updateAvatar(adminDto);
        return ResponseResult.success(url);
    }
}