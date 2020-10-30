let year_init = 1901;
const year_fin = 2000;
let month = 1;
let day = 1;
let maxDays;
let daycounter = 0;
let dayName;
let i=0;
//loop through all years between init year and final year
for (; year_init <= year_fin; year_init++) {

    month = 1;
    //loop through all the months
    for (; month <= 12; month++) {
        day = 1;
        //checks for months with 31 days
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            maxDays = 31;
        }

        //for february
        else if (month == 2) {

            //if it is a century
            if (year_init % 400 == 0) {
                maxDays = 29;
                alert('leap year');
            }

            // if not a century but divisable by 4
            else if (year_init % 100 != 0 && year_init % 4 == 0) {
                maxDays = 29;
            }

            //not a century not divisable by 4
            else {
                maxDays = 28;
            }

        }
        // rest of the months
        else {
            maxDays = 30;
        }


        for (; day <= maxDays; day++) {
            daycounter++;
            switch (daycounter % 7) {
                case 0:
                    dayName = 'Monday';
                    break;
                case 1:
                    dayName = 'Tuesday';
                    break;
                case 2:
                    dayName = 'Wednesday';
                    break;
                case 3:
                    dayName = 'Thursday';
                    break;
                case 4:
                    dayName = 'Friday';
                    break;
                case 5:
                    dayName = 'Saturday';
                    break;
                case 6:
                    dayName = 'Sunday';
                    break;
            }
            if(dayName=='Sunday'&&day==1){
                i++;
            }
            console.log(year_init + " " + month + " " + " " + day + " " + dayName);
        }
    }
}
alert(i);
