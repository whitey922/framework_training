package utils;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class IFinanceStringUtils {
    private IFinanceStringUtils(){}

    public static BigDecimal getValueAsDecimal(String value) {
        return new BigDecimal(StringUtils.deleteWhitespace(value));
    }

    public static BigDecimal roundValue(String value, int countToRound, RoundingMode mode) {
        return getValueAsDecimal(value).setScale(countToRound, mode);
    }
}
