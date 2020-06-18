package com.vanguard.p2p.utils;

import com.vanguard.p2p.constant.BidConst;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @descripe
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
public class DecimalFormatUtil {
	/**
	 * 格式化余额显示
	 * @param number
	 * @return
	 */
	public static BigDecimal amountFormat(BigDecimal number) {
		number = number.setScale(BidConst.STORE_SCALE, RoundingMode.HALF_UP);
		return number;
	}

	/**
	 * 格式化利率显示
	 * @param number
	 * @return
	 */
	public static BigDecimal rateFormat(BigDecimal number) {
		number = number.setScale(BidConst.STORE_SCALE, RoundingMode.HALF_UP);
		return number;
	}


	public static BigDecimal decimalRateFormat(BigDecimal number) {
		return number.multiply(BigDecimal.valueOf(100));
	}

	/**
	 * 格式化月利率显示
	 * @param number
	 * @return
	 */
	public static BigDecimal monthRateFormat(BigDecimal number) {
		return number.multiply(BigDecimal.valueOf(100)).divide(
				BigDecimal.valueOf(12), BidConst.CAL_SCALE,
				RoundingMode.HALF_UP);
	}


	public static BigDecimal formatBigDecimal(BigDecimal data, int scal) {
		if (null == data) {
			return new BigDecimal(0.00);
		}
		return data.setScale(scal, BigDecimal.ROUND_HALF_UP);
	}
}
