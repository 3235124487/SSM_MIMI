package com.sh.service;

import com.sh.pojo.Admin;

/**
 * @author GGBond
 * @version 1.0
 */
public interface AdminService {
    Admin login(String name, String password);

    int insert(Admin admin);
}
