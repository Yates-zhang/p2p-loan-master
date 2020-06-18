package com.vanguard.p2p.system.service;

import com.github.pagehelper.PageInfo;
import com.vanguard.p2p.base.domain.UserLoginLog;
import com.vanguard.p2p.base.domain.User;
import com.vanguard.p2p.base.vo.UserVO;
import com.vanguard.p2p.exception.ValidateException;
import com.vanguard.p2p.pojo.P2PResult;

/**
 * @Descripe 管理员用户业务的接口类
 * @Author vanguard
 * @Date: 18/1/31
 * @Version 1.0
 *
 */
public interface IUserService {

    /**
     * 创建管理员以及插入角色记录
     * @param user 管理员信息
     * @param roleIds 角色记录ID
     * @param userName 操作人
     * @throws ValidateException 验证异常
     * @return
     */
    P2PResult insertUser(User user, String[] roleIds, String userName) throws ValidateException;

    /**
     * 根据管理员账号查找管理员
     * @param userName 管理员账号
     * @return
     */
    User getByUserName(String userName);

    /**
     * 根据管理员ID查找管理员信息
     * @param userId 管理员ID
     * @return
     */
    UserVO getById(Long userId);


    /**
     * 根据分页信息/搜索内容查找管理员列表
     * @param currentPage 第几页
     * @param pageSize 每页显示数量
     * @param search 搜索内容
     * @return
     */
    PageInfo<User> listByPage(Integer currentPage, Integer pageSize, String search);

    /**
     * 更新管理员登录日志
     * @param userId 管理员ID
     * @param UserLoginLog 用户登录日志
     */
    P2PResult updateLogById(Long userId, UserLoginLog UserLoginLog);

    /**
     * 更新管理员信息
     * @param user 管理员信息
     * @return
     */
    P2PResult updateByUserId(User user);

    /**
     * 更新管理员信息
     * @param user 管理员信息
     * @param roleIds 角色记录ID
     * @param userName 操作人
     * @return
     */
    P2PResult updateUser(User user, String[] roleIds, String userName);

    /**
     * 更新管理员密码
     * @param nowPassword 密码
     * @param newPassword 新密码
     * @param userId 管理员ID
     * @param userName 管理员昵称
     * @return
     */
    P2PResult updatePsw(String nowPassword, String newPassword, Long userId, String userName) throws ValidateException;

    /**
     * 更新管理员状态
     * @param userId 管理员ID
     * @return
     */
    P2PResult updateStatus(Long userId);

    /**
     * 更新管理员头像
     * @param userId 管理员ID
     * @param picImg 管理员头像
     * @return
     */
    P2PResult updateAvatar(Long userId, String picImg);

    /**
     * 根据管理员ID删除管理员,同时删除角色记录、登录日志
     * @param userId 管理员ID
     * @return
     */
    P2PResult deleteByUserId(Long userId);
}
