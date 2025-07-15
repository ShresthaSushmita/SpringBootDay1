package com.service;

import com.dao.EmployeeDao;
import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void registerEmployee(EmployeeDTO employeeDTO) {

        EmployeeEntity employeeEntity = new EmployeeEntity();

        //copy the data from employeeDTO tp employeeEntity
        BeanUtils.copyProperties(employeeDTO,employeeEntity);
        employeeDao.save(employeeEntity);
    }

    @Override
    public EmployeeDTO authenticate(String emailId, String password) {
        Optional<EmployeeEntity> optional = employeeDao.findByEmailIdAndPassword(emailId, password);

        EmployeeDTO employeeDTO = null;

        if (optional.isPresent()) {
            //if value is present
            EmployeeEntity employeeEntity = optional.get();

            employeeDTO = new EmployeeDTO();

            BeanUtils.copyProperties(employeeEntity, employeeDTO);

            return employeeDTO;    //it is having values    ---> NOT_NULL
        } else {
            //if value not present

            return employeeDTO;   //it is not having value   ---> NULL
        }
    }

    //fetch all records -------> findAll()
    @Override
    public List<EmployeeDTO> findAllEmployees() {
        List<EmployeeEntity> employeeEntity = employeeDao.findAll();

        //now we have to copy these objects(records) to employeeDTO
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        if(!employeeEntity.isEmpty()){
            for(EmployeeEntity tempoVar: employeeEntity){
                EmployeeDTO employeeDTO = new EmployeeDTO();
                BeanUtils.copyProperties(tempoVar, employeeDTO);
                employeeDTOList.add(employeeDTO);
            }
        }
        return employeeDTOList;
    }

    //deleting the employee by using deleteById
    @Override
    public void deleteEmployee(int employeeId) {
        employeeDao.deleteById(employeeId);
    }


}
