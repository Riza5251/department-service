package net.javaguides.departmentservice.service.impl;

import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.entity.Department;
import net.javaguides.departmentservice.repository.DepartmentRepository;
import net.javaguides.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl  implements DepartmentService {

  private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department=new Department(departmentDto.getId(), departmentDto.getDepartmentName(), departmentDto.getDepartmentDescription(), departmentDto.getDepartmentCode());
       Department saved=  departmentRepository.save(department);
        DepartmentDto saveddp=new DepartmentDto(saved.getId(), saved.getDepartmentName(), saved.getDepartmentDescription(), saved.getDepartmentCode());
        return saveddp;

    }
}
