package com.test.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.test.boot.entity.TbUser;

@Mapper
public interface TbUserMapper {
	@Select("select * from tb_user")
	List<TbUser> findAll();
}
