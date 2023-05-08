package jfs.stud.mapper;

import jfs.stud.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysUserMapper {

    SysUser selectSysUserById(String id);

    List<SysUser> selectAll();
}
