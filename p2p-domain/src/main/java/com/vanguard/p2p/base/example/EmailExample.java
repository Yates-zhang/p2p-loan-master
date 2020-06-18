package com.vanguard.p2p.base.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEmailIdIsNull() {
            addCriterion("email_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailIdIsNotNull() {
            addCriterion("email_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIdEqualTo(Long value) {
            addCriterion("email_id =", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotEqualTo(Long value) {
            addCriterion("email_id <>", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThan(Long value) {
            addCriterion("email_id >", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("email_id >=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThan(Long value) {
            addCriterion("email_id <", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(Long value) {
            addCriterion("email_id <=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdIn(List<Long> values) {
            addCriterion("email_id in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotIn(List<Long> values) {
            addCriterion("email_id not in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdBetween(Long value1, Long value2) {
            addCriterion("email_id between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotBetween(Long value1, Long value2) {
            addCriterion("email_id not between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailSignIsNull() {
            addCriterion("email_sign is null");
            return (Criteria) this;
        }

        public Criteria andEmailSignIsNotNull() {
            addCriterion("email_sign is not null");
            return (Criteria) this;
        }

        public Criteria andEmailSignEqualTo(Long value) {
            addCriterion("email_sign =", value, "emailSign");
            return (Criteria) this;
        }

        public Criteria andEmailSignNotEqualTo(Long value) {
            addCriterion("email_sign <>", value, "emailSign");
            return (Criteria) this;
        }

        public Criteria andEmailSignGreaterThan(Long value) {
            addCriterion("email_sign >", value, "emailSign");
            return (Criteria) this;
        }

        public Criteria andEmailSignGreaterThanOrEqualTo(Long value) {
            addCriterion("email_sign >=", value, "emailSign");
            return (Criteria) this;
        }

        public Criteria andEmailSignLessThan(Long value) {
            addCriterion("email_sign <", value, "emailSign");
            return (Criteria) this;
        }

        public Criteria andEmailSignLessThanOrEqualTo(Long value) {
            addCriterion("email_sign <=", value, "emailSign");
            return (Criteria) this;
        }

        public Criteria andEmailSignIn(List<Long> values) {
            addCriterion("email_sign in", values, "emailSign");
            return (Criteria) this;
        }

        public Criteria andEmailSignNotIn(List<Long> values) {
            addCriterion("email_sign not in", values, "emailSign");
            return (Criteria) this;
        }

        public Criteria andEmailSignBetween(Long value1, Long value2) {
            addCriterion("email_sign between", value1, value2, "emailSign");
            return (Criteria) this;
        }

        public Criteria andEmailSignNotBetween(Long value1, Long value2) {
            addCriterion("email_sign not between", value1, value2, "emailSign");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIsNull() {
            addCriterion("email_type is null");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIsNotNull() {
            addCriterion("email_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTypeEqualTo(Byte value) {
            addCriterion("email_type =", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotEqualTo(Byte value) {
            addCriterion("email_type <>", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeGreaterThan(Byte value) {
            addCriterion("email_type >", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("email_type >=", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLessThan(Byte value) {
            addCriterion("email_type <", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLessThanOrEqualTo(Byte value) {
            addCriterion("email_type <=", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIn(List<Byte> values) {
            addCriterion("email_type in", values, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotIn(List<Byte> values) {
            addCriterion("email_type not in", values, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeBetween(Byte value1, Byte value2) {
            addCriterion("email_type between", value1, value2, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("email_type not between", value1, value2, "emailType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andNewEmailIsNull() {
            addCriterion("new_email is null");
            return (Criteria) this;
        }

        public Criteria andNewEmailIsNotNull() {
            addCriterion("new_email is not null");
            return (Criteria) this;
        }

        public Criteria andNewEmailEqualTo(String value) {
            addCriterion("new_email =", value, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailNotEqualTo(String value) {
            addCriterion("new_email <>", value, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailGreaterThan(String value) {
            addCriterion("new_email >", value, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailGreaterThanOrEqualTo(String value) {
            addCriterion("new_email >=", value, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailLessThan(String value) {
            addCriterion("new_email <", value, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailLessThanOrEqualTo(String value) {
            addCriterion("new_email <=", value, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailLike(String value) {
            addCriterion("new_email like", value, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailNotLike(String value) {
            addCriterion("new_email not like", value, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailIn(List<String> values) {
            addCriterion("new_email in", values, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailNotIn(List<String> values) {
            addCriterion("new_email not in", values, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailBetween(String value1, String value2) {
            addCriterion("new_email between", value1, value2, "newEmail");
            return (Criteria) this;
        }

        public Criteria andNewEmailNotBetween(String value1, String value2) {
            addCriterion("new_email not between", value1, value2, "newEmail");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(Boolean value) {
            addCriterion("send_status =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(Boolean value) {
            addCriterion("send_status <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(Boolean value) {
            addCriterion("send_status >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("send_status >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(Boolean value) {
            addCriterion("send_status <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("send_status <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<Boolean> values) {
            addCriterion("send_status in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<Boolean> values) {
            addCriterion("send_status not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("send_status between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("send_status not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andCaptchaIsNull() {
            addCriterion("captcha is null");
            return (Criteria) this;
        }

        public Criteria andCaptchaIsNotNull() {
            addCriterion("captcha is not null");
            return (Criteria) this;
        }

        public Criteria andCaptchaEqualTo(String value) {
            addCriterion("captcha =", value, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaNotEqualTo(String value) {
            addCriterion("captcha <>", value, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaGreaterThan(String value) {
            addCriterion("captcha >", value, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaGreaterThanOrEqualTo(String value) {
            addCriterion("captcha >=", value, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaLessThan(String value) {
            addCriterion("captcha <", value, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaLessThanOrEqualTo(String value) {
            addCriterion("captcha <=", value, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaLike(String value) {
            addCriterion("captcha like", value, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaNotLike(String value) {
            addCriterion("captcha not like", value, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaIn(List<String> values) {
            addCriterion("captcha in", values, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaNotIn(List<String> values) {
            addCriterion("captcha not in", values, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaBetween(String value1, String value2) {
            addCriterion("captcha between", value1, value2, "captcha");
            return (Criteria) this;
        }

        public Criteria andCaptchaNotBetween(String value1, String value2) {
            addCriterion("captcha not between", value1, value2, "captcha");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectIsNull() {
            addCriterion("email_subject is null");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectIsNotNull() {
            addCriterion("email_subject is not null");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectEqualTo(String value) {
            addCriterion("email_subject =", value, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectNotEqualTo(String value) {
            addCriterion("email_subject <>", value, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectGreaterThan(String value) {
            addCriterion("email_subject >", value, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("email_subject >=", value, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectLessThan(String value) {
            addCriterion("email_subject <", value, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectLessThanOrEqualTo(String value) {
            addCriterion("email_subject <=", value, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectLike(String value) {
            addCriterion("email_subject like", value, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectNotLike(String value) {
            addCriterion("email_subject not like", value, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectIn(List<String> values) {
            addCriterion("email_subject in", values, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectNotIn(List<String> values) {
            addCriterion("email_subject not in", values, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectBetween(String value1, String value2) {
            addCriterion("email_subject between", value1, value2, "emailSubject");
            return (Criteria) this;
        }

        public Criteria andEmailSubjectNotBetween(String value1, String value2) {
            addCriterion("email_subject not between", value1, value2, "emailSubject");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}