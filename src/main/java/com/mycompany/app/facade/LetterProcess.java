package com.mycompany.app.facade;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-25
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
public interface LetterProcess {
    /**
     * 写信内容
     * @param context
     */
    public void writeContext(String context);

    /**
     * 填写信封
     * @param address
     */
    public void fillEnvelope(String address);

    /**
     * 把信件装进信封
     */
    public void letterIntoEnvelope();

    /**
     * 发送信件
     */
    public void sendLetter();
}
