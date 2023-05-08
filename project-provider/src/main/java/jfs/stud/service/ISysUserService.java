package jfs.stud.service;

import jfs.stud.entity.SysUser;

import java.util.List;

public interface ISysUserService {

    SysUser selectSysUserById(String id);

    List<SysUser> selectAll();
}
