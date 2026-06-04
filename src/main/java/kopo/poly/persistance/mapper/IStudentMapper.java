package kopo.poly.persistance.mapper;

import kopo.poly.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface IStudentMapper {

    // insert 쿼리
    void insertStudent(StudentDTO pDTO) throws Exception;

    // select 여러건
    List<StudentDTO> getStudentList() throws Exception;

    // select 1건
    StudentDTO getStudent(StudentDTO pDTO) throws Exception;

    void updateStudent(StudentDTO pDTO) throws Exception;

    void deleteStudent(StudentDTO pDTO) throws Exception;
}