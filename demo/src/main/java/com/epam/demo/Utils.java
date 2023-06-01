package com.epam.demo;

import com.epam.utils.StringUtils;
import java.util.*;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().allMatch(StringUtils::isPositiveNumber);
    }
}