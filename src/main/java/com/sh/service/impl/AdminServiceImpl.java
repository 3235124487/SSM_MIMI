package com.sh.service.impl;

import com.sh.mapper.AdminMapper;
import com.sh.pojo.Admin;
import com.sh.pojo.AdminExample;
import com.sh.service.AdminService;
import com.sh.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GGBond
 * @version 1.0
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String name, String password) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andANameEqualTo(name);
        List<Admin> list = adminMapper.selectByExample(adminExample);

        if(list.size() > 0){
            Admin admin = list.get(0);
            if(admin.getaPass().equals(password)){
                return admin;
            }
        }
        return null;
    }

    @Override
    public int insert(Admin admin) {
        return adminMapper.insert(admin);
    }
}
