package tk.mybatis.simple.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import tk.mybatis.simple.model.Country;

import java.io.IOException;
import java.io.Reader;
import java.util.List;


public class CountryMapperTest extends BaseMapperTest {

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try {
            List<Country> contryList = sqlSession.selectList("tk.mybatis.simple.mapper.CountryMapper.selectAll");
            printCountryList(contryList);

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
