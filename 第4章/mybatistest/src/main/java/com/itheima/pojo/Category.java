package com.itheima.pojo;

public class Category {
    private Integer id;                                // 主键id
    private String typename;                     // 类别名称
    private List<Product> productList;     // 商品集合
    // 省略getter方法
    @Override
    public String toString() {
        return "Category{" +"id=" + id + ", typename='" + 	typename +", productList=" + productList + '}'; }

}
