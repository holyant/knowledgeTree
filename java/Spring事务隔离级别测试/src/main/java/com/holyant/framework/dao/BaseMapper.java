package com.holyant.framework.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public abstract interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T>{

}
