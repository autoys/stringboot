package com.njwb.ssm.mapper;

import com.njwb.ssm.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface DeptMapper {
    @Select("select deptno,dname,dloc from dept where deptno = #{deptno}")
    Dept getByNo(Integer deptno);

    void add(Dept dept);
}
