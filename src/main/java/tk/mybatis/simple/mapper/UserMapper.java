package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

public interface UserMapper {
    /**
     * 通过ID查询用户
     * @param id
     * @return
     */
    SysUser selectById(Long id);

    /**
     * 查询全部用户
     */
    List<SysUser> selectAll();

    /**
     * 根据用户编号获取角色信息
     */
    List<SysRole> selectRolesByUserId(Long userId);

    /**
     * 创建用户
     */
    int insert(SysUser sysUser);
    int insert2(SysUser sysUser);
    int insert3(SysUser sysUser);
}
