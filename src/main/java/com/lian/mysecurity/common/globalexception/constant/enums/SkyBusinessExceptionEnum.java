package com.lian.mysecurity.common.globalexception.constant.enums;

import com.lian.mysecurity.common.globalexception.exception.assertion.BusinessExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * 异常msg和code
 * 业务异常
 *
 * @author Ted
 * @date 2020/5/21 18:27
 */
@Getter
@AllArgsConstructor
public enum SkyBusinessExceptionEnum implements BusinessExceptionAssert {
    //1
    SUCCESS(0, "成功"),
    Error_1001(1001, "未授权"),
    Error_1002(1002, "密码错误"),
    Error_1003(1003, "本地私钥证书错误"),
    Error_1004(1004, "服务器异常，请稍后重试"),
    Error_1005(1005, "参数为空"),
    Error_1006(1006, "传参格式不正确"),
    Error_1007(1007, "服务器无数据"),
    Error_1008(1008, "没有ID，无法完成保存"),
    Error_1009(1009, "该手机号已经被注册"),
    Error_1010(1010, "新增失败,请稍后重试!"),
    Error_1011(1011, "新增教师参数校验"),
    Error_1012(1012, "此账号已被禁用,无法登陆!"),
    Error_1013(1013, "用户信息不存在此createId:"),
    Error_1014(1014, "机构中不存在此机构Id:"),
    Error_1015(1015, "机构人员不存在此institutionUserId:"),
    Error_1016(1016, "用户信息不存在此UserId:"),
    COURSE_SELL_NOT_EXISTS(1017,"没有找到相应的课程信息"),
    Error_1018(1018, "班级中找不到该ClassId:"),
    Error_1019(1019, "该课节已存在"),
    Error_1020(1020, "该课程下无课节,请先添加课节"),
    Error_1021(1021, "排课开始时间必须大于当前时间四个小时"),
    Error_1022(1022, "该序号已存在,上节课的序号为:"),
    Error_1023(1023, "课程不完整"),
    Error_1024(1024, "该课程未发布"),
    Error_1025(1025, "课程有效期最少一个月,最多一年"),
    Error_1026(1026, "该课程已排完所有课节,该课程的课节总数是:"),
    Error_1027(1027, "账号不存在!"),
    Error_1028(1028, "暂无已发布的课程"),
    Error_1029(1029, "没有可以课上的老师"),
    Error_1030(1030, "未找到相关教师信息"),
    Error_1031(1031, "排课失败，请按照CSV格式上传！"),
    Error_1032(1032, "开始时间或结束时间已存在"),
    Error_1033(1033, "未找到对应的教师,教师id为:"),
    Error_1034(1034, "该账号不是教师身份"),
    Error_1035(1035, "未找到对应课节信息"),
    Error_1036(1036, "课程开始时间必须大于当前时间"),
    Error_1037(1037, "生成销售课程失败!"),
    Error_1038(1038, "该课程下暂无销售课节!"),
    Error_1039(1039, "该课程已存在!"),
    Error_1040(1040, "开课前一个小时内不可取消约课!"),
    Error_1041(1041, "下载失败!"),
    Error_1042(1042, "开始时间必须大于当前时间两个小时!"),
    Error_1043(1043, "课程开始前两小时内不允许修改"),
    Error_1044(1044, "文件大小不得超过100MB"),
    Error_1045(1045, "上传失败!"),
    Error_1046(1046, "删除失败!"),
    Error_1047(1047, "该课程状态为已取消!"),
    Error_1048(1048, "该教师已被禁用!"),
    Error_1049(1049, "验证码失效"),
    Error_1050(1050, "验证码错误!"),
    Error_1051(1051, "保存账户变更记录失败"),
    Error_1052(1052, "该合同未关联课程"),
    Error_1053(1053, "未找到账户信息"),
    Error_1054(1054, "排课失败"),
    Error_1055(1055, "取消排课失败，保存账户异常"),
    Error_1056(1056, "图形验证码失效"),
    Error_1057(1057, "图形验证码错误"),
    Error_1058(1058, "该用户激活设备数量超出限制"),
    Error_1059(1059, "签名校验不通过"),
    Error_1060(1060, "平台仅支持微信支付"),
    Error_1061(1061, "资源未购买"),
    Error_1062(1062, "非会员每日下载仅限10次"),
    Error_1063(1063, "该产品不存在"),
    Error_1064(1064, "openid不存在"),
    Error_1065(1065, "未找到该用户报名信息"),
    Error_1066(1066,"token未解析出用户"),
    Error_1067(1067,"用户已经报名成功"),
    /*oss*/
    Error_1070(1070, "bucket不存在!"),
    Error_1071(1071, "上传数量不能大于5个!"),
    Error_1072(1072,"排课文件转化失败"),
    Error_1073(1073,"未找此平台对应的微信参数"),
    Error_1074(1074,"payPal创建支付异常"),
    Error_1075(1075,"payPal执行确认支付异常"),
    CSV_EXPORT_NOT_NULL(1076,"csv导出功能实体不能为空"),
    CSV_EXPORT_TABLE_TITLE_NOT_NULL(1077,"csv表头不能为空"),
    EVENT_HANDLER_NOT_NULL(1078,"事件处理信息不能为空"),
    CC_USER_INFO_NOT_NULL(1079,"传入用户信息不能为空"),
    NOTIFY_TYPE_NOT_NULL(1080,"通知类型不能为空"),
    NOTIFY_EVENT_TYPE_NOT_NULL(1081,"通知事件类型不能为空"),
    ENROLL_NOT_NULL(1082,"报名信息不能为空"),
    USER_ALREADY_ENROLLED(1083,"用户已经报过名了"),
    USER_ID_NOT_NULL(1084,"用户id不能为空"),
    USER_NOT_NULL(1085,"用户不能为空"),
    USER_ALREADY_EXIST(1086,"用户已经存在"),

    User_have_already_click_praise_five_times(1087,"用户已经点赞五次了"),
    

    //2
    Error_2001(2001,"机构id不能为空"),
    Error_2002(2002,"课程id不能为空"),
    Error_2003(2003,"班级id不能为空"),
    Error_2004(2004,"序号不能为空"),
    Error_2005(2005,"教师id不能为空"),
    Error_2006(2006,"日期不能为空"),
    //3
    Error_3001(3001, "csv导入排课事务回滚专用"),
    //4
    Error_4001(4001, "机构在该区域已存在"),
    Error_4002(4002, "上级机构不存在"),
    Error_4003(4003, "教育机构不存在"),
    Error_4004(4004, "该区域没有院校，请联系管理员"),
    Error_4005(4005,"关联机构未成功");


    private int code;

    private String message;
}
