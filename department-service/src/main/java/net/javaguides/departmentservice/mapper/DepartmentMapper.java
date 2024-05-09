package net.javaguides.departmentservice.mapper;

import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {

     //Definir implementacion de la interfaz mapper, en tiempo de ejecucion se hara uso de esta clase
     DepartmentMapper MAPPER = Mappers.getMapper(DepartmentMapper.class);

     public DepartmentDto mapToDepartmentDto(Department department);
     public Department mapToDepartment(DepartmentDto departmentDto);
}
