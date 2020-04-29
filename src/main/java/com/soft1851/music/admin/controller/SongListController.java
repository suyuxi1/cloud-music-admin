package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.dto.PageDto;
import com.soft1851.music.admin.entity.SongList;
import com.soft1851.music.admin.service.SongListService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author su
 * @since 2020-04-21
 */
@RestController
@RequestMapping("/songList")
public class SongListController {

    @Resource
    private SongListService songListService;


    @GetMapping("/all")
    public List<Map<String, Object>> getSongListAll(){
        return songListService.getByType();
    }

    @PostMapping("/page")
    public Map<String, Object> getSongListByPage(@RequestBody PageDto pageDto){
        return songListService.getByPage(pageDto);
    }

    @GetMapping("/blurSelect")
    public List<SongList> getBlurSelect(String field){
        return songListService.blurSelect(field);
    }


}
