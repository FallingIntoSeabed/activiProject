package jfs.stud.controller;

import jfs.stud.entity.SysUser;
import jfs.stud.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("/{id}")
    public SysUser getSysUserinfor(@PathVariable String id){
        SysUser sysUser = sysUserService.selectSysUserById(id);
        return sysUser;
    }

    @GetMapping("/list")
    public List<SysUser> getSysUserList(){
        List<SysUser> sysUserList = sysUserService.selectAll();
        return sysUserList;
    }
}
