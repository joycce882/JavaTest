package Demo1;
// TODO: 2024/11/25 下面的代码定义了一个在控制台实现的学生管理系统

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentManageTest {
    public static void main(String[] args) {
        ArrayList<Student> st_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("--------欢迎来到学生管理系统--------");
                System.out.println("1:添加学生\n2:删除学生\n3:修改学生\n4:查询学生\n5:直接退出");
                System.out.println("您的操作为以上的四种，您可以选择了");
                int number = sc.nextInt();
                if (number == 5) {
                    break;
                }
                else if (number == 1) {
                    System.out.println("请依次输入学生的信息，以空格作为间隔,分别是ID，Name,Age以及Home_Address");
                    sc.nextLine();
                    String s_info = sc.nextLine();
                    String[] s_befo = s_info.split(" ");
                    Student s = new Student(s_befo[0], s_befo[1], Integer.parseInt(s_befo[2]), s_befo[3]);
                    int flag = add_student(s, st_list);
                    if (flag==-1)
                        continue;
                    System.out.println("添加成功之后的学生名单如下：");
                    display_student_info(st_list);
                }
                else if (number==2){
                    System.out.println("请输入您需要删除的学生ID");
                    sc.nextLine();
                    String re_id = sc.nextLine();
                    int re_result = remove_student(re_id, st_list);
                    if (re_result==-1)
                        continue;
                    System.out.println("剩下的学生名单为：");
                    display_student_info(st_list);
                } else if (number==3) {
                    System.out.println("您要进行修改操作，请输入1进行修改，0直接退回主菜单");
                    int n = sc.nextInt();
                    if (n==0)
                        continue;
                    System.out.println("请输入您要修改的ID");
                    sc.nextLine();
                    String id_re = sc.nextLine();
                    int scan_result = scan_id(id_re,st_list);
                    if (scan_result==-1){
                        System.out.println("表中没有这个ID，请重试");
                        continue;
                    }
                    System.out.println("请输入您要修改的对象，1代表Name，2代表年龄，3代表家庭住址");
//                    sc.nextLine();
                    int sign = sc.nextInt();
                    System.out.println("请输入您要修改的值");
                    sc.nextLine();
                    String info_after = sc.nextLine();
                    int change_result = change_student_info(sign, info_after, id_re, st_list);
                    if (change_result==-1){
                        System.out.println("有且只有一种情况，表为空");
                        continue;
                    }
                    System.out.println("修改之后的表为：");
                    display_student_info(st_list);
                } else if (number==4) {
                    display_student_info(st_list);
                }
            } catch (Exception e) {
                System.out.println("您的输入有误，请重新输入");
                continue;
            }
        }
    }

    public static int add_student(Student s, ArrayList<Student> st_list) {
        for (Student s1 : st_list) {
            if (Objects.equals(s1.getId(), s.getId())) {
                System.out.println("您输入的ID重复了，请重新输入");
                return -1;
            }
        }
        st_list.add(s);
        System.out.println("您已经添加成功");
        return 1;
    }
    public static int remove_student(String id,ArrayList<Student> st_list)
    {
        System.out.println("请再次确实您是否删除这个数据，1进行删除，0直接退回主菜单");
        Scanner sc = new Scanner(System.in);
//        sc.nextLine();
        int number = sc.nextInt();
        if (number==1){
            if(st_list==null ||st_list.isEmpty()){
                System.out.println("ArrayList为空或者还没有进行初始化，删除失败");
                return -1;
                }
            st_list.removeIf(s -> Objects.equals(id, s.getId()));
            System.out.println("您已经删除成功");
            return 1;
            }
        else if (number==0) {
            System.out.println("您已取消删除，退回主菜单");
            return -1;
            }
        return 1;
    }
    // 下面的代码是指改变学生的信息，number用来判断改变哪些信息，通过ID进行查找，info是string类型的，根据需要可以改变为int类
    public static int change_student_info(int number,String info,String id,ArrayList<Student> st_list){
        if (st_list==null)
            return -1;
        for (Student student:st_list){
            if (student.getId().equals(id)){
                if (number==1){
                    student.setName(info);
                    return 1;
                }
                if (number==2){
                    student.setAge(Integer.parseInt(info));
                    return 1;
                }
                if(number==3){
                    student.setHome_address(info);
                    return 1;
                }
            }
        }
        return 1;
    }public static void display_student_info(ArrayList<Student> st_list){
        if (st_list==null){
            System.out.println("当前无学生信息，请添加后查询");
        }
        if (st_list != null) {
            System.out.println("查询结果如下：");
            for (Student s:st_list){
                System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getHome_address());
            }
        }
    }
    public static int scan_id(String id,ArrayList<Student> st_list){
        int flag = 0;
        for (Student st:st_list){
            if (id.equals(st.getId())){
                System.out.println("查询成功");
                flag=1;
            }
        }
        if (flag==0){
            System.out.println("查询失败，没有这个ID，请重试");
            return -1;
        }
        return 1;
    }
}
