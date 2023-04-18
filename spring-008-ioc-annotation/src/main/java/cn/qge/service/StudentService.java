package cn.qge.service;

import cn.qge.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/11 09:52
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@Service("studentService")
public class StudentService {
    @Resource(name = "studentDaoImplForMySQL")
    private StudentDao studentDao;

    public void deleteStudent(){
        studentDao.deleteById();
    }
}
