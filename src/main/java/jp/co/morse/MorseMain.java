/**
 * 
 */
package jp.co.morse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 英語とに数字に対応（日本語はおまけでカタカナだけ）
 * 
 * @author H.Yoshi
 *
 */
public class MorseMain {
	private static Map<String, String> map = new HashMap<String, String>();
	static {
		map.put("ア", "－－・－－");
		map.put("イ", "・－");
		map.put("ウ", "・・－");
		map.put("エ", "－・－－－");
		map.put("オ", "・－・・・");
		map.put("カ", "・－・・");
		map.put("キ", "－・－・・");
		map.put("ク", "・・・－");
		map.put("ケ", "－・－－");
		map.put("コ", "－－－－");
		map.put("サ", "－・－・－");
		map.put("シ", "－－・－・");
		map.put("ス", "－－－・－");
		map.put("セ", "・－－－・");
		map.put("ソ", "－－－・");
		map.put("タ", "－・");
		map.put("チ", "・・－・");
		map.put("ツ", "・－－・");
		map.put("テ", "・－・－－");
		map.put("ト", "・・－・・");
		map.put("ナ", "・－・");
		map.put("ニ", "－・－・");
		map.put("ヌ", "・・・・");
		map.put("ネ", "－－・－");
		map.put("ノ", "・・－－");
		map.put("ハ", "－・・・");
		map.put("ヒ", "－－・・－");
		map.put("フ", "－－・・");
		map.put("ヘ", "・");
		map.put("ホ", "－・・");
		map.put("マ", "－・・－");
		map.put("ミ", "・・－・－");
		map.put("ム", "－");
		map.put("メ", "－・・・－");
		map.put("モ", "－・・－・");
		map.put("ヤ", "・－－");
		map.put("ユ", "－・・－－");
		map.put("ヨ", "－－");
		map.put("ラ", "・・・");
		map.put("リ", "－－・");
		map.put("ル", "－・－－・");
		map.put("レ", "－－－");
		map.put("ロ", "・－・－");
		map.put("ワ", "－・－");
		map.put("ヲ", "・－－－");
		map.put("ン", "・－・－・");
		map.put("1", "・－");
		map.put("2", "・・－");
		map.put("3", "・・・－");
		map.put("4", "・・・・－");
		map.put("5", "・・・・・");
		map.put("6", "－・・・・");
		map.put("7", "－・・・");
		map.put("8", "－・・");
		map.put("9", "－・");
		map.put("0", "－");
		map.put("a", "・－");
		map.put("b", "－・・・");
		map.put("c", "－・－・");
		map.put("d", "－・・");
		map.put("e", "・");
		map.put("f", "・・－・");
		map.put("g", "－－・");
		map.put("h", "・・・・");
		map.put("i", "・・");
		map.put("j", "・－－－");
		map.put("k", "－・－");
		map.put("l", "・－・・");
		map.put("m", "－－");
		map.put("n", "－・");
		map.put("o", "－－－");
		map.put("p", "・－－・");
		map.put("q", "－－・－");
		map.put("r", "・－・");
		map.put("s", "・・・");
		map.put("t", "－");
		map.put("u", "・・－");
		map.put("v", "・・・－");
		map.put("w", "・－－");
		map.put("x", "－・・－");
		map.put("y", "－・－－");
		map.put("z", "－－・・");
	}

	public static void main(String[] args) {
		System.out.println("英語または数値で入力してください。");
		Scanner scan = new Scanner(System.in);
		String[] target = scan.next().split("");
		for (String a : target) {
			try {
				String res = map.get(a.toLowerCase());
				if (res.equals(null)) {
					System.out.println(a + "は対象ではない文字列です");
				} else {
					System.out.println(res);
				}
			} catch (Exception e) { // NPE回避
				System.out.println(a + "は対象ではない文字列です");
			}
		}
	}
}
