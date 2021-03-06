package com.lian.mysecurity.common.globalexception.exception.assertion;


import com.lian.mysecurity.common.globalexception.constant.IResponseEnum;
import com.lian.mysecurity.common.globalexception.exception.BaseException;
import com.lian.mysecurity.common.globalexception.exception.BusinessException;

import java.text.MessageFormat;

/**
 * <p>业务异常断言</p>
 *
 * @author sprainkle
 * @date 2019/5/2
 */
public interface BusinessExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg, t);
    }

}
