package net.incuventure.training.domain.repository;

import net.incuventure.training.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
@Transactional
public class EmployeeRepositoryTest {

    @Inject
    EmployeeRepository employeeRepository;

    @Test
    public void testThis() {

        Employee employee = new Employee("Gayward", "Mendoza");

        employeeRepository.persist(employee);

        Employee e = employeeRepository.load(1);

    }

    @Test
    public void testCount() {

        Employee employee = new Employee("Gayward", "Mendoza");

        employeeRepository.persist(employee);

        Long count = employeeRepository.getCount();

        System.out.println("total count is: " + count);

    }
}
