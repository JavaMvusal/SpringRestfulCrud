package net.guides.springbootbackend.repository;

import net.guides.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//JPA internally provides @Repository annotation,actually we no need to add @Repository annotation
//But like this readable and cleanable
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
