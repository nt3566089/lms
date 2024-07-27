package com.oneslogi.ht.base.dto;

import java.io.Serializable;

/**
 * HINTタグへの設定を保持するDTOクラスです。
 * @author at.inoue.hx
 *
 */
public class HandyTagHintDto implements Serializable {
	
	/**
	 * アラームの種類を定義します。
	 * 1 バイトの整数値を使って下図のようにアラームの種類を指定します。ビット単位での
	 * 指定なので、複数による組み合わせも可能です。
	 * デフォルト：　1 　（ブザー）
	 */
	private int method = 1;
	
	/**
	 * バイブレータ
	 */
	private boolean vibrator = false;
	
	/**
	 * 緑LED点灯
	 */
	private boolean greenLed = false;
	
	/**
	 * 赤LED点灯
	 */
	private boolean redLed = false;
	
	/**
	 * ブザー発生
	 */
	private boolean buzzer = true;
	
	
	/**
	 * 1回のアラームの持続時間を定義します。（100ms単位）
	 * 　　　　デフォルト ： 10 (1秒)
	 */
	private int time = 10;
	
	/**
	 * アラームの間隔時間を定義します。（100ms単位）
	 * 　　　デフォルト ： 5 (0.5秒)
	 */
	private int delay = 5;
	
	/**
	 * アラームの繰り返し回数を定義します。
	 * 　　　デフォルト ： 3
	 */
	private int count = 3;
	
	/**
	 * HINT タグの名前を定義します。
	 * INPUT タグのgoodhintまたはbadhintから引用される名前です。
	 * 使い方は【特記事項】を参照してください。
	 * 　　　デフォルト ：　無し
	 */
	private String name;
	
	public HandyTagHintDto(String name) {
		this.name = name;
	}

	public int getMethod() {
		String tmp = "";
		
		if (vibrator) {
			tmp = tmp + "1";
		} else {
			tmp = tmp + "0";
		}
		
		/* 2015/06/15 INOUE UPDATE START 緑・赤のビット位置が逆になっていたので修正 */
//		if (greenLed) {
//			tmp = tmp + "1";
//		} else {
//			tmp = tmp + "0";
//		}
//		
//		if (redLed) {
//			tmp = tmp + "1";
//		} else {
//			tmp = tmp + "0";
//		}
		
		if (redLed) {
			tmp = tmp + "1";
		} else {
			tmp = tmp + "0";
		}
		
		if (greenLed) {
			tmp = tmp + "1";
		} else {
			tmp = tmp + "0";
		}
		/* 2015/06/15 INOUE UPDATE END */
		
		if (buzzer) {
			tmp = tmp + "1";
		} else {
			tmp = tmp + "0";
		}
		
		method = Integer.parseInt(tmp, 2);
		
		return method;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public boolean isVibrator() {
		return vibrator;
	}

	public void setVibrator(boolean vibrator) {
		this.vibrator = vibrator;
	}
	
	public void setVibratorOn() {
		this.vibrator = true;
	}

	public void setVibratorOff() {
		this.vibrator = false;
	}
	
	public boolean isGreenLed() {
		return greenLed;
	}

	public void setGreenLed(boolean greenLed) {
		this.greenLed = greenLed;
	}
	
	public void setGreenLedOn() {
		this.greenLed = true;
	}

	public void setGreenLedOff() {
		this.greenLed = false;
	}
	
	public boolean isRedLed() {
		return redLed;
	}

	public void setRedLed(boolean redLed) {
		this.redLed = redLed;
	}
	
	public void setRedLedOn() {
		this.redLed = true;
	}

	public void setRedLedOff() {
		this.redLed = false;
	}
	
	public boolean isBuzzer() {
		return buzzer;
	}

	public void setBuzzer(boolean buzzer) {
		this.buzzer = buzzer;
	}
	
	public void setBuzzerOn() {
		this.buzzer = true;
	}
	
	public void setBuzzerOff() {
		this.buzzer = false;
	}
}
