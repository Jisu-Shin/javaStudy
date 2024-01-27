public class UmsDate {
    private int year;
    private int month;
    private int day;

    UmsDate(int year, int month, int day) {
        if (isValidDate()){
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    // 날짜값 유효성 검증
    private boolean isValidDate() {
        return true;
    }
}
