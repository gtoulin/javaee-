public class IClass {
    private Integer id;         private String classname;    // 主键id，班级名称
    private List<IStudent> studentList;    // 学生集合
    // 省略getter/setter方法
    @Override
    public String toString() {return "IClass{" +"id=" + id +
            ", classname='" + classname +", studentList=" + studentList + '}’;
    }}
