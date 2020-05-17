package com.cn.nts.nts13.root.entity;

import java.io.Serializable;
import java.util.Date;

public class Generatortest implements Serializable {
    private Integer id;

    private Date generatortime;

    private String generatorvarchar;

    private Double generatordouble;

    private Date generatordatetime;

    private String generatorjson;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGeneratortime() {
        return generatortime;
    }

    public void setGeneratortime(Date generatortime) {
        this.generatortime = generatortime;
    }

    public String getGeneratorvarchar() {
        return generatorvarchar;
    }

    public void setGeneratorvarchar(String generatorvarchar) {
        this.generatorvarchar = generatorvarchar == null ? null : generatorvarchar.trim();
    }

    public Double getGeneratordouble() {
        return generatordouble;
    }

    public void setGeneratordouble(Double generatordouble) {
        this.generatordouble = generatordouble;
    }

    public Date getGeneratordatetime() {
        return generatordatetime;
    }

    public void setGeneratordatetime(Date generatordatetime) {
        this.generatordatetime = generatordatetime;
    }

    public String getGeneratorjson() {
        return generatorjson;
    }

    public void setGeneratorjson(String generatorjson) {
        this.generatorjson = generatorjson == null ? null : generatorjson.trim();
    }
}