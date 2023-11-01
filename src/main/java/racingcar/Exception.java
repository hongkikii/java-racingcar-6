package racingcar;

import static java.util.Objects.isNull;
import static racingcar.Constants.CAR_NAME_MAX;

import java.util.Arrays;

public class Exception {

    public static void checkEmptyCarName(String[] nameArray) {
        if (nameArray.length == 0) {
            throwIllegalArgumentException();
        }
    }

    public static void checkCarNameLengthOver(String[] nameArray) {
        Arrays.stream(nameArray)
                .filter(name -> name.length() > CAR_NAME_MAX)
                .findAny()
                .ifPresent(name -> throwIllegalArgumentException());
    }

    public static void checkInteger(Integer integer) {
        if (isNull(integer)) {
            throwIllegalArgumentException();
        }
    }

    public static void checkPositive(Integer number) {
        if (number <= 0) {
            throwIllegalArgumentException();
        }
    }

    private static void throwIllegalArgumentException() {
        throw new IllegalArgumentException();
    }
}
