package jfs.stud.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class SysUser implements Serializable{

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String sex;
    private String phone;
}
