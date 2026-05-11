/**
 * 이 파일 뭐 하는 파일이 어쩌구
 * 수정이력 :
 *            v001  cC25807 park PT-00231 이 작업 뭐한거임
 *            v002  cC25807 park PT-00232 이 작업 뭐한거임
 *            v003  cC25807 park PT-00233 이 작업 뭐한거임
 *            v004  cC25807 park PT-00234 이 작업 뭐한거임
 *            v005  cC25807 park PT-00235 이 작업 뭐한거임
 *            v006  cC25807 park PT-00236 이 작업 뭐한거임
 *            v007  cC25807 park PT-00237 이 작업 뭐한거임
 */
package com.msa4java.edu.enumeration;

public enum Week {
    /** V002 del Start
        private Week MONDAY = new Week("월요일");
        private Week TUESDAY = new Week("화요일");
        private Week WEDNESDAY = new Week("수요일");
        private Week THURSDAY = new Week("목요일");
        private Week FRIDAY = new Week("금요일");
        private Week SATURDAY = new Week("토요일");
        private Week SUNDAY = new Week("일요일");
     V002 del end
    */

    MONDAY("월요일")       // V002 add
    ,TUESDAY("화요일")     // V002 add
    ,WEDNESDAY("수요일")   // V002 add
    ,THURSDAY("목요일")    // V002 add
    ,FRIDAY("금요일")      // V002 add
    ,SATURDAY("토요일")    // V002 add
    ,SUNDAY("일요일");     // V002 add

    private final String krDay;

    private Week(String day) {
        this.krDay = day;
    }

    // Getter
    public String getKrDay() {
        return this.krDay;
    }
}