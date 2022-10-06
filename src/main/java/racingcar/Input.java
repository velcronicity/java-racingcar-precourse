package racingcar;

import static camp.nextstep.edu.missionutils.Console.*;
import static java.util.Arrays.*;
import static racingcar.ValidateUtil.*;

import java.util.List;

public class Input {
    public static List<String> readCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] names = readLine().split(",");
        for (String name : names) {
            isValidCarName(name);
        }
        //todo 중복체크
        return asList(names);
    }

    public static int readCount() {
        System.out.println("시도할 회수");
        String count = readLine();
        isValidCount(count);
        return Integer.parseInt(count);
    }
}
