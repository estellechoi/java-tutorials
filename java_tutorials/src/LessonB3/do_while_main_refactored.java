package LessonB3;

import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class do_while_main_refactored {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// ��ü ������ ���ÿ� ������ ������ �����
			do_while_methods_refactored dm = new do_while_methods_refactored();

			int x = 0;
			do {
				System.out.println("�α��� �̸� : ");
				String name = sc.next();
				System.out.println("1. ��ü ȸ�� ��ȸ");
				System.out.println("2. ȸ�� ���� ���");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ���� ����");
				System.out.println("5. �����ϱ�");
				System.out.println("��ȣ ���� : ");
				x = sc.nextInt();

				switch (x) {
				case 1:
					dm.select();
					break;
				case 2:
					System.out.println("�̸� : ");
					String addname = sc.next();
					System.out.println("���� : ");
					int addage = sc.nextInt();
					System.out.println("���� : ");
					String addaddress = sc.next();
					System.out.println("��ȭ��ȣ : ");
					String addphone = sc.next();
					// �޼ҵ� �����ε�
					dm.insert(addname, addage, addphone);
					dm.insert(addname, addage, addphone, addaddress);
					break;
				case 3:
					System.out.println("1.�̸� / 2.��ȣ  / 3.����");
					System.out.print("������ �׸� ��ȣ ���� : ");
					int whatToUpdate = sc.nextInt();
					System.out.print("���� ���� : ");
					String updateByUser = sc.next();
					dm.update(name, whatToUpdate, updateByUser);
					break;
				case 4:
					System.out.print("ȸ�� Ȯ���� ���� ��ȣ�� �Է��ϼ���.");
					String phone = sc.next();
					ResultSet rs = dm.stmt.executeQuery("select*from member where name='" + name + "'");
					rs.next();
					if (!(phone == rs.getString("phone"))) {
						System.out.println("��ȣ ����ġ");
					} else {
						dm.delete(name);
					}
					break;
				}
			} while (x != 5);
			// 3 �� �ƴ� ��� ���� �ݺ� (3 �Է� �� ����)
			System.out.println("����");
			dm.conn.close();
			dm.stmt.close();

		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� ����");
		}
	}

}
