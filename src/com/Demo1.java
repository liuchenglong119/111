package com;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws DocumentException {
        //1.获取xml文档所对应的document对象
        Document document = new SAXReader().read(new File("./src/student.xml"));
        //获取根节点
        Element rootElement = document.getRootElement();
        //3.获取所有的子节点
        List<Element> students = rootElement.selectNodes("student");
        for (Element student : students) {

        }
    }
}
