package org.frend.dubbo.filter;

import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.ref.Reference;

/**
 * @auther frend
 * @createDate 2018/1/22
 * @Note:
 */
public class ReferenceFilter implements Filter{

    Logger logger = LoggerFactory.getLogger(ReferenceFilter.class);

    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Result result = invoker.invoke(invocation);
        return result;
    }
}
