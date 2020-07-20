package cn.domain;

import cn.dao.InterfaceUserDao;
import cn.user.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        InputStream in  = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();

        InterfaceUserDao dao = session.getMapper(InterfaceUserDao.class);

        List<User> lst = dao.findAll();

        for(User u : lst){
            System.out.println(u.toString());
        }

        session.close();
        in.close();
    }
}
