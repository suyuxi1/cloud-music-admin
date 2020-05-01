package com.soft1851.music.admin.service;

import com.soft1851.music.admin.dto.AdminDto;
import com.soft1851.music.admin.entity.SysAdmin;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SysAdminServiceTest {

    @Resource
    private SysAdminService sysAdminService;
    @Test
    void updateAdmin() {
        AdminDto adminDto = new AdminDto();
        adminDto.setId("22516FB6A9D389D7FC21420806150A7B");
        adminDto.setName("1");
        System.out.println(sysAdminService.updateAdmin(adminDto));

    }
}