package com.txitxarra.aplimongo.respository;

import com.txitxarra.aplimongo.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends MongoRepository<Employee,String> {

    Employee getEmployeeByUuid(String uuid);

}
