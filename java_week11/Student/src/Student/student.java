/*�й� : 20215247
�̸� : ������
�ǽ� ��ǥ : 1. ��ü�� ����
 1) Ŭ������ ����
 3) ������ �޼��� �ۼ�*/

package Student;

class student {

		private String studentNo;
		private String studentName;
		private int grade;
		private String dept;
		
		public String get_studentNo() {
			return studentNo;
		}
		public String get_studentName() {
			return studentName;
		}
		public int get_grade() {
			return grade;
		}
		public String get_dept() {
			return dept;
		}
		public void set_studentNo(String number) {
			studentNo = number;
		}
		public void set_studentName(String name) {
			studentName = name;
		}
		public void set_grade(int a) {
			grade = a;
		}
		public void set_dept(String b) {
			dept = b;
		}
		public String toString() {
			return "�й� : "+studentNo+"\n�̸� : "+studentName+"\n�г� : "+grade+"\n�а� : "+dept;

		}

	}

	class StudentEx{
		public static void main(String[]args) {
			student std1 = new student();
			std1.set_studentNo("20210000");
			std1.set_studentName("ȫ�浿");
			std1.set_grade(1);
			std1.set_dept("����Ʈ�������մ���");
			
			student std2 = new student();
			std2.set_studentNo("20210001");
			std2.set_studentName("�̼���");
			std2.set_grade(2);
			std2.set_dept("����Ʈ�������մ���");
			
			student std3 = new student();
			std3.set_studentNo("20215247");
			std3.set_studentName("������");
			std3.set_grade(1);
			std3.set_dept("����Ʈ�������մ���");
			
			System.out.println(std1.toString());
			System.out.println(std2.toString());
			System.out.println(std3.toString());
			
			
		}
	}