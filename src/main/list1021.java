package main;

import java.util.ArrayList;
import java.util.Scanner;

public class list1021 {

	static ArrayList<Article> articles;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		articles = new ArrayList<>();
		Article a1 = new Article(1, "����1", "����1");
		Article a2 = new Article(2, "����2", "����2");
		Article a3 = new Article(3, "����3", "����3");

		articles.add(a1);
		articles.add(a2);
		articles.add(a3);
		
		int no = 4;
		
		while (true) {
			System.out.print("��ɾ� �Է� : ");
			String cmd = sc.next();
			
			if (cmd.equals("exit")) {
				System.out.println("����");
				break;
			}
			
			if(cmd.equals("add")) {
				
				Article a = new Article();
				a.setId(no);
				no++;
				
				System.out.println("�Խù� ������ �Է����ּ��� : ");
				String title = sc.next();
				a.setTitle(title);
				
				System.out.println("�Խù� ������ �Է����ּ��� : ");
				String body = sc.next();
				a.setBody(body);
				
				articles.add(a);
				System.out.println("�Խù��� ��ϵǾ����ϴ�.");
			}
			
			if(cmd.equals("list")) {
				for(int i =0; i < articles.size(); i++) {
					Article article = articles.get(i);
					
					System.out.println("��ȣ : " + article.getId());
					System.out.println("���� : " + article.getTitle());
					System.out.println("==================");
				}
			}
			
			if(cmd.equals("update")) {
				//index ver.
//				System.out.println("������ �Խù� ���� : ");
//				int targetId = sc.nextInt();
//				
//				if(targetId == -1) {
//					System.out.println("���� �Խù��Դϴ�.");
//				} else {
//					System.out.println("�Խù� ������ �Է����ּ��� : ");
//					String newTitle = sc.next();
//					System.out.println("�Խù� ������ �Է����ּ��� : ");
//					String newBody = sc.next();
//					
//					Article newArticle = new Article();
//					newArticle.setId(targetId);
//					newArticle.setTitle(newTitle);
//					newArticle.setBody(newBody);
//					
//					articles.set(targetId, newArticle);
//					break;
//				}
				System.out.println("������ �Խù� ����: ");
				int targetId = sc.nextInt();
				
				Article target = getArticleById(targetId);
				
				if(target == null) {
					System.out.println("���� �Խù��Դϴ�.");
				} else {
					System.out.println("�Խù� ������ �Է����ּ��� : ");
					String newTitle = sc.next();
					System.out.println("�Խù� ������ �Է����ּ���: ");
					String newBody = sc.next();
					
					target.setTitle(newTitle);
					target.setBody(newBody);
					
					break;
				}
			}
			
			if(cmd.equals("delete")) {
				System.out.println("������ �Խù� ���� : ");
				int targetId = sc.nextInt();
				
				Article target = getArticleById(targetId);
				
				if(target == null) {
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					articles.remove(target);
				}
				
			}
			
			if(cmd.equals("read")) {
				System.out.println("�󼼺��� �� �Խù� ���� : ");
				int targetId = sc.nextInt();
				
				Article target = getArticleById(targetId);
				
				if(target == null) {
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("=====" + target.getId() + "=====");
					System.out.println("��ȣ : " + target.getId());
					System.out.println("���� : " + target.getTitle());
					System.out.println("���� : " + target.getBody());
					System.out.println("=========================");
				}
			}
	
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		//index ver.
		private static int getArticleById(int targetId) {
			for(int i =0; i < articles.size(); i++) {
				int id = articles.get(i).getId();
				
				if(id == targetId) {
					return i;
				}
			}
			
			return -1;
		}
		//Article ver.
		private static Article getArticleById(int targetId) {	
			for(int i = 0; i < articles.size(); i++) {
				int id = articles.get(i).getId();
				
				if(int == targetId) {
					return articles.get(i);
				}
			}
			
			return null;
		}
			
}
