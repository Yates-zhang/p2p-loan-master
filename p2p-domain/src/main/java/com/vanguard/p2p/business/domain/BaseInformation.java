package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import com.vanguard.p2p.base.domain.SystemDictionaryItem;
import com.vanguard.p2p.utils.BitStatesUtils;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

/**
 * @Descripe 用户基本信息实体类
 * @Author vanguard
 * @Date: 2018/02/05
 * @Version 1.0
 */
@Setter
@Getter
public class BaseInformation extends BaseDomain {

    /**
     * 用户会员ID
     */
    private Integer memId;
    /**
     * 版本号
     */
    private Integer version;
    /**
     * 位状态
     */
    private Long bitState = 0L;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 性别 0=女/1=男
     */
    private Integer sex;
    /**
     * 身份证号
     */
    private String idNumber;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * 头像
     */
    private String picImg;
    /**
     * 用户当前认证分数
     */
    private Integer authScore = 0;
    /**
     * 用户有效的实名认证对象
     */
    private Long realauthId;

    //-----------会员基本资料----------------
    /**
     * 月收入
     */
    private SystemDictionaryItem incomeGrade;
    /**
     * 婚烟情况
     */
    private SystemDictionaryItem marriage;
    /**
     * 子女情况
     */
    private SystemDictionaryItem kidCount;
    /**
     * 学历
     */
    private SystemDictionaryItem education;
    /**
     * 住房条件
     */
    private SystemDictionaryItem houseCondition;

    /**
     * 获得一个只有ID的BaseInformation对象
     *
     * @param id 用户Id
     * @return BaseInformation对象
     */
    public static BaseInformation empty(Long id) {
        BaseInformation userinfo = new BaseInformation();
        userinfo.setId(id);
        userinfo.setBitState(BitStatesUtils.OP_BASE_INFO);
        return userinfo;
    }

    /**
     * 添加位状态
     *
     * @param state 位状态
     */
    public void addState(Long state) {
        this.bitState = BitStatesUtils.addState(this.bitState, state);
    }

    /**
     * 移除位状态
     *
     * @param state 位状态
     */
    public void removeState(Long state) {
        this.bitState = BitStatesUtils.removeState(this.bitState, state);
    }

    /**
     * 判断是否绑定手机号
     *
     * @return false=否/true=是
     */
    public boolean getIsBindPhone() {
        return BitStatesUtils.hasState(bitState, BitStatesUtils.OP_BIND_PHONE);
    }

    /**
     * 判断是否绑定邮箱
     *
     * @return false=否/true=是
     */
    public boolean getIsBindEmail() {
        return BitStatesUtils.hasState(bitState, BitStatesUtils.OP_BIND_EMAIL);
    }

    /**
     * 判断用户是否添加基本资料
     *
     * @return false=否/true=是
     */
    public boolean getBaseInfo() {
        return BitStatesUtils.hasState(bitState, BitStatesUtils.OP_BASE_INFO);
    }

    /**
     * 判断用户是否实名认证
     *
     * @return false=否/true=是
     */
    public boolean getRealAuth() {
        return BitStatesUtils.hasState(bitState, BitStatesUtils.OP_REAL_AUTH);
    }

    public boolean getVedioAuth() {
        return BitStatesUtils.hasState(bitState, BitStatesUtils.OP_VIDEO_AUTH);
    }

    public boolean getHasBidRequest() {
        return BitStatesUtils.hasState(bitState, BitStatesUtils.OP_HAS_BIDREQUEST_PROCESS);
    }

    /**
     * 获取用户真实名字的隐藏字符串，只显示姓氏
     *
     * @return 只显示姓氏的姓名字符串
     */
    public String getAnonymousRealName() {
        if (StringUtils.hasLength(realName)) {
            int len = realName.length();
            String replace = "";
            replace += realName.charAt(0);
            for (int i = 1; i < len; i++) {
                replace += "*";
            }
            return replace;
        }
        return realName;
    }

}