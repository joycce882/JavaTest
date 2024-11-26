package java_2024_11_24;

import java.util.ArrayList;
import java.util.Scanner;

/***
 * 该代码实现了一个学生信息管理系统，支持以下功能：
 * <p>
 * 添加学生信息：
 * <p>
 * 输入学生的 ID、姓名 和 年龄。
 * 检查学生 ID 是否唯一，确保不会重复。
 * 成功添加后，展示当前学生列表。
 * 删除学生信息：
 * <p>
 * 根据输入的 ID 查找对应学生。
 * 删除前二次确认，避免误删。
 * 删除后更新并展示学生列表。
 * 遍历学生列表：
 *<p></p>
 * 输出所有学生的 ID、姓名 和 年龄，供用户查看。
 * 输入错误处理：
 *<p></p>
 * 捕获并处理用户输入的错误（如数据类型不匹配）。
 * 输入无效时提示用户，并不会导致程序崩溃。
 ***/

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> st_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            try{
                System.out.println("键入0直接退出，1进行添加,2进行删除");
                int choice = sc.nextInt();
                if (choice==1){
                    System.out.println("请输入ID：");
                    int id = sc.nextInt();
                    if (judge_id(id,st_list)){
                        System.out.println("请输入姓名：");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.println("请输入年龄：");
                        int age = sc.nextInt();
                        add_stu_info(id,name,age,st_list);
                        System.out.println("添加成功，新的学生名单为：");
                        traverse_stlist(st_list);
                    }
                    else {
                        System.out.println("您的ID重复，请重新开始输入！");
                        continue;
                    }
                }
                else if (choice==0)
                    flag = false;
                else if (choice==2) {
                    System.out.println("请输入要删除的ID");
                    sc.nextLine();
                    int number = sc.nextInt();
                    System.out.println("请再次确认是否删除！！！1删除，0退出");
                    int sign_2 = sc.nextInt();
                    if (sign_2==1){
                        boolean delete_sign = remove_st(number,st_list);
                        if (delete_sign){
                            System.out.println("删除成功，剩下的学生名单为：");
                            traverse_stlist(st_list);
                        }
                        else
                            continue;
                    }

                }

            }
            catch (Exception e){
                System.out.println("您的输入有误，请重新输入！");
                sc.nextLine();
                continue;
            }
        }

    }

    public static boolean judge_id(int number, ArrayList<Student> st_list){
        if (st_list==null || st_list.isEmpty())
            return true;
        for(Student st:st_list){
            if (number==st.getId())
                return false;
        }
        return true;
    }
    public static void add_stu_info(int id,String name,int age,ArrayList<Student> st_list){
        Student s = new Student(id,name,age);
        st_list.add(s);
    }
    public static boolean  remove_st(int number,ArrayList<Student> st_list){
        if (st_list==null || st_list.isEmpty()) {
            System.out.println("列表为空，删除失败，请添加数据之后重试");
            return false;
        }
        else {
            for(Student s:st_list){
                if(number==s.getId()){
                    st_list.remove(s);
                    return true;
                }
                else{
                    System.out.println("ID查找不到，删除失败");
                    return false;
                }

            }

        }
        return true;

    }
    public static void traverse_stlist(ArrayList<Student> st)  // 遍历arraylist
    {
        for (Student s : st){
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge());
        }

    }
}
