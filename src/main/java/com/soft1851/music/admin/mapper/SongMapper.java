package com.soft1851.music.admin.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soft1851.music.admin.entity.Song;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author su
 * @since 2020-04-21
 */
public interface SongMapper extends BaseMapper<Song> {


    /**
     * 根据state状态查询用户列表，分页显示
     * @param page
     * @param state
     * @return
     */
    IPage<Song> selectSongsByPage(Page<?> page, Integer state);
}
