package fengxiaowei.baselibrary.model;

/**
 * Created by fengxiaowei on 17/11/1.
 */

/**
 * 空消息，解决EventBus没有注册消息的异常，一旦EventBus发送这个消息，每个Activity都会接收，慎重
 */
public class EmptyMsg {}
