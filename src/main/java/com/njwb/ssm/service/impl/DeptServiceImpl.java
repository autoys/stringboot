package com.njwb.ssm.service.impl;

import com.njwb.ssm.mapper.DeptMapper;
import com.njwb.ssm.pojo.Dept;
import com.njwb.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("deptService")
@Transactional
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept getByNo(Integer deptNo) {
        return deptMapper.getByNo(deptNo);
    }

    @Override
    public void add(Dept dept) {
        deptMapper.add(dept);
    }
}
