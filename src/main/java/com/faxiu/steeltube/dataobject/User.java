package com.faxiu.steeltube.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author hekai
 * @Date 2018/11/26 11:13
 */
@Data
@Entity
public class User {

    @Id
    private String userId;

    private String username;

    private String password;
}
