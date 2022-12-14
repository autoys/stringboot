package com.njwb.ssm.service;

import com.njwb.ssm.pojo.Dept;

public interface DeptService {
    Dept getByNo(Integer deptNo);

    void add(Dept dept);
}
