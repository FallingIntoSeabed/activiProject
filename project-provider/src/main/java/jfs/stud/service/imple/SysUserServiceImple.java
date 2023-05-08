package jfs.stud.service.imple;

import jfs.stud.entity.SysUser;
import jfs.stud.mapper.SysUserMapper;
import jfs.stud.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImple implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectSysUserById(String id) {
        return sysUserMapper.selectSysUserById(id) ;
    }

    @Override
    public List<SysUser> selectAll() {
        return sysUserMapper.selectAll();
    }
}
