package com.example.demo.kit;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * WrapperKit
 *
 * 一句话功能简述 功能详细描述
 *
 * @author hewei
 * @version [1.0.0, 2019/2/3]
 */
public class WrapperKit {

    private WrapperKit() {
    }

    public static <T> QueryWrapper<T> query() {
        return new QueryWrapper<>();
    }

    public static <T> UpdateWrapper<T> update() {
        return new UpdateWrapper<>();
    }
}

