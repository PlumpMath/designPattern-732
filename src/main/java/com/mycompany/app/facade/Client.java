package com.mycompany.app.facade;

/**
 * Created with IntelliJ IDEA.
 * User: zh
 * Date: 14-2-25
 * Time: 下午4:36
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args){
        //创建一个处理信件的过程
        LetterProcess letterProcess = new LetterProcessImpl();
        //开始处理
        letterProcess.writeContext("Hello ,My brother!");
        letterProcess.fillEnvelope("亚特兰蒂斯-第五元素一号飞船");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
