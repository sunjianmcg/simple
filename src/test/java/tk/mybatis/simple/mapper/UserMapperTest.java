package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import tk.mybatis.simple.model.Country;
import tk.mybatis.simple.model.SysUser;

import java.util.List;


public class UserMapperTest extends BaseMapperTest {

    @Test
    public void testSelectById(){
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser user = userMapper.selectById(Long.valueOf(1));
            Assert.assertNotNull(user);
            Assert.assertEquals("admin", user.getUserName());

        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysUser> userList = userMapper.selectAll();
        }finally {
            sqlSession.close();
        }
    }

    public void printCountryList(List<Country> contryList){
        for (Country country : contryList){
            System.out.printf("%-4d%4s%4s\n",country.getId(),country.getCountryname(),country.getCountrycode());
        }
    }
}
