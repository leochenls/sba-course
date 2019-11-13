package com.sba.course.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.sba.course.model.BatchCourse;
import com.sba.course.model.Course;
import com.sba.course.model.CourseMentor;


@Mapper
public interface CourseMapper {

	@Insert("insert into sba_course.course(name,description,skill,startDate,endDate,mentorName,fee,disabled,status) values(#{name},#{description},#{skill},date_add(#{startDate},interval 1 day),date_add(#{endDate},interval 1 day),#{mentorName},#{fee},0,'available')")
	@SelectKey(statement = "select LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
	void addCourse(Course course);
	
	@Select("SELECT id,name,skill,startDate,endDate,status, userName,description, DATEDIFF(endDate, startDate) as duration, schedule,(case when disabled = 1 and disable_startDate <= DATE_FORMAT(sysdate(),'%y-%c-%d') and disable_endDate >= DATE_FORMAT(sysdate(),'%y-%c-%d') then 1 else 0 end) as disabled,disable_startDate disableStartDate, disable_endDate disableEndDate FROM sba_course.course where mentorName=#{mentorname} and progress = #{progress} and ( (disabled = 1 and (disable_startDate > DATE_FORMAT(sysdate(),'%y-%c-%d') or disable_endDate < DATE_FORMAT(sysdate(),'%y-%c-%d')) ) or disabled = 0 )")
	List<CourseMentor> findMentprCourse(@Param("mentorname") String mentorname, @Param("progress") Integer progress);
	
	@Select("SELECT id,name,skill,startDate,endDate,fee,status, userName,description, DATEDIFF(endDate, startDate) as duration, schedule,(case when disabled = 1 and disable_startDate <= DATE_FORMAT(sysdate(),'%y-%c-%d') and disable_endDate >= DATE_FORMAT(sysdate(),'%y-%c-%d') then 1 else 0 end) as disabled,disable_startDate disableStartDate, disable_endDate disableEndDate FROM sba_course.course where mentorName=#{mentorname} and progress is null")
	List<CourseMentor> findMentprAvailableCourse(@Param("mentorname") String mentorname);
	
	@Update("update sba_course.course set status = #{status},schedule=#{schedule} where id = #{courseid}")
	void updateCourseStatus(@Param("courseid") Integer courseid, @Param("status") String status, @Param("schedule") Integer schedule);
	
	@Update("update sba_course.course set disabled = '1' where id = #{courseid}")
	void disableCourseStatus(@Param("courseid") Integer courseid);
	
	@Update("update sba_course.course set disabled = '0' where id = #{courseid}")
	void enableCourseStatus(@Param("courseid") Integer courseid);
	
	@Update("update sba_course.course set status = #{status},progress = 2,schedule=100 where id = #{courseid}")
	void updateCourseCompletedStatus(@Param("courseid") Integer courseid, @Param("status") String status);
	
	@Update("update sba_course.course set status = 'expried' where id = #{courseid}")
	void updateBatchCourseStatus(@Param("courseid") Integer courseid);
	
	@Delete("delete from sba_course.course where id = #{courseid}")
	void deleteCourse(@Param("courseid") Integer courseid);
	
	@Select("select id,endDate FROM sba_course.course where progress is null and status='available'")
	List<BatchCourse> batchCourse();
	
	@Update("update sba_course.course set name=#{name},description=#{description},skill=#{skill},startDate=#{startDate},endDate=#{endDate},fee=fee,disable_startDate=#{disableStartDate},disable_endDate=#{disableEndDate} where id = #{id}")
	void updateCourse(Course course);
}
