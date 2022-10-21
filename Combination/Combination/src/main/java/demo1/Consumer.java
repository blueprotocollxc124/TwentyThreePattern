package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/30  9:27
 *@System Data  2021 07
 *
 */


public class Consumer {

    public static void main(String[] args) {
        MenuComponent menuRoot = new Menu("系统菜单", 1);

        MenuComponent menu1 = new Menu("菜单管理", 2);
        MenuComponent menu11 = new MenuItem("页面访问", 3);
        MenuComponent menu12 = new MenuItem("展开菜单", 3);
        MenuComponent menu13 = new MenuItem("删除菜单", 3);
        MenuComponent menu14 = new MenuItem("新增菜单", 3);

        MenuComponent menu2 = new Menu("权限配置", 2);
        MenuComponent menu21 = new MenuItem("排查错误", 3);
        MenuComponent menu22 = new MenuItem("提交保存", 3);

        MenuComponent menu3 = new Menu("角色管理", 2);
        MenuComponent menu31 = new MenuItem("液面访问", 3);
        MenuComponent menu32 = new MenuItem("修改角色", 3);

        menuRoot.add(menu1);
        menuRoot.add(menu2);
        menuRoot.add(menu3);

        menu1.add(menu11);
        menu1.add(menu12);
        menu1.add(menu13);
        menu1.add(menu14);

        menu2.add(menu21);
        menu2.add(menu22);

        menu3.add(menu31);
        menu3.add(menu32);

        menuRoot.print();




    }
}
