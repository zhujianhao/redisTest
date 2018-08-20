package com.zjh.bean;


import java.io.Serializable;

/***/
public class TestBean implements Serializable {

    private String id ;
    private String name;
    private TestBean testBean ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestBean getTestBean() {
        return testBean;
    }

    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", testBean=" + testBean +
                '}';
    }
}
