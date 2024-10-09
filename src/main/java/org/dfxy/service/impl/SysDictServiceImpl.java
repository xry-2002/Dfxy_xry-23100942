package org.dfxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dfxy.entity.SysDict;
import org.dfxy.mapper.SysDictMapper;
import org.dfxy.service.ISysDictService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 */
@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements ISysDictService {
}
