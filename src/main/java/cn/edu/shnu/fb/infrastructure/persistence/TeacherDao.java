package cn.edu.shnu.fb.infrastructure.persistence;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.edu.shnu.fb.domain.user.Teacher;

/**
 * Created by bytenoob on 15/11/7.
 */
public interface TeacherDao extends PagingAndSortingRepository<Teacher,Integer> {
    Teacher findByName(String name);
    List<Teacher> findByNameLike(String name);
    List<Teacher> findByNameIsNotNullOrderByIdCode();

}
