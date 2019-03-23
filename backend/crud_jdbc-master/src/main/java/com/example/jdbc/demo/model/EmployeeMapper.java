package com.example.jdbc.demo.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<EmployeeResult> {
    @Override
    public EmployeeResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setAge(rs.getInt("age"));
        employee.setName(rs.getString("name"));
        employee.setActive(rs.getBoolean("active"));
        employee.setJabatan(rs.getString("jabatan"));
        employee.setDivisi(rs.getString("divisi"));

        EmployeeResult employeeResult = new EmployeeResult();
        employeeResult.setId(rs.getInt("id"));
        employeeResult.setAge(rs.getInt("age"));
        employeeResult.setName(rs.getString("name"));
        employeeResult.setActive(rs.getString("active"));
        employeeResult.setJabatan(rs.getString("jabatan"));
        employeeResult.setDivisi(rs.getString("divisi"));
        return employeeResult;
    }
}