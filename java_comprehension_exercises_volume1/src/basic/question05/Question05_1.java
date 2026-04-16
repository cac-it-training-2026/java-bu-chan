package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_1 {

	public static void main(String[] args) throws IOException {

		System.out.println("年齢を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String age_str = br.readLine();
		int age = Integer.parseInt(age_str);

		if (age < 20) {
			System.out.println("20歳未満なので、お酒の提供が出来ません。");
		} else {
			System.out.println("20歳以上なので、お酒を提供することが可能です。");
		}

	}
}
