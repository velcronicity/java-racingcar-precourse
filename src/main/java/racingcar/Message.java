package racingcar;

public class Message {
    private Message() {
        //do not construct this class
    }

    public static final String INPUT_ERROR_CAR_NAME = "자동차 이름은 5자리 이하만 가능합니다.";
    public static final String INPUT_ERROR_CAR_NAME_DUPLICATE = "자동차 이름은 중복될 수 없습니다.";
    public static final String INPUT_ERROR_COUNT = "시도할 횟수는 1이상의 숫자만 가능합니다.";
    public static final String INTERNAL_ERROR_RANDOM_NUMBER = "랜덤값 이상.";
    public static final String FINAL_WINNER_MESSAGE = "최종 우승자 : ";

}
