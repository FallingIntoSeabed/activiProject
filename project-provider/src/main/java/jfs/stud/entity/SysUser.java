package jfs.stud.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class SysUser implements Serializable{

    private static final long serialVersionUID = 1L;
    private String id;
    private String username;
    private String password;
    private String salt;
    private String locked;
}
