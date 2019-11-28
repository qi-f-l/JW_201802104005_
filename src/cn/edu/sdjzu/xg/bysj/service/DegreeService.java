//201802104005漆风玲
package cn.edu.sdjzu.xg.bysj.service;

import cn.edu.sdjzu.xg.bysj.dao.DegreeDao;
import cn.edu.sdjzu.xg.bysj.domain.Degree;

import java.sql.SQLException;
import java.util.Collection;

public final class DegreeService {
    private static DegreeDao degreeDao
            = DegreeDao.getInstance();
    private static DegreeService degreeService
            =new DegreeService();
    private DegreeService(){}
    public static DegreeService getInstance(){
        return degreeService;
    }
    public Collection<Degree> findAll(){
        return degreeDao.findAll();
    }
    public Degree find(Integer id)throws SQLException{
        return degreeDao.find(id);
    }
    public boolean update(Degree degree)throws SQLException,ClassNotFoundException{
        return degreeDao.update(degree);
    }
    public boolean add(Degree degree) throws SQLException,ClassNotFoundException {
        return degreeDao.add(degree);
    }
    public boolean delete(Integer id) throws SQLException,ClassNotFoundException{
        return degreeDao.delete(id);//根据id从数据库中删除
    }
}

