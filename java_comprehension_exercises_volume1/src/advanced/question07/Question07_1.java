package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] itemNames = new String[5];
		String price_str = null;
		int[] prices = new int[5];
		System.out.println("登録商品一覧");

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください：＞");
			itemNames[i] = br.readLine();
		}

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の単価:＞");
			price_str = br.readLine();
			prices[i] = Integer.parseInt(price_str);
		}

		System.out.println("商品登録一覧");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + ":" + prices[i] + "円");
		}

	}

}
