package com.beparking.accountservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/roles/")
public class RoleController {

    private final RoleService roleService;

    public RoleController (RoleService roleService) {
        this.roleService = roleService;
    }

    public List<RoleDTO> findAll(){

    }

    public void modifiedPermission(Role role){
        roleService.updateRole(role);
    }
}
